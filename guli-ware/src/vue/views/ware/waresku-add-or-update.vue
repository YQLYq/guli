<template>
  <el-dialog :visible.sync="visible" :title="!dataForm.id ? $t('add') : $t('update')" :close-on-click-modal="false" :close-on-press-escape="false">
    <el-form :model="dataForm" :rules="dataRule" ref="dataForm" @keyup.enter.native="dataFormSubmitHandle()" :label-width="$i18n.locale === 'en-US' ? '120px' : '80px'">
          <el-form-item label="sku_id" prop="skuId">
          <el-input v-model="dataForm.skuId" placeholder="sku_id"></el-input>
      </el-form-item>
          <el-form-item label="仓库id" prop="wareId">
          <el-input v-model="dataForm.wareId" placeholder="仓库id"></el-input>
      </el-form-item>
          <el-form-item label="库存数" prop="stock">
          <el-input v-model="dataForm.stock" placeholder="库存数"></el-input>
      </el-form-item>
          <el-form-item label="sku_name" prop="skuName">
          <el-input v-model="dataForm.skuName" placeholder="sku_name"></el-input>
      </el-form-item>
          <el-form-item label="锁定库存" prop="stockLocked">
          <el-input v-model="dataForm.stockLocked" placeholder="锁定库存"></el-input>
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
        skuId: '',
        wareId: '',
        stock: '',
        skuName: '',
        stockLocked: ''
      }
    }
  },
  computed: {
    dataRule () {
      return {
        skuId: [
          { required: true, message: this.$t('validate.required'), trigger: 'blur' }
        ],
        wareId: [
          { required: true, message: this.$t('validate.required'), trigger: 'blur' }
        ],
        stock: [
          { required: true, message: this.$t('validate.required'), trigger: 'blur' }
        ],
        skuName: [
          { required: true, message: this.$t('validate.required'), trigger: 'blur' }
        ],
        stockLocked: [
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
      this.$http.get(`/ware/waresku/${this.dataForm.id}`).then(({ data: res }) => {
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
        this.$http[!this.dataForm.id ? 'post' : 'put']('/ware/waresku/', this.dataForm).then(({ data: res }) => {
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
