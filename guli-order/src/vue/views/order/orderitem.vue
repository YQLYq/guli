<template>
  <el-card shadow="never" class="aui-card--fill">
    <div class="mod-order__orderitem}">
      <el-form :inline="true" :model="dataForm" @keyup.enter.native="getDataList()">
        <el-form-item>
          <el-input v-model="dataForm.id" placeholder="id" clearable></el-input>
        </el-form-item>
        <el-form-item>
          <el-button @click="getDataList()">{{ $t('query') }}</el-button>
        </el-form-item>
        <el-form-item>
          <el-button type="info" @click="exportHandle()">{{ $t('export') }}</el-button>
        </el-form-item>
        <el-form-item>
          <el-button v-if="$hasPermission('order:orderitem:save')" type="primary" @click="addOrUpdateHandle()">{{ $t('add') }}</el-button>
        </el-form-item>
        <el-form-item>
          <el-button v-if="$hasPermission('order:orderitem:delete')" type="danger" @click="deleteHandle()">{{ $t('deleteBatch') }}</el-button>
        </el-form-item>
      </el-form>
      <el-table v-loading="dataListLoading" :data="dataList" border @selection-change="dataListSelectionChangeHandle" style="width: 100%;">
        <el-table-column type="selection" header-align="center" align="center" width="50"></el-table-column>
        <el-table-column prop="id" label="id" header-align="center" align="center"></el-table-column>
        <el-table-column prop="orderId" label="order_id" header-align="center" align="center"></el-table-column>
        <el-table-column prop="orderSn" label="order_sn" header-align="center" align="center"></el-table-column>
        <el-table-column prop="spuId" label="spu_id" header-align="center" align="center"></el-table-column>
        <el-table-column prop="spuName" label="spu_name" header-align="center" align="center"></el-table-column>
        <el-table-column prop="spuPic" label="spu_pic" header-align="center" align="center"></el-table-column>
        <el-table-column prop="spuBrand" label="品牌" header-align="center" align="center"></el-table-column>
        <el-table-column prop="categoryId" label="商品分类id" header-align="center" align="center"></el-table-column>
        <el-table-column prop="skuId" label="商品sku编号" header-align="center" align="center"></el-table-column>
        <el-table-column prop="skuName" label="商品sku名字" header-align="center" align="center"></el-table-column>
        <el-table-column prop="skuPic" label="商品sku图片" header-align="center" align="center"></el-table-column>
        <el-table-column prop="skuPrice" label="商品sku价格" header-align="center" align="center"></el-table-column>
        <el-table-column prop="skuQuantity" label="商品购买的数量" header-align="center" align="center"></el-table-column>
        <el-table-column prop="skuAttrsVals" label="商品销售属性组合（JSON）" header-align="center" align="center"></el-table-column>
        <el-table-column prop="promotionAmount" label="商品促销分解金额" header-align="center" align="center"></el-table-column>
        <el-table-column prop="couponAmount" label="优惠券优惠分解金额" header-align="center" align="center"></el-table-column>
        <el-table-column prop="integrationAmount" label="积分优惠分解金额" header-align="center" align="center"></el-table-column>
        <el-table-column prop="realAmount" label="该商品经过优惠后的分解金额" header-align="center" align="center"></el-table-column>
        <el-table-column prop="giftIntegration" label="赠送积分" header-align="center" align="center"></el-table-column>
        <el-table-column prop="giftGrowth" label="赠送成长值" header-align="center" align="center"></el-table-column>
        <el-table-column :label="$t('handle')" fixed="right" header-align="center" align="center" width="150">
          <template slot-scope="scope">
            <el-button v-if="$hasPermission('order:orderitem:update')" type="text" size="small" @click="addOrUpdateHandle(scope.row.id)">{{ $t('update') }}</el-button>
            <el-button v-if="$hasPermission('order:orderitem:delete')" type="text" size="small" @click="deleteHandle(scope.row.id)">{{ $t('delete') }}</el-button>
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
import AddOrUpdate from './orderitem-add-or-update'
export default {
  mixins: [mixinViewModule],
  data () {
    return {
      mixinViewModuleOptions: {
        getDataListURL: '/order/orderitem/page',
        getDataListIsPage: true,
        exportURL: '/order/orderitem/export',
        deleteURL: '/order/orderitem',
        deleteIsBatch: true
      },
      dataForm: {
        id: ''
      }
    }
  },
  components: {
    AddOrUpdate
  }
}
</script>
