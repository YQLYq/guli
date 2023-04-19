<template>
  <el-dialog :visible.sync="visible" :title="!dataForm.id ? $t('add') : $t('update')" :close-on-click-modal="false" :close-on-press-escape="false">
    <el-form :model="dataForm" :rules="dataRule" ref="dataForm" @keyup.enter.native="dataFormSubmitHandle()" :label-width="$i18n.locale === 'en-US' ? '120px' : '80px'">
          <el-form-item label="order_id" prop="orderId">
          <el-input v-model="dataForm.orderId" placeholder="order_id"></el-input>
      </el-form-item>
          <el-form-item label="退货商品id" prop="skuId">
          <el-input v-model="dataForm.skuId" placeholder="退货商品id"></el-input>
      </el-form-item>
          <el-form-item label="订单编号" prop="orderSn">
          <el-input v-model="dataForm.orderSn" placeholder="订单编号"></el-input>
      </el-form-item>
          <el-form-item label="申请时间" prop="createTime">
          <el-input v-model="dataForm.createTime" placeholder="申请时间"></el-input>
      </el-form-item>
          <el-form-item label="会员用户名" prop="memberUsername">
          <el-input v-model="dataForm.memberUsername" placeholder="会员用户名"></el-input>
      </el-form-item>
          <el-form-item label="退款金额" prop="returnAmount">
          <el-input v-model="dataForm.returnAmount" placeholder="退款金额"></el-input>
      </el-form-item>
          <el-form-item label="退货人姓名" prop="returnName">
          <el-input v-model="dataForm.returnName" placeholder="退货人姓名"></el-input>
      </el-form-item>
          <el-form-item label="退货人电话" prop="returnPhone">
          <el-input v-model="dataForm.returnPhone" placeholder="退货人电话"></el-input>
      </el-form-item>
          <el-form-item label="申请状态[0->待处理；1->退货中；2->已完成；3->已拒绝]" prop="status">
          <el-input v-model="dataForm.status" placeholder="申请状态[0->待处理；1->退货中；2->已完成；3->已拒绝]"></el-input>
      </el-form-item>
          <el-form-item label="处理时间" prop="handleTime">
          <el-input v-model="dataForm.handleTime" placeholder="处理时间"></el-input>
      </el-form-item>
          <el-form-item label="商品图片" prop="skuImg">
          <el-input v-model="dataForm.skuImg" placeholder="商品图片"></el-input>
      </el-form-item>
          <el-form-item label="商品名称" prop="skuName">
          <el-input v-model="dataForm.skuName" placeholder="商品名称"></el-input>
      </el-form-item>
          <el-form-item label="商品品牌" prop="skuBrand">
          <el-input v-model="dataForm.skuBrand" placeholder="商品品牌"></el-input>
      </el-form-item>
          <el-form-item label="商品销售属性(JSON)" prop="skuAttrsVals">
          <el-input v-model="dataForm.skuAttrsVals" placeholder="商品销售属性(JSON)"></el-input>
      </el-form-item>
          <el-form-item label="退货数量" prop="skuCount">
          <el-input v-model="dataForm.skuCount" placeholder="退货数量"></el-input>
      </el-form-item>
          <el-form-item label="商品单价" prop="skuPrice">
          <el-input v-model="dataForm.skuPrice" placeholder="商品单价"></el-input>
      </el-form-item>
          <el-form-item label="商品实际支付单价" prop="skuRealPrice">
          <el-input v-model="dataForm.skuRealPrice" placeholder="商品实际支付单价"></el-input>
      </el-form-item>
          <el-form-item label="原因" prop="reason">
          <el-input v-model="dataForm.reason" placeholder="原因"></el-input>
      </el-form-item>
          <el-form-item label="描述" prop="description述">
          <el-input v-model="dataForm.description述" placeholder="描述"></el-input>
      </el-form-item>
          <el-form-item label="凭证图片，以逗号隔开" prop="descPics">
          <el-input v-model="dataForm.descPics" placeholder="凭证图片，以逗号隔开"></el-input>
      </el-form-item>
          <el-form-item label="处理备注" prop="handleNote">
          <el-input v-model="dataForm.handleNote" placeholder="处理备注"></el-input>
      </el-form-item>
          <el-form-item label="处理人员" prop="handleMan">
          <el-input v-model="dataForm.handleMan" placeholder="处理人员"></el-input>
      </el-form-item>
          <el-form-item label="收货人" prop="receiveMan">
          <el-input v-model="dataForm.receiveMan" placeholder="收货人"></el-input>
      </el-form-item>
          <el-form-item label="收货时间" prop="receiveTime">
          <el-input v-model="dataForm.receiveTime" placeholder="收货时间"></el-input>
      </el-form-item>
          <el-form-item label="收货备注" prop="receiveNote">
          <el-input v-model="dataForm.receiveNote" placeholder="收货备注"></el-input>
      </el-form-item>
          <el-form-item label="收货电话" prop="receivePhone">
          <el-input v-model="dataForm.receivePhone" placeholder="收货电话"></el-input>
      </el-form-item>
          <el-form-item label="公司收货地址" prop="companyAddress">
          <el-input v-model="dataForm.companyAddress" placeholder="公司收货地址"></el-input>
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
        skuId: '',
        orderSn: '',
        createTime: '',
        memberUsername: '',
        returnAmount: '',
        returnName: '',
        returnPhone: '',
        status: '',
        handleTime: '',
        skuImg: '',
        skuName: '',
        skuBrand: '',
        skuAttrsVals: '',
        skuCount: '',
        skuPrice: '',
        skuRealPrice: '',
        reason: '',
        description述: '',
        descPics: '',
        handleNote: '',
        handleMan: '',
        receiveMan: '',
        receiveTime: '',
        receiveNote: '',
        receivePhone: '',
        companyAddress: ''
      }
    }
  },
  computed: {
    dataRule () {
      return {
        orderId: [
          { required: true, message: this.$t('validate.required'), trigger: 'blur' }
        ],
        skuId: [
          { required: true, message: this.$t('validate.required'), trigger: 'blur' }
        ],
        orderSn: [
          { required: true, message: this.$t('validate.required'), trigger: 'blur' }
        ],
        createTime: [
          { required: true, message: this.$t('validate.required'), trigger: 'blur' }
        ],
        memberUsername: [
          { required: true, message: this.$t('validate.required'), trigger: 'blur' }
        ],
        returnAmount: [
          { required: true, message: this.$t('validate.required'), trigger: 'blur' }
        ],
        returnName: [
          { required: true, message: this.$t('validate.required'), trigger: 'blur' }
        ],
        returnPhone: [
          { required: true, message: this.$t('validate.required'), trigger: 'blur' }
        ],
        status: [
          { required: true, message: this.$t('validate.required'), trigger: 'blur' }
        ],
        handleTime: [
          { required: true, message: this.$t('validate.required'), trigger: 'blur' }
        ],
        skuImg: [
          { required: true, message: this.$t('validate.required'), trigger: 'blur' }
        ],
        skuName: [
          { required: true, message: this.$t('validate.required'), trigger: 'blur' }
        ],
        skuBrand: [
          { required: true, message: this.$t('validate.required'), trigger: 'blur' }
        ],
        skuAttrsVals: [
          { required: true, message: this.$t('validate.required'), trigger: 'blur' }
        ],
        skuCount: [
          { required: true, message: this.$t('validate.required'), trigger: 'blur' }
        ],
        skuPrice: [
          { required: true, message: this.$t('validate.required'), trigger: 'blur' }
        ],
        skuRealPrice: [
          { required: true, message: this.$t('validate.required'), trigger: 'blur' }
        ],
        reason: [
          { required: true, message: this.$t('validate.required'), trigger: 'blur' }
        ],
        description述: [
          { required: true, message: this.$t('validate.required'), trigger: 'blur' }
        ],
        descPics: [
          { required: true, message: this.$t('validate.required'), trigger: 'blur' }
        ],
        handleNote: [
          { required: true, message: this.$t('validate.required'), trigger: 'blur' }
        ],
        handleMan: [
          { required: true, message: this.$t('validate.required'), trigger: 'blur' }
        ],
        receiveMan: [
          { required: true, message: this.$t('validate.required'), trigger: 'blur' }
        ],
        receiveTime: [
          { required: true, message: this.$t('validate.required'), trigger: 'blur' }
        ],
        receiveNote: [
          { required: true, message: this.$t('validate.required'), trigger: 'blur' }
        ],
        receivePhone: [
          { required: true, message: this.$t('validate.required'), trigger: 'blur' }
        ],
        companyAddress: [
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
      this.$http.get(`/order/orderreturnapply/${this.dataForm.id}`).then(({ data: res }) => {
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
        this.$http[!this.dataForm.id ? 'post' : 'put']('/order/orderreturnapply/', this.dataForm).then(({ data: res }) => {
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
