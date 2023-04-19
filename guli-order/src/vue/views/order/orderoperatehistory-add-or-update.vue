<template>
  <el-dialog :visible.sync="visible" :title="!dataForm.id ? $t('add') : $t('update')" :close-on-click-modal="false" :close-on-press-escape="false">
    <el-form :model="dataForm" :rules="dataRule" ref="dataForm" @keyup.enter.native="dataFormSubmitHandle()" :label-width="$i18n.locale === 'en-US' ? '120px' : '80px'">
          <el-form-item label="订单id" prop="orderId">
          <el-input v-model="dataForm.orderId" placeholder="订单id"></el-input>
      </el-form-item>
          <el-form-item label="操作人[用户；系统；后台管理员]" prop="operateMan">
          <el-input v-model="dataForm.operateMan" placeholder="操作人[用户；系统；后台管理员]"></el-input>
      </el-form-item>
          <el-form-item label="操作时间" prop="createTime">
          <el-input v-model="dataForm.createTime" placeholder="操作时间"></el-input>
      </el-form-item>
          <el-form-item label="订单状态【0->待付款；1->待发货；2->已发货；3->已完成；4->已关闭；5->无效订单】" prop="orderStatus">
          <el-input v-model="dataForm.orderStatus" placeholder="订单状态【0->待付款；1->待发货；2->已发货；3->已完成；4->已关闭；5->无效订单】"></el-input>
      </el-form-item>
          <el-form-item label="备注" prop="note">
          <el-input v-model="dataForm.note" placeholder="备注"></el-input>
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
        orderId: '',
        operateMan: '',
        createTime: '',
        orderStatus: '',
        note: ''
      }
    }
  },
  computed: {
    dataRule () {
      return {
        orderId: [
          { required: true, message: this.$t('validate.required'), trigger: 'blur' }
        ],
        operateMan: [
          { required: true, message: this.$t('validate.required'), trigger: 'blur' }
        ],
        createTime: [
          { required: true, message: this.$t('validate.required'), trigger: 'blur' }
        ],
        orderStatus: [
          { required: true, message: this.$t('validate.required'), trigger: 'blur' }
        ],
        note: [
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
      this.$http.get(`/order/orderoperatehistory/${this.dataForm.id}`).then(({ data: res }) => {
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
        this.$http[!this.dataForm.id ? 'post' : 'put']('/order/orderoperatehistory/', this.dataForm).then(({ data: res }) => {
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
