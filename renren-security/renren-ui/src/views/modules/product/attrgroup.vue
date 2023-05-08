<!--
 * @Description: 
 * @Version: 2.0
 * @Autor: 阳秦林
 * @Date: 2023-05-03 13:13:34
 * @LastEditors: 阳秦林
 * @LastEditTime: 2023-05-05 15:32:14
-->
<template lang="">
  <el-row :gutter="20">
    <el-col :span="6">
      <category @treeNodeClick="treenodeclick"></category>
    </el-col>
    <el-col :span="18">
      <div class="mod-product__attrgroup}">
        <el-form
          :inline="true"
          :model="dataForm"
          @keyup.enter.native="getDataList()"
        >
          <el-form-item>
            <el-input
              v-model="dataForm.key"
              placeholder="参数名"
              clearable
            ></el-input>
          </el-form-item>
          <el-form-item>
            <el-button @click="getDataList()">{{ $t('query') }}</el-button>
          </el-form-item>
          <el-form-item>
            <el-button @click="getDataAll()">查询全部</el-button>
          </el-form-item>
          <el-form-item>
            <el-button type="info" @click="exportHandle()">{{
              $t('export')
            }}</el-button>
          </el-form-item>
          <el-form-item>
            <el-button
              v-if="$hasPermission('product:attrgroup:save')"
              type="primary"
              @click="addOrUpdateHandle()"
              >{{ $t('add') }}</el-button
            >
          </el-form-item>
          <el-form-item>
            <el-button
              v-if="$hasPermission('product:attrgroup:delete')"
              type="danger"
              @click="deleteHandle()"
              >{{ $t('deleteBatch') }}</el-button
            >
          </el-form-item>
        </el-form>
        <el-table
          v-loading="dataListLoading"
          :data="dataList"
          border
          @selection-change="dataListSelectionChangeHandle"
          style="width: 100%;"
        >
          <el-table-column
            type="selection"
            header-align="center"
            align="center"
            width="50"
          ></el-table-column>
          <el-table-column
            prop="attrGroupId"
            label="分组id"
            header-align="center"
            align="center"
          ></el-table-column>
          <el-table-column
            prop="attrGroupName"
            label="组名"
            header-align="center"
            align="center"
          ></el-table-column>
          <el-table-column
            prop="sort"
            label="排序"
            header-align="center"
            align="center"
          ></el-table-column>
          <el-table-column
            prop="descript"
            label="描述"
            header-align="center"
            align="center"
          ></el-table-column>
          <el-table-column
            prop="icon"
            label="组图标"
            header-align="center"
            align="center"
          ></el-table-column>
          <el-table-column
            prop="catelogId"
            label="所属分类id"
            header-align="center"
            align="center"
          ></el-table-column>
          <el-table-column
            :label="$t('handle')"
            fixed="right"
            header-align="center"
            align="center"
            width="150"
          >
            <template slot-scope="scope">
              <el-button
                type="text"
                size="small"
                @click="relationHandle(scope.row.attrGroupId)"
                >关联</el-button
              >
              <el-button
                v-if="$hasPermission('product:attrgroup:update')"
                type="text"
                size="small"
                @click="addOrUpdateHandle(scope.row.attrGroupId)"
                >{{ $t('update') }}</el-button
              >
              <el-button
                v-if="$hasPermission('product:attrgroup:delete')"
                type="text"
                size="small"
                @click="deleteHandle(scope.row.attrGroupId)"
                >{{ $t('delete') }}</el-button
              >
            </template>
          </el-table-column>
        </el-table>
        <el-pagination
          :current-page="page"
          :page-sizes="[10, 20, 50, 100]"
          :page-size="limit"
          :total="total"
          layout="total, sizes, prev, pager, next, jumper"
          @size-change="pageSizeChangeHandle"
          @current-change="pageCurrentChangeHandle"
        >
        </el-pagination>
        <!-- 弹窗, 新增 / 修改 -->
        <add-or-update
          v-if="addOrUpdateVisible"
          ref="addOrUpdate"
          @refreshDataList="getDataList"
        ></add-or-update>
        <!-- 修改关联关系 -->
        <relation-update
          v-if="relationVisible"
          ref="relationUpdate"
          @refreshData="getDataList"
        ></relation-update>
      </div>
    </el-col>
  </el-row>
