<template>
  <el-card shadow="never" class="aui-card--fill">
    <div class="mod-product__brand}">
      <el-form
        :inline="true"
        :model="dataForm"
        @keyup.enter.native="getDataList()"
      >
        <el-form-item>
          <el-input
            v-model="dataForm.key"
            placeholder="输入id或者name"
            clearable
          ></el-input>
        </el-form-item>
        <el-form-item>
          <el-button @click="getDataList()">{{ $t('query') }}</el-button>
        </el-form-item>
        <el-form-item>
          <el-button type="info" @click="exportHandle()">{{
            $t('export')
          }}</el-button>
        </el-form-item>
        <el-form-item>
          <el-button
            v-if="$hasPermission('product:brand:save')"
            type="primary"
            @click="addOrUpdateHandle()"
            >{{ $t('add') }}</el-button
          >
        </el-form-item>
        <el-form-item>
          <el-button
            v-if="$hasPermission('product:brand:delete')"
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
          prop="brandId"
          label="品牌id"
          header-align="center"
          align="center"
        ></el-table-column>
        <el-table-column
          prop="name"
          label="品牌名"
          header-align="center"
          align="center"
        ></el-table-column>
        <el-table-column
          prop="logo"
          label="品牌logo地址"
          header-align="center"
          align="center"
        >
          <template slot-scope="scope">
            <el-image
              style="width: 100px; height: 100px"
              :src="scope.row.logo"
              :preview-src-list="[scope.row.logo]"
              fit="fill"
            >
            </el-image>
          </template>
        </el-table-column>
        <el-table-column
          prop="descript"
          label="介绍"
          header-align="center"
          align="center"
        ></el-table-column>
        <el-table-column
          prop="showStatus"
          label="显示状态"
          header-align="center"
          align="center"
        >
          <template slot-scope="scope">
            <el-switch
              v-model.number="scope.row.showStatus"
              active-color="#13ce66"
              inactive-color="#ff4949"
              :active-value="1"
              :inactive-value="0"
              @change="switchChange(scope.row)"
            >
            </el-switch>
          </template>
        </el-table-column>
        <el-table-column
          prop="firstLetter"
          label="检索首字母"
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
          :label="$t('handle')"
          fixed="right"
          header-align="center"
          align="center"
          width="150"
        >
          <template slot-scope="scope">
            <el-button type="text" size="small" @click="updateCatelogHandle(scope.row.brandId)">关联分类</el-button>
            <el-button
              v-if="$hasPermission('product:brand:update')"
              type="text"
              size="small"
              @click="addOrUpdateHandle(scope.row.brandId)"
              >{{ $t('update') }}</el-button
            >
            <el-button
              v-if="$hasPermission('product:brand:delete')"
              type="text"
              size="small"
              @click="deleteHandle(scope.row.brandId)"
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
      <el-dialog title="关联分类" :visible.sync="cateRelationDialogVisible" width="30%" @closed="close">
      <el-popover placement="right-end" v-model="popCatelogSelectVisible">
        <category-cascader :catelogPath.sync="catelogPath"></category-cascader>
        <div style="text-align: right; margin: 0">
          <el-button size="mini" type="text" @click="popCatelogSelectVisible = false">取消</el-button>
          <el-button type="primary" size="mini" @click="addCatelogSelect">确定</el-button>
        </div>
        <el-button slot="reference">新增关联</el-button>
      </el-popover>
      <el-table :data="cateRelationTableData" style="width: 100%">
        <el-table-column prop="id" label="#"></el-table-column>
        <el-table-column prop="brandName" label="品牌名"></el-table-column>
        <el-table-column prop="catelogName" label="分类名"></el-table-column>
        <el-table-column fixed="right" header-align="center" align="center" label="操作">
          <template slot-scope="scope">
            <el-button
              type="text"
              size="small"
              @click="deleteCateRelationHandle(scope.row.id,scope.row.brandId)"
            >移除</el-button>
          </template>
        </el-table-column>
      </el-table>
      <span slot="footer" class="dialog-footer">
        <el-button @click="cateRelationDialogVisible = false">取 消</el-button>
        <el-button type="primary" @click="cateRelationDialogVisible = false">确 定</el-button>
      </span>
    </el-dialog>
    </div>
  </el-card>
</template>

