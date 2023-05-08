
<template>
  <el-dialog
    :visible.sync="visible"
    :title="!dataForm.id ? $t('add') : $t('update')"
    :close-on-click-modal="false"
    :close-on-press-escape="false"
    :before-close="beforeClose"
  >
    <el-form
      :model="dataForm"
      :rules="dataRule"
      ref="dataForm"
      @keyup.enter.native="dataFormSubmitHandle()"
      :label-width="$i18n.locale === 'en-US' ? '120px' : '80px'"
    >
      <el-form-item label="组名" prop="attrGroupName">
        <el-input
          v-model="dataForm.attrGroupName"
          placeholder="组名"
        ></el-input>
      </el-form-item>
      <el-form-item label="排序" prop="sort">
        <el-input v-model="dataForm.sort" placeholder="排序"></el-input>
      </el-form-item>
      <el-form-item label="描述" prop="descript">
        <el-input v-model="dataForm.descript" placeholder="描述"></el-input>
      </el-form-item>
      <el-form-item label="组图标" prop="icon">
        <el-input v-model="dataForm.icon" placeholder="组图标"></el-input>
      </el-form-item>
      <el-form-item label="所属分类id" prop="catelogId">
        <el-cascader
          v-model="dataForm.catelogIds"
          :options="options"
          @change="handleChange"
          placeholder="请选择或者输入搜索"
          :props="props"
          clearable
          :show-all-levels="false"
          filterable
        ></el-cascader>
      </el-form-item>
    </el-form>
    <template slot="footer">
      <el-button @click="cancel">{{ $t('cancel') }}</el-button>
      <el-button type="primary" @click="dataFormSubmitHandle()">{{
        $t('confirm')
      }}</el-button>
    </template>
  </el-dialog>
</template>

<script>
import debounce from 'lodash/debounce'

export default {
  data() {
    return {
      props: {
        value: 'catId',
        label: 'name',
        children: 'children',
      },
      visible: false,
      dataForm: {
        id: '',
        attrGroupId: '',
        attrGroupName: '',
        sort: '',
        descript: '',
        icon: '',
        catelogIds: [],
        catelogId: '',
      },
      options: [],
    }
  },
  computed: {
    dataRule() {
      return {
        attrGroupName: [
          {
            required: true,
            message: this.$t('validate.required'),
            trigger: 'blur',
          },
        ],
        sort: [
          {
            validator: (rule, value, callback) => {
              if (value === '') {
                callback(new Error('排序为空'))
              } else if (
                !Number.isInteger(parseInt(value)) ||
                parseInt(value) < 0
              ) {
                callback(new Error('排序字段必须是一个整数'))
              } else {
                callback()
              }
            },
            trigger: 'blur',
          },
        ],
        descript: [
          {
            required: true,
            message: this.$t('validate.required'),
            trigger: 'blur',
          },
        ],
        icon: [
          {
            required: true,
            message: this.$t('validate.required'),
            trigger: 'blur',
          },
        ],
        catelogId: [
          {
            required: true,
            message: this.$t('validate.required'),
            trigger: 'blur',
          },
        ],
      }
    },
  },
  created() {
    this.getOptions()
  },
  methods: {
    beforeClose() {
      this.visible = false
      Object.assign(this.$data.dataForm, this.$options.data().dataForm)
    },
    cancel() {
      this.visible = false
      Object.assign(this.$data.dataForm, this.$options.data().dataForm)
    },
    getOptions() {
      this.$http
        .get('/product/category/list/tree')
        .then((result) => {
          this.options = result.data
        })
        .catch((err) => {})
    },
    init() {
      this.visible = true
      this.$nextTick(() => {
        this.$refs['dataForm'].resetFields()
        if (this.dataForm.id) {
          this.getInfo()
        }
      })
    },
    //改变
    handleChange() {
      this.dataForm.catelogId = this.dataForm.catelogIds[
        Math.abs(this.dataForm.catelogIds.length - 1)
      ]
    },
    // 获取信息
    getInfo() {
      this.$http
        .get(`/product/attrgroup/${this.dataForm.id}`)
        .then(({ data: res }) => {
          if (res.code !== 0) {
            return this.$message.error(res.msg)
          }
          this.dataForm = {
            ...this.dataForm,
            ...res.data,
          }
        })
        .catch(() => {})
    },
    // 表单提交
    dataFormSubmitHandle: debounce(
      function() {
        this.$refs['dataForm'].validate((valid) => {
          if (!valid) {
            return false
          }
          this.$axios({
            url: '/product/attrgroup/',
            method: !this.dataForm.attrGroupId ? 'post' : 'put',
            data: this.dataForm,
          })
            .then(({ data: res }) => {
              if (res.code !== 0) {
                return this.$message.error(res.msg)
              }
              this.dataForm = this.$options.data().dataForm
              this.$message({
                message: this.$t('prompt.success'),
                type: 'success',
                duration: 500,
                onClose: () => {
                  this.visible = false
                  this.$emit('refreshDataList')
                },
              })
            })
            .catch(() => {})
        })
      },
      1000,
      { leading: true, trailing: false }
    ),
  },
}
</script>
