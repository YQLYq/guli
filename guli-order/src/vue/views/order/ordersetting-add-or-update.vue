<template>
  <el-dialog :visible.sync="visible" :title="!dataForm.id ? $t('add') : $t('update')" :close-on-click-modal="false" :close-on-press-escape="false">
    <el-form :model="dataForm" :rules="dataRule" ref="dataForm" @keyup.enter.native="dataFormSubmitHandle()" :label-width="$i18n.locale === 'en-US' ? '120px' : '80px'">
          <el-form-item label="秒杀订单超时关闭时间(分)" prop="flashOrderOvertime">
          <el-input v-model="dataForm.flashOrderOvertime" placeholder="秒杀订单超时关闭时间(分)"></el-input>
      </el-form-item>
          <el-form-item label="正常订单超时时间(分)" prop="normalOrderOvertime">
          <el-input v-model="dataForm.normalOrderOvertime" placeholder="正常订单超时时间(分)"></el-input>
      </el-form-item>
          <el-form-item label="发货后自动确认收货时间（天）" prop="confirmOvertime">
          <el-input v-model="dataForm.confirmOvertime" placeholder="发货后自动确认收货时间（天）"></el-input>
      </el-form-item>
          <el-form-item label="自动完成交易时间，不能申请退货（天）" prop="finishOvertime">
          <el-input v-model="dataForm.finishOvertime" placeholder="自动完成交易时间，不能申请退货（天）"></el-input>
      </el-form-item>
          <el-form-item label="订单完成后自动好评时间（天）" prop="commentOvertime">
          <el-input v-model="dataForm.commentOvertime" placeholder="订单完成后自动好评时间（天）"></el-input>
      </el-form-item>
          <el-form-item label="会员等级【0-不限会员等级，全部通用；其他-对应的其他会员等级】" prop="memberLevel">
          <el-input v-model="dataForm.memberLevel" placeholder="会员等级【0-不限会员等级，全部通用；其他-对应的其他会员等级】"></el-input>
      </el-form-item>
      </el-form>
    <template slot="footer">
      <el-button @click="visible = false">{{ $t('cancel') }}</el-button>
      <el-button type="primary" @click="dataFormSubmitHandle()">{{ $t('confirm') }}</el-button>
    </template>
  </el-dialog>
</template>

<script>
import debounce from 'lodash/debounce'
export default {
  data () {
    return {
      visible: false,
      dataForm: {
        id: '',
        flashOrderOvertime: '',
        normalOrderOvertime: '',
        confirmOvertime: '',
        finishOvertime: '',
        commentOvertime: '',
        memberLevel: ''
      }
    }
  },
  computed: {
    dataRule () {
      return {
        flashOrderOvertime: [
          { required: true, message: this.$t('validate.required'), trigger: 'blur' }
        ],
        normalOrderOvertime: [
          { required: true, message: this.$t('validate.required'), trigger: 'blur' }
        ],
        confirmOvertime: [
          { required: true, message: this.$t('validate.required'), trigger: 'blur' }
        ],
        finishOvertime: [
          { required: true, message: this.$t('validate.required'), trigger: 'blur' }
        ],
        commentOvertime: [
          { required: true, message: this.$t('validate.required'), trigger: 'blur' }
        ],
        memberLevel: [
          { required: true, message: this.$t('validate.required'), trigger: 'blur' }
        ]
      }
    }
  },
  methods: {
    init () {
      this.visible = true
      this.$nextTick(() => {
        this.$refs['dataForm'].resetFields()
        if (this.dataForm.id) {
          this.getInfo()
        }
      })
    },
    // 获取信息
    getInfo () {
      this.$http.get(`/order/ordersetting/${this.dataForm.id}`).then(({ data: res }) => {
        if (res.code !== 0) {
          return this.$message.error(res.msg)
        }
        this.dataForm = {
          ...this.dataForm,
          ...res.data
        }
      }).catch(() => {})
    },
    // 表单提交
    dataFormSubmitHandle: debounce(function () {
      this.$refs['dataForm'].validate((valid) => {
        if (!valid) {
          return false
        }
        this.$http[!this.dataForm.id ? 'post' : 'put']('/order/ordersetting/', this.dataForm).then(({ data: res }) => {
          if (res.code !== 0) {
            return this.$message.error(res.msg)
          }
          this.$message({
            message: this.$t('prompt.success'),
            type: 'success',
            duration: 500,
            onClose: () => {
              this.visible = false
              this.$emit('refreshDataList')
            }
          })
        }).catch(() => {})
      })
    }, 1000, { 'leading': true, 'trailing': false })
  }
}
</script>