<script>
import mixinViewModule from '@/mixins/view-module'
import AddOrUpdate from './brand-add-or-update'
import CategoryCascader from "../common/category-cascader";
export default {
  mixins: [mixinViewModule],
  data() {
    return {
      value: 0,
      brandId: 0,
      catelogPath: [],
      dataList: [],
      cateRelationTableData: [],
      pageIndex: 1,
      pageSize: 10,
      totalPage: 0,
      dataListLoading: false,
      dataListSelections: [],
      addOrUpdateVisible: false,
      cateRelationDialogVisible: false,
      popCatelogSelectVisible: false,
      mixinViewModuleOptions: {
        getDataListURL: '/product/brand/page',
        getDataListIsPage: true,
        exportURL: '/product/brand/export',
        deleteURL: '/product/brand',
        deleteIsBatch: true,
        deleteIsBatchKey: 'brandId',
      },
      dataForm: {
        key: '',
        brandId: '',
      },
    }
  },
  methods: {
    close () {
      this.catelogPath = []
    },
    updateCatelogHandle(brandId) {
      this.cateRelationDialogVisible = true;
      this.brandId = brandId;
      this.getCateRelation();
    },
    switchChange(row) {
      var brandId = row.brandId
      var showStatus = row.showStatus
      var name = row.name
      this.$axios({
        url: '/product/brand',
        method: 'put',
        data: { brandId, showStatus, name },
      }).then(() => {
        this.$message({
          message: '修改显示状态成功',
          type: 'success',
        })
        this.query()
      })
    },
    addCatelogSelect() {
      //{"brandId":1,"catelogId":2}
      this.popCatelogSelectVisible =false;
      this.$axios({
        url: "/product/categorybrandrelation/save",
        method: "post",
        data: {brandId:this.brandId,catelogId:this.catelogPath[this.catelogPath.length-1]}
      }).then(({ data }) => {
        this.getCateRelation();
      });
    },
    deleteCateRelationHandle(id, brandId) {
      this.$axios({
        url: "/product/categorybrandrelation",
        method: "delete",
        data: [id]
      }).then(({ data }) => {
        this.getCateRelation();
      });
    },
    getCateRelation() {
      this.$axios({
        url: "/product/categorybrandrelation/list",
        method: "get",
        params: {
          brandId: this.brandId
        }
      }).then(({ data }) => {
        this.cateRelationTableData = data.data;
      });
    },
    // 获取数据列表
    getDataList() {
      this.dataListLoading = true;
      this.$axios({
        url: "/product/brand/page",
        method: "get",
        params: {
          page: this.pageIndex,
          limit: this.pageSize,
          key: this.dataForm.key
        }
      }).then(({ data }) => {
        if (data && data.code === 0) {
          this.dataList = data.data.list;
          this.totalPage = data.data.total;
        } else {
          this.dataList = [];
          this.totalPage = 0;
        }
        this.dataListLoading = false;
      });
    },
    updateBrandStatus(data) {
      console.log("最新信息", data);
      let { brandId, showStatus } = data;
      //发送请求修改状态
      this.$axios({
        url: "/product/brand",
        method: "put",
        data: { brandId, showStatus }
      }).then(({ data }) => {
        this.$message({
          type: "success",
          message: "状态更新成功"
        });
      });
    },
    // 每页数
    sizeChangeHandle(val) {
      this.pageSize = val;
      this.pageIndex = 1;
      this.getDataList();
    },
    // 当前页
    currentChangeHandle(val) {
      this.pageIndex = val;
      this.getDataList();
    },
    // 多选
    selectionChangeHandle(val) {
      this.dataListSelections = val;
    },
    // 新增 / 修改
    addOrUpdateHandle(id) {
      this.addOrUpdateVisible = true;
      this.$nextTick(() => {
        this.$refs.addOrUpdate.init(id);
      });
    },
    // 删除
    deleteHandle(id) {
      var ids = id
        ? [id]
        : this.dataListSelections.map(item => {
            return item.brandId;
          });
      this.$confirm(
        `确定对[id=${ids.join(",")}]进行[${id ? "删除" : "批量删除"}]操作?`,
        "提示",
        {
          confirmButtonText: "确定",
          cancelButtonText: "取消",
          type: "warning"
        }
      ).then(() => {
        this.$axios({
          url: "/product/brand",
          method: "delete",
          data: ids
        }).then(({ data }) => {
          if (data && data.code === 0) {
            this.$message({
              message: "操作成功",
              type: "success",
              duration: 1500,
              onClose: () => {
                this.getDataList();
              }
            });
          } else {
            this.$message.error(data.msg);
          }
        });
      });
    }
  
  },
  components: {
    AddOrUpdate,
    CategoryCascader
  },
}
</script>
