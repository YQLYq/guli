<template>
  <el-dialog :visible.sync="visible" :title="!dataForm.id ? $t('add') : $t('update')" :close-on-click-modal="false" :close-on-press-escape="false">
    <el-form :model="dataForm" :rules="dataRule" ref="dataForm" @keyup.enter.native="dataFormSubmitHandle()" :label-width="$i18n.locale === 'en-US' ? '120px' : '80px'">
          <el-form-item label="order_id" prop="orderId">
          <el-input v-model="dataForm.orderId" placeholder="order_id"></el-input>
      </el-form-item>
          <el-form-item label="order_sn" prop="orderSn">
          <el-input v-model="dataForm.orderSn" placeholder="order_sn"></el-input>
      </el-form-item>
          <el-form-item label="spu_id" prop="spuId">
          <el-input v-model="dataForm.spuId" placeholder="spu_id"></el-input>
      </el-form-item>
          <el-form-item label="spu_name" prop="spuName">
          <el-input v-model="dataForm.spuName" placeholder="spu_name"></el-input>
      </el-form-item>
          <el-form-item label="spu_pic" prop="spuPic">
          <el-input v-model="dataForm.spuPic" placeholder="spu_pic"></el-input>
      </el-form-item>
          <el-form-item label="品牌" prop="spuBrand">
          <el-input v-model="dataForm.spuBrand" placeholder="品牌"></el-input>
      </el-form-item>
          <el-form-item label="商品分类id" prop="categoryId">
          <el-input v-model="dataForm.categoryId" placeholder="商品分类id"></el-input>
      </el-form-item>
          <el-form-item label="商品sku编号" prop="skuId">
          <el-input v-model="dataForm.skuId" placeholder="商品sku编号"></el-input>
      </el-form-item>
          <el-form-item label="商品sku名字" prop="skuName">
          <el-input v-model="dataForm.skuName" placeholder="商品sku名字"></el-input>
      </el-form-item>
          <el-form-item label="商品sku图片" prop="skuPic">
          <el-input v-model="dataForm.skuPic" placeholder="商品sku图片"></el-input>
      </el-form-item>
          <el-form-item label="商品sku价格" prop="skuPrice">
          <el-input v-model="dataForm.skuPrice" placeholder="商品sku价格"></el-input>
      </el-form-item>
          <el-form-item label="商品购买的数量" prop="skuQuantity">
          <el-input v-model="dataForm.skuQuantity" placeholder="商品购买的数量"></el-input>
      </el-form-item>
          <el-form-item label="商品销售属性组合（JSON）" prop="skuAttrsVals">
          <el-input v-model="dataForm.skuAttrsVals" placeholder="商品销售属性组合（JSON）"></el-input>
      </el-form-item>
          <el-form-item label="商品促销分解金额" prop="promotionAmount">
          <el-input v-model="dataForm.promotionAmount" placeholder="商品促销分解金额"></el-input>
      </el-form-item>
          <el-form-item label="优惠券优惠分解金额" prop="couponAmount">
          <el-input v-model="dataForm.couponAmount" placeholder="优惠券优惠分解金额"></el-input>
      </el-form-item>
          <el-form-item label="积分优惠分解金额" prop="integrationAmount">
          <el-input v-model="dataForm.integrationAmount" placeholder="积分优惠分解金额"></el-input>
      </el-form-item>
          <el-form-item label="该商品经过优惠后的分解金额" prop="realAmount">
          <el-input v-model="dataForm.realAmount" placeholder="该商品经过优惠后的分解金额"></el-input>
      </el-form-item>
          <el-form-item label="赠送积分" prop="giftIntegration">
          <el-input v-model="dataForm.giftIntegration" placeholder="赠送积分"></el-input>
      </el-form-item>
          <el-form-item label="赠送成长值" prop="giftGrowth">
          <el-input v-model="dataForm.giftGrowth" placeholder="赠送成长值"></el-input>
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
        orderSn: '',
        spuId: '',
        spuName: '',
        spuPic: '',
        spuBrand: '',
        categoryId: '',
        skuId: '',
        skuName: '',
        skuPic: '',
        skuPrice: '',
        skuQuantity: '',
        skuAttrsVals: '',
        promotionAmount: '',
        couponAmount: '',
        integrationAmount: '',
        realAmount: '',
        giftIntegration: '',
        giftGrowth: ''
      }
    }
  },
  computed: {
    dataRule () {
      return {
        orderId: [
          { required: true, message: this.$t('validate.required'), trigger: 'blur' }
        ],
        orderSn: [
          { required: true, message: this.$t('validate.required'), trigger: 'blur' }
        ],
        spuId: [
          { required: true, message: this.$t('validate.required'), trigger: 'blur' }
        ],
        spuName: [
          { required: true, message: this.$t('validate.required'), trigger: 'blur' }
        ],
        spuPic: [
          { required: true, message: this.$t('validate.required'), trigger: 'blur' }
        ],
        spuBrand: [
          { required: true, message: this.$t('validate.required'), trigger: 'blur' }
        ],
        categoryId: [
          { required: true, message: this.$t('validate.required'), trigger: 'blur' }
        ],
        skuId: [
          { required: true, message: this.$t('validate.required'), trigger: 'blur' }
        ],
        skuName: [
          { required: true, message: this.$t('validate.required'), trigger: 'blur' }
        ],
        skuPic: [
          { required: true, message: this.$t('validate.required'), trigger: 'blur' }
        ],
        skuPrice: [
          { required: true, message: this.$t('validate.required'), trigger: 'blur' }
        ],
        skuQuantity: [
          { required: true, message: this.$t('validate.required'), trigger: 'blur' }
        ],
        skuAttrsVals: [
          { required: true, message: this.$t('validate.required'), trigger: 'blur' }
        ],
        promotionAmount: [
          { required: true, message: this.$t('validate.required'), trigger: 'blur' }
        ],
        couponAmount: [
          { required: true, message: this.$t('validate.required'), trigger: 'blur' }
        ],
        integrationAmount: [
          { required: true, message: this.$t('validate.required'), trigger: 'blur' }
        ],
        realAmount: [
          { required: true, message: this.$t('validate.required'), trigger: 'blur' }
        ],
        giftIntegration: [
          { required: true, message: this.$t('validate.required'), trigger: 'blur' }
        ],
        giftGrowth: [
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
      this.$http.get(`/order/orderitem/${this.dataForm.id}`).then(({ data: res }) => {
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
        this.$http[!this.dataForm.id ? 'post' : 'put']('/order/orderitem/', this.dataForm).then(({ data: res }) => {
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
