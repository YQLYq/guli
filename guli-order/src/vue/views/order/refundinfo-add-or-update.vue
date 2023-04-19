<template>
  <el-dialog :visible.sync="visible" :title="!dataForm.id ? $t('add') : $t('update')" :close-on-click-modal="false" :close-on-press-escape="false">
    <el-form :model="dataForm" :rules="dataRule" ref="dataForm" @keyup.enter.native="dataFormSubmitHandle()" :label-width="$i18n.locale === 'en-US' ? '120px' : '80px'">
          <el-form-item label="退款的订单" prop="orderReturnId">
          <el-input v-model="dataForm.orderReturnId" placeholder="退款的订单"></el-input>
      </el-form-item>
          <el-form-item label="退款金额" prop="refund">
          <el-input v-model="dataForm.refund" placeholder="退款金额"></el-input>
      </el-form-item>
          <el-form-item label="退款交易流水号" prop="refundSn">
          <el-input v-model="dataForm.refundSn" placeholder="退款交易流水号"></el-input>
      </el-form-item>
          <el-form-item label="退款状态" prop="refundStatus">
          <el-input v-model="dataForm.refundStatus" placeholder="退款状态"></el-input>
      </el-form-item>
          <el-form-item label="退款渠道[1-支付宝，2-微信，3-银联，4-汇款]" prop="refundChannel">
          <el-input v-model="dataForm.refundChannel" placeholder="退款渠道[1-支付宝，2-微信，3-银联，4-汇款]"></el-input>
      </el-form-item>
          <el-form-item label="" prop="refundContent">
          <el-input v-model="dataForm.refundContent" placeholder=""></el-input>
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
        orderReturnId: '',
        refund: '',
        refundSn: '',
        refundStatus: '',
        refundChannel: '',
        refundContent: ''
      }
    }
  },
  computed: {
    dataRule () {
      return {
        orderReturnId: [
          { required: true, message: this.$t('validate.required'), trigger: 'blur' }
        ],
        refund: [
          { required: true, message: this.$t('validate.required'), trigger: 'blur' }
        ],
        refundSn: [
          { required: true, message: this.$t('validate.required'), trigger: 'blur' }
        ],
        refundStatus: [
          { required: true, message: this.$t('validate.required'), trigger: 'blur' }
        ],
        refundChannel: [
          { required: true, message: this.$t('validate.required'), trigger: 'blur' }
        ],
        refundContent: [
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
      this.$http.get(`/order/refundinfo/${this.dataForm.id}`).then(({ data: res }) => {
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
        this.$http[!this.dataForm.id ? 'post' : 'put']('/order/refundinfo/', this.dataForm).then(({ data: res }) => {
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