</template>
<script>
import category from '../common/category.vue'
import mixinViewModule from '@/mixins/view-module'
import AddOrUpdate from './attrgroup-add-or-update'
import RelationUpdate from './attr-group-relation'

export default {
  components: { category, AddOrUpdate, RelationUpdate },
  mixins: [mixinViewModule],
  data() {
    return {
      mixinViewModuleOptions: {
        getDataListURL: '/product/attrgroup/page',
        getDataListIsPage: true,
        exportURL: '/product/attrgroup/export',
        deleteURL: '/product/attrgroup',
        deleteIsBatch: true,
        deleteIsBatchKey: 'attrGroupId',
      },
      dataForm: {
        key: '',
      },
      catId: '',
      dataList: [],
      total: 0,
      dataListLoading: false,
      relationVisible: false,
    }
  },
  created() {
    this.getDataList()
  },
  methods: {
    //感知树节点被点击
    treenodeclick(data, node, component) {
      if (node.level == 3) {
        this.catId = data.catId
        this.dataForm.key = ''
        this.getDataList() //重新查询
      }
    },
    getDataAll() {
      this.dataListLoading = true
      this.$axios({
        url: '/product/attrgroup/page',
        method: 'get',
        params: {
          page: this.pageIndex,
          limit: this.pageSize,
        },
      }).then(({ data }) => {
        if (data && data.code === 0) {
          this.dataList = data.data.list
          this.total = data.data.total
        } else {
          this.dataList = []
          this.total = 0
        }
        this.dataForm.key = ''
        this.dataListLoading = false
      })
    },
    // 获取数据列表
    getDataList() {
      this.dataListLoading = true
      this.$axios({
        url: '/product/attrgroup/page/' + this.catId,
        method: 'get',
        params: {
          page: this.pageIndex,
          limit: this.pageSize,
          key: this.dataForm.key,
        },
      }).then(({ data }) => {
        if (data && data.code === 0) {
          this.dataList = data.data.list
          this.total = data.data.total
        } else {
          this.dataList = []
          this.total = 0
        }
        if (this.catId != null && this.dataForm.key == null) {
          this.dataForm.key = this.catId
        }
        this.dataListLoading = false
      })
    },
    //处理分组与属性的关联
    relationHandle(groupId) {
      this.relationVisible = true
      this.$nextTick(() => {
        this.$refs.relationUpdate.init(groupId)
      })
    },

    // 每页数
    sizeChangeHandle(val) {
      this.pageSize = val
      this.pageIndex = 1
      this.getDataList()
    },
    // 当前页
    currentChangeHandle(val) {
      this.pageIndex = val
      this.getDataList()
    },
    // 多选
    selectionChangeHandle(val) {
      this.dataListSelections = val
    },
    // 新增 / 修改
    addOrUpdateHandle(id) {
      this.addOrUpdateVisible = true
      this.$nextTick(() => {
        this.$refs.addOrUpdate.init(id)
      })
    },
    // 删除
    deleteHandle(id) {
      var ids = id
        ? [id]
        : this.dataListSelections.map((item) => {
            return item.attrGroupId
          })
      this.$confirm(
        `确定对[id=${ids.join(',')}]进行[${id ? '删除' : '批量删除'}]操作?`,
        '提示',
        {
          confirmButtonText: '确定',
          cancelButtonText: '取消',
          type: 'warning',
        }
      ).then(() => {
        this.$axios({
          url: '/product/attrgroup',
          method: 'delete',
          data: ids
        }).then(({ data }) => {
          if (data && data.code === 0) {
            this.$message({
              message: '操作成功',
              type: 'success',
              duration: 1500,
              onClose: () => {
                this.getDataList()
              },
            })
          } else {
            this.$message.error(data.msg)
          }
        })
      })
    },
  },
}
</script>
<style lang=""></style>
