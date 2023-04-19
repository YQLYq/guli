<template>
  <el-dialog :visible.sync="visible" :title="!dataForm.id ? $t('add') : $t('update')" :close-on-click-modal="false" :close-on-press-escape="false">
    <el-form :model="dataForm" :rules="dataRule" ref="dataForm" @keyup.enter.native="dataFormSubmitHandle()" :label-width="$i18n.locale === 'en-US' ? '120px' : '80px'">
          <el-form-item label="订单号（对外业务号）" prop="orderSn">
          <el-input v-model="dataForm.orderSn" placeholder="订单号（对外业务号）"></el-input>
      </el-form-item>
          <el-form-item label="订单id" prop="orderId">
          <el-input v-model="dataForm.orderId" placeholder="订单id"></el-input>
      </el-form-item>
          <el-form-item label="支付宝交易流水号" prop="alipayTradeNo">
          <el-input v-model="dataForm.alipayTradeNo" placeholder="支付宝交易流水号"></el-input>
      </el-form-item>
          <el-form-item label="支付总金额" prop="totalAmount">
          <el-input v-model="dataForm.totalAmount" placeholder="支付总金额"></el-input>
      </el-form-item>
          <el-form-item label="交易内容" prop="subject">
          <el-input v-model="dataForm.subject" placeholder="交易内容"></el-input>
      </el-form-item>
          <el-form-item label="支付状态" prop="paymentStatus">
          <el-input v-model="dataForm.paymentStatus" placeholder="支付状态"></el-input>
      </el-form-item>
          <el-form-item label="创建时间" prop="createTime">
          <el-input v-model="dataForm.createTime" placeholder="创建时间"></el-input>
      </el-form-item>
          <el-form-item label="确认时间" prop="confirmTime">
          <el-input v-model="dataForm.confirmTime" placeholder="确认时间"></el-input>
      </el-form-item>
          <el-form-item label="回调内容" prop="callbackContent">
          <el-input v-model="dataForm.callbackContent" placeholder="回调内容"></el-input>
      </el-form-item>
          <el-form-item label="回调时间" prop="callbackTime">
          <el-input v-model="dataForm.callbackTime" placeholder="回调时间"></el-input>
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
        orderSn: '',
        orderId: '',
        alipayTradeNo: '',
        totalAmount: '',
        subject: '',
        paymentStatus: '',
        createTime: '',
        confirmTime: '',
        callbackContent: '',
        callbackTime: ''
      }
    }
  },
  computed: {
    dataRule () {
      return {
        orderSn: [
          { required: true, message: this.$t('validate.required'), trigger: 'blur' }
        ],
        orderId: [
          { required: true, message: this.$t('validate.required'), trigger: 'blur' }
        ],
        alipayTradeNo: [
          { required: true, message: this.$t('validate.required'), trigger: 'blur' }
        ],
        totalAmount: [
          { required: true, message: this.$t('validate.required'), trigger: 'blur' }
        ],
        subject: [
          { required: true, message: this.$t('validate.required'), trigger: 'blur' }
        ],
        paymentStatus: [
          { required: true, message: this.$t('validate.required'), trigger: 'blur' }
        ],
        createTime: [
          { required: true, message: this.$t('validate.required'), trigger: 'blur' }
        ],
        confirmTime: [
          { required: true, message: this.$t('validate.required'), trigger: 'blur' }
        ],
        callbackContent: [
          { required: true, message: this.$t('validate.required'), trigger: 'blur' }
        ],
        callbackTime: [
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
      this.$http.get(`/order/paymentinfo/${this.dataForm.id}`).then(({ data: res }) => {
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
        this.$http[!this.dataForm.id ? 'post' : 'put']('/order/paymentinfo/', this.dataForm).then(({ data: res }) => {
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
