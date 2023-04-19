<template>
  <el-card shadow="never" class="aui-card--fill">
    <div class="mod-order__orderreturnapply}">
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
          <el-button v-if="$hasPermission('order:orderreturnapply:save')" type="primary" @click="addOrUpdateHandle()">{{ $t('add') }}</el-button>
        </el-form-item>
        <el-form-item>
          <el-button v-if="$hasPermission('order:orderreturnapply:delete')" type="danger" @click="deleteHandle()">{{ $t('deleteBatch') }}</el-button>
        </el-form-item>
      </el-form>
      <el-table v-loading="dataListLoading" :data="dataList" border @selection-change="dataListSelectionChangeHandle" style="width: 100%;">
        <el-table-column type="selection" header-align="center" align="center" width="50"></el-table-column>
        <el-table-column prop="id" label="id" header-align="center" align="center"></el-table-column>
        <el-table-column prop="orderId" label="order_id" header-align="center" align="center"></el-table-column>
        <el-table-column prop="skuId" label="退货商品id" header-align="center" align="center"></el-table-column>
        <el-table-column prop="orderSn" label="订单编号" header-align="center" align="center"></el-table-column>
        <el-table-column prop="createTime" label="申请时间" header-align="center" align="center"></el-table-column>
        <el-table-column prop="memberUsername" label="会员用户名" header-align="center" align="center"></el-table-column>
        <el-table-column prop="returnAmount" label="退款金额" header-align="center" align="center"></el-table-column>
        <el-table-column prop="returnName" label="退货人姓名" header-align="center" align="center"></el-table-column>
        <el-table-column prop="returnPhone" label="退货人电话" header-align="center" align="center"></el-table-column>
        <el-table-column prop="status" label="申请状态[0->待处理；1->退货中；2->已完成；3->已拒绝]" header-align="center" align="center"></el-table-column>
        <el-table-column prop="handleTime" label="处理时间" header-align="center" align="center"></el-table-column>
        <el-table-column prop="skuImg" label="商品图片" header-align="center" align="center"></el-table-column>
        <el-table-column prop="skuName" label="商品名称" header-align="center" align="center"></el-table-column>
        <el-table-column prop="skuBrand" label="商品品牌" header-align="center" align="center"></el-table-column>
        <el-table-column prop="skuAttrsVals" label="商品销售属性(JSON)" header-align="center" align="center"></el-table-column>
        <el-table-column prop="skuCount" label="退货数量" header-align="center" align="center"></el-table-column>
        <el-table-column prop="skuPrice" label="商品单价" header-align="center" align="center"></el-table-column>
        <el-table-column prop="skuRealPrice" label="商品实际支付单价" header-align="center" align="center"></el-table-column>
        <el-table-column prop="reason" label="原因" header-align="center" align="center"></el-table-column>
        <el-table-column prop="description述" label="描述" header-align="center" align="center"></el-table-column>
        <el-table-column prop="descPics" label="凭证图片，以逗号隔开" header-align="center" align="center"></el-table-column>
        <el-table-column prop="handleNote" label="处理备注" header-align="center" align="center"></el-table-column>
        <el-table-column prop="handleMan" label="处理人员" header-align="center" align="center"></el-table-column>
        <el-table-column prop="receiveMan" label="收货人" header-align="center" align="center"></el-table-column>
        <el-table-column prop="receiveTime" label="收货时间" header-align="center" align="center"></el-table-column>
        <el-table-column prop="receiveNote" label="收货备注" header-align="center" align="center"></el-table-column>
        <el-table-column prop="receivePhone" label="收货电话" header-align="center" align="center"></el-table-column>
        <el-table-column prop="companyAddress" label="公司收货地址" header-align="center" align="center"></el-table-column>
        <el-table-column :label="$t('handle')" fixed="right" header-align="center" align="center" width="150">
          <template slot-scope="scope">
            <el-button v-if="$hasPermission('order:orderreturnapply:update')" type="text" size="small" @click="addOrUpdateHandle(scope.row.id)">{{ $t('update') }}</el-button>
            <el-button v-if="$hasPermission('order:orderreturnapply:delete')" type="text" size="small" @click="deleteHandle(scope.row.id)">{{ $t('delete') }}</el-button>
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
import AddOrUpdate from './orderreturnapply-add-or-update'
export default {
  mixins: [mixinViewModule],
  data () {
    return {
      mixinViewModuleOptions: {
        getDataListURL: '/order/orderreturnapply/page',
        getDataListIsPage: true,
        exportURL: '/order/orderreturnapply/export',
        deleteURL: '/order/orderreturnapply',
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
