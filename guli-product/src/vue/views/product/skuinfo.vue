<template>
  <el-card shadow="never" class="aui-card--fill">
    <div class="mod-product__skuinfo}">
      <el-form :inline="true" :model="dataForm" @keyup.enter.native="getDataList()">
        <el-form-item>
          <el-input v-model="dataForm.skuId" placeholder="skuId" clearable></el-input>
        </el-form-item>
        <el-form-item>
          <el-button @click="getDataList()">{{ $t('query') }}</el-button>
        </el-form-item>
        <el-form-item>
          <el-button type="info" @click="exportHandle()">{{ $t('export') }}</el-button>
        </el-form-item>
        <el-form-item>
          <el-button v-if="$hasPermission('product:skuinfo:save')" type="primary" @click="addOrUpdateHandle()">{{ $t('add') }}</el-button>
        </el-form-item>
        <el-form-item>
          <el-button v-if="$hasPermission('product:skuinfo:delete')" type="danger" @click="deleteHandle()">{{ $t('deleteBatch') }}</el-button>
        </el-form-item>
      </el-form>
      <el-table v-loading="dataListLoading" :data="dataList" border @selection-change="dataListSelectionChangeHandle" style="width: 100%;">
        <el-table-column type="selection" header-align="center" align="center" width="50"></el-table-column>
        <el-table-column prop="skuId" label="skuId" header-align="center" align="center"></el-table-column>
        <el-table-column prop="spuId" label="spuId" header-align="center" align="center"></el-table-column>
        <el-table-column prop="skuName" label="sku名称" header-align="center" align="center"></el-table-column>
        <el-table-column prop="skuDesc" label="sku介绍描述" header-align="center" align="center"></el-table-column>
        <el-table-column prop="catalogId" label="所属分类id" header-align="center" align="center"></el-table-column>
        <el-table-column prop="brandId" label="品牌id" header-align="center" align="center"></el-table-column>
        <el-table-column prop="skuDefaultImg" label="默认图片" header-align="center" align="center"></el-table-column>
        <el-table-column prop="skuTitle" label="标题" header-align="center" align="center"></el-table-column>
        <el-table-column prop="skuSubtitle" label="副标题" header-align="center" align="center"></el-table-column>
        <el-table-column prop="price" label="价格" header-align="center" align="center"></el-table-column>
        <el-table-column prop="saleCount" label="销量" header-align="center" align="center"></el-table-column>
        <el-table-column :label="$t('handle')" fixed="right" header-align="center" align="center" width="150">
          <template slot-scope="scope">
            <el-button v-if="$hasPermission('product:skuinfo:update')" type="text" size="small" @click="addOrUpdateHandle(scope.row.id)">{{ $t('update') }}</el-button>
            <el-button v-if="$hasPermission('product:skuinfo:delete')" type="text" size="small" @click="deleteHandle(scope.row.id)">{{ $t('delete') }}</el-button>
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
        @current-change="pageCurrentChangeHandle">
      </el-pagination>
      <!-- 弹窗, 新增 / 修改 -->
      <add-or-update v-if="addOrUpdateVisible" ref="addOrUpdate" @refreshDataList="getDataList"></add-or-update>
    </div>
  </el-card>
</template>

<script>
import mixinViewModule from '@/mixins/view-module'
import AddOrUpdate from './skuinfo-add-or-update'
export default {
  mixins: [mixinViewModule],
  data () {
    return {
      mixinViewModuleOptions: {
        getDataListURL: '/product/skuinfo/page',
        getDataListIsPage: true,
        exportURL: '/product/skuinfo/export',
        deleteURL: '/product/skuinfo',
        deleteIsBatch: true
      },
      dataForm: {
        skuId: ''
      }
    }
  },
  components: {
    AddOrUpdate
  }
}
</script>
