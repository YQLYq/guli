<template>
  <el-dialog :visible.sync="visible" :title="!dataForm.id ? $t('add') : $t('update')" :close-on-click-modal="false" :close-on-press-escape="false">
    <el-form :model="dataForm" :rules="dataRule" ref="dataForm" @keyup.enter.native="dataFormSubmitHandle()" :label-width="$i18n.locale === 'en-US' ? '120px' : '80px'">
          <el-form-item label="member_id" prop="memberId">
          <el-input v-model="dataForm.memberId" placeholder="member_id"></el-input>
      </el-form-item>
          <el-form-item label="订单号" prop="orderSn">
          <el-input v-model="dataForm.orderSn" placeholder="订单号"></el-input>
      </el-form-item>
          <el-form-item label="使用的优惠券" prop="couponId">
          <el-input v-model="dataForm.couponId" placeholder="使用的优惠券"></el-input>
      </el-form-item>
          <el-form-item label="create_time" prop="createTime">
          <el-input v-model="dataForm.createTime" placeholder="create_time"></el-input>
      </el-form-item>
          <el-form-item label="用户名" prop="memberUsername">
          <el-input v-model="dataForm.memberUsername" placeholder="用户名"></el-input>
      </el-form-item>
          <el-form-item label="订单总额" prop="totalAmount">
          <el-input v-model="dataForm.totalAmount" placeholder="订单总额"></el-input>
      </el-form-item>
          <el-form-item label="应付总额" prop="payAmount">
          <el-input v-model="dataForm.payAmount" placeholder="应付总额"></el-input>
      </el-form-item>
          <el-form-item label="运费金额" prop="freightAmount">
          <el-input v-model="dataForm.freightAmount" placeholder="运费金额"></el-input>
      </el-form-item>
          <el-form-item label="促销优化金额（促销价、满减、阶梯价）" prop="promotionAmount">
          <el-input v-model="dataForm.promotionAmount" placeholder="促销优化金额（促销价、满减、阶梯价）"></el-input>
      </el-form-item>
          <el-form-item label="积分抵扣金额" prop="integrationAmount">
          <el-input v-model="dataForm.integrationAmount" placeholder="积分抵扣金额"></el-input>
      </el-form-item>
          <el-form-item label="优惠券抵扣金额" prop="couponAmount">
          <el-input v-model="dataForm.couponAmount" placeholder="优惠券抵扣金额"></el-input>
      </el-form-item>
          <el-form-item label="后台调整订单使用的折扣金额" prop="discountAmount">
          <el-input v-model="dataForm.discountAmount" placeholder="后台调整订单使用的折扣金额"></el-input>
      </el-form-item>
          <el-form-item label="支付方式【1->支付宝；2->微信；3->银联； 4->货到付款；】" prop="payType">
          <el-input v-model="dataForm.payType" placeholder="支付方式【1->支付宝；2->微信；3->银联； 4->货到付款；】"></el-input>
      </el-form-item>
          <el-form-item label="订单来源[0->PC订单；1->app订单]" prop="sourceType">
          <el-input v-model="dataForm.sourceType" placeholder="订单来源[0->PC订单；1->app订单]"></el-input>
      </el-form-item>
          <el-form-item label="订单状态【0->待付款；1->待发货；2->已发货；3->已完成；4->已关闭；5->无效订单】" prop="status">
          <el-input v-model="dataForm.status" placeholder="订单状态【0->待付款；1->待发货；2->已发货；3->已完成；4->已关闭；5->无效订单】"></el-input>
      </el-form-item>
          <el-form-item label="物流公司(配送方式)" prop="deliveryCompany">
          <el-input v-model="dataForm.deliveryCompany" placeholder="物流公司(配送方式)"></el-input>
      </el-form-item>
          <el-form-item label="物流单号" prop="deliverySn">
          <el-input v-model="dataForm.deliverySn" placeholder="物流单号"></el-input>
      </el-form-item>
          <el-form-item label="自动确认时间（天）" prop="autoConfirmDay">
          <el-input v-model="dataForm.autoConfirmDay" placeholder="自动确认时间（天）"></el-input>
      </el-form-item>
          <el-form-item label="可以获得的积分" prop="integration">
          <el-input v-model="dataForm.integration" placeholder="可以获得的积分"></el-input>
      </el-form-item>
          <el-form-item label="可以获得的成长值" prop="growth">
          <el-input v-model="dataForm.growth" placeholder="可以获得的成长值"></el-input>
      </el-form-item>
          <el-form-item label="发票类型[0->不开发票；1->电子发票；2->纸质发票]" prop="billType">
          <el-input v-model="dataForm.billType" placeholder="发票类型[0->不开发票；1->电子发票；2->纸质发票]"></el-input>
      </el-form-item>
          <el-form-item label="发票抬头" prop="billHeader">
          <el-input v-model="dataForm.billHeader" placeholder="发票抬头"></el-input>
      </el-form-item>
          <el-form-item label="发票内容" prop="billContent">
          <el-input v-model="dataForm.billContent" placeholder="发票内容"></el-input>
      </el-form-item>
          <el-form-item label="收票人电话" prop="billReceiverPhone">
          <el-input v-model="dataForm.billReceiverPhone" placeholder="收票人电话"></el-input>
      </el-form-item>
          <el-form-item label="收票人邮箱" prop="billReceiverEmail">
          <el-input v-model="dataForm.billReceiverEmail" placeholder="收票人邮箱"></el-input>
      </el-form-item>
          <el-form-item label="收货人姓名" prop="receiverName">
          <el-input v-model="dataForm.receiverName" placeholder="收货人姓名"></el-input>
      </el-form-item>
          <el-form-item label="收货人电话" prop="receiverPhone">
          <el-input v-model="dataForm.receiverPhone" placeholder="收货人电话"></el-input>
      </el-form-item>
          <el-form-item label="收货人邮编" prop="receiverPostCode">
          <el-input v-model="dataForm.receiverPostCode" placeholder="收货人邮编"></el-input>
      </el-form-item>
          <el-form-item label="省份/直辖市" prop="receiverProvince">
          <el-input v-model="dataForm.receiverProvince" placeholder="省份/直辖市"></el-input>
      </el-form-item>
          <el-form-item label="城市" prop="receiverCity">
          <el-input v-model="dataForm.receiverCity" placeholder="城市"></el-input>
      </el-form-item>
          <el-form-item label="区" prop="receiverRegion">
          <el-input v-model="dataForm.receiverRegion" placeholder="区"></el-input>
      </el-form-item>
          <el-form-item label="详细地址" prop="receiverDetailAddress">
          <el-input v-model="dataForm.receiverDetailAddress" placeholder="详细地址"></el-input>
      </el-form-item>
          <el-form-item label="订单备注" prop="note">
          <el-input v-model="dataForm.note" placeholder="订单备注"></el-input>
      </el-form-item>
          <el-form-item label="确认收货状态[0->未确认；1->已确认]" prop="confirmStatus">
          <el-input v-model="dataForm.confirmStatus" placeholder="确认收货状态[0->未确认；1->已确认]"></el-input>
      </el-form-item>
          <el-form-item label="删除状态【0->未删除；1->已删除】" prop="deleteStatus">
          <el-input v-model="dataForm.deleteStatus" placeholder="删除状态【0->未删除；1->已删除】"></el-input>
      </el-form-item>
          <el-form-item label="下单时使用的积分" prop="useIntegration">
          <el-input v-model="dataForm.useIntegration" placeholder="下单时使用的积分"></el-input>
      </el-form-item>
          <el-form-item label="支付时间" prop="paymentTime">
          <el-input v-model="dataForm.paymentTime" placeholder="支付时间"></el-input>
      </el-form-item>
          <el-form-item label="发货时间" prop="deliveryTime">
          <el-input v-model="dataForm.deliveryTime" placeholder="发货时间"></el-input>
      </el-form-item>
          <el-form-item label="确认收货时间" prop="receiveTime">
          <el-input v-model="dataForm.receiveTime" placeholder="确认收货时间"></el-input>
      </el-form-item>
          <el-form-item label="评价时间" prop="commentTime">
          <el-input v-model="dataForm.commentTime" placeholder="评价时间"></el-input>
      </el-form-item>
          <el-form-item label="修改时间" prop="modifyTime">
          <el-input v-model="dataForm.modifyTime" placeholder="修改时间"></el-input>
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
        memberId: '',
        orderSn: '',
        couponId: '',
        createTime: '',
        memberUsername: '',
        totalAmount: '',
        payAmount: '',
        freightAmount: '',
        promotionAmount: '',
        integrationAmount: '',
        couponAmount: '',
        discountAmount: '',
        payType: '',
        sourceType: '',
        status: '',
        deliveryCompany: '',
        deliverySn: '',
        autoConfirmDay: '',
        integration: '',
        growth: '',
        billType: '',
        billHeader: '',
        billContent: '',
        billReceiverPhone: '',
        billReceiverEmail: '',
        receiverName: '',
        receiverPhone: '',
        receiverPostCode: '',
        receiverProvince: '',
        receiverCity: '',
        receiverRegion: '',
        receiverDetailAddress: '',
        note: '',
        confirmStatus: '',
        deleteStatus: '',
        useIntegration: '',
        paymentTime: '',
        deliveryTime: '',
        receiveTime: '',
        commentTime: '',
        modifyTime: ''
      }
    }
  },
  computed: {
    dataRule () {
      return {
        memberId: [
          { required: true, message: this.$t('validate.required'), trigger: 'blur' }
        ],
        orderSn: [
          { required: true, message: this.$t('validate.required'), trigger: 'blur' }
        ],
        couponId: [
          { required: true, message: this.$t('validate.required'), trigger: 'blur' }
        ],
        createTime: [
          { required: true, message: this.$t('validate.required'), trigger: 'blur' }
        ],
        memberUsername: [
          { required: true, message: this.$t('validate.required'), trigger: 'blur' }
        ],
        totalAmount: [
          { required: true, message: this.$t('validate.required'), trigger: 'blur' }
        ],
        payAmount: [
          { required: true, message: this.$t('validate.required'), trigger: 'blur' }
        ],
        freightAmount: [
          { required: true, message: this.$t('validate.required'), trigger: 'blur' }
        ],
        promotionAmount: [
          { required: true, message: this.$t('validate.required'), trigger: 'blur' }
        ],
        integrationAmount: [
          { required: true, message: this.$t('validate.required'), trigger: 'blur' }
        ],
        couponAmount: [
          { required: true, message: this.$t('validate.required'), trigger: 'blur' }
        ],
        discountAmount: [
          { required: true, message: this.$t('validate.required'), trigger: 'blur' }
        ],
        payType: [
          { required: true, message: this.$t('validate.required'), trigger: 'blur' }
        ],
        sourceType: [
          { required: true, message: this.$t('validate.required'), trigger: 'blur' }
        ],
        status: [
          { required: true, message: this.$t('validate.required'), trigger: 'blur' }
        ],
        deliveryCompany: [
          { required: true, message: this.$t('validate.required'), trigger: 'blur' }
        ],
        deliverySn: [
          { required: true, message: this.$t('validate.required'), trigger: 'blur' }
        ],
        autoConfirmDay: [
          { required: true, message: this.$t('validate.required'), trigger: 'blur' }
        ],
        integration: [
          { required: true, message: this.$t('validate.required'), trigger: 'blur' }
        ],
        growth: [
          { required: true, message: this.$t('validate.required'), trigger: 'blur' }
        ],
        billType: [
          { required: true, message: this.$t('validate.required'), trigger: 'blur' }
        ],
        billHeader: [
          { required: true, message: this.$t('validate.required'), trigger: 'blur' }
        ],
        billContent: [
          { required: true, message: this.$t('validate.required'), trigger: 'blur' }
        ],
        billReceiverPhone: [
          { required: true, message: this.$t('validate.required'), trigger: 'blur' }
        ],
        billReceiverEmail: [
          { required: true, message: this.$t('validate.required'), trigger: 'blur' }
        ],
        receiverName: [
          { required: true, message: this.$t('validate.required'), trigger: 'blur' }
        ],
        receiverPhone: [
          { required: true, message: this.$t('validate.required'), trigger: 'blur' }
        ],
        receiverPostCode: [
          { required: true, message: this.$t('validate.required'), trigger: 'blur' }
        ],
        receiverProvince: [
          { required: true, message: this.$t('validate.required'), trigger: 'blur' }
        ],
        receiverCity: [
          { required: true, message: this.$t('validate.required'), trigger: 'blur' }
        ],
        receiverRegion: [
          { required: true, message: this.$t('validate.required'), trigger: 'blur' }
        ],
        receiverDetailAddress: [
          { required: true, message: this.$t('validate.required'), trigger: 'blur' }
        ],
        note: [
          { required: true, message: this.$t('validate.required'), trigger: 'blur' }
        ],
        confirmStatus: [
          { required: true, message: this.$t('validate.required'), trigger: 'blur' }
        ],
        deleteStatus: [
          { required: true, message: this.$t('validate.required'), trigger: 'blur' }
        ],
        useIntegration: [
          { required: true, message: this.$t('validate.required'), trigger: 'blur' }
        ],
        paymentTime: [
          { required: true, message: this.$t('validate.required'), trigger: 'blur' }
        ],
        deliveryTime: [
          { required: true, message: this.$t('validate.required'), trigger: 'blur' }
        ],
        receiveTime: [
          { required: true, message: this.$t('validate.required'), trigger: 'blur' }
        ],
        commentTime: [
          { required: true, message: this.$t('validate.required'), trigger: 'blur' }
        ],
        modifyTime: [
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
      this.$http.get(`/order/order/${this.dataForm.id}`).then(({ data: res }) => {
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
        this.$http[!this.dataForm.id ? 'post' : 'put']('/order/order/', this.dataForm).then(({ data: res }) => {
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
