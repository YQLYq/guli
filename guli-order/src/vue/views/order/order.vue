<template>
  <el-card shadow="never" class="aui-card--fill">
    <div class="mod-order__order}">
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
          <el-button v-if="$hasPermission('order:order:save')" type="primary" @click="addOrUpdateHandle()">{{ $t('add') }}</el-button>
        </el-form-item>
        <el-form-item>
          <el-button v-if="$hasPermission('order:order:delete')" type="danger" @click="deleteHandle()">{{ $t('deleteBatch') }}</el-button>
        </el-form-item>
      </el-form>
      <el-table v-loading="dataListLoading" :data="dataList" border @selection-change="dataListSelectionChangeHandle" style="width: 100%;">
        <el-table-column type="selection" header-align="center" align="center" width="50"></el-table-column>
        <el-table-column prop="id" label="id" header-align="center" align="center"></el-table-column>
        <el-table-column prop="memberId" label="member_id" header-align="center" align="center"></el-table-column>
        <el-table-column prop="orderSn" label="订单号" header-align="center" align="center"></el-table-column>
        <el-table-column prop="couponId" label="使用的优惠券" header-align="center" align="center"></el-table-column>
        <el-table-column prop="createTime" label="create_time" header-align="center" align="center"></el-table-column>
        <el-table-column prop="memberUsername" label="用户名" header-align="center" align="center"></el-table-column>
        <el-table-column prop="totalAmount" label="订单总额" header-align="center" align="center"></el-table-column>
        <el-table-column prop="payAmount" label="应付总额" header-align="center" align="center"></el-table-column>
        <el-table-column prop="freightAmount" label="运费金额" header-align="center" align="center"></el-table-column>
        <el-table-column prop="promotionAmount" label="促销优化金额（促销价、满减、阶梯价）" header-align="center" align="center"></el-table-column>
        <el-table-column prop="integrationAmount" label="积分抵扣金额" header-align="center" align="center"></el-table-column>
        <el-table-column prop="couponAmount" label="优惠券抵扣金额" header-align="center" align="center"></el-table-column>
        <el-table-column prop="discountAmount" label="后台调整订单使用的折扣金额" header-align="center" align="center"></el-table-column>
        <el-table-column prop="payType" label="支付方式【1->支付宝；2->微信；3->银联； 4->货到付款；】" header-align="center" align="center"></el-table-column>
        <el-table-column prop="sourceType" label="订单来源[0->PC订单；1->app订单]" header-align="center" align="center"></el-table-column>
        <el-table-column prop="status" label="订单状态【0->待付款；1->待发货；2->已发货；3->已完成；4->已关闭；5->无效订单】" header-align="center" align="center"></el-table-column>
        <el-table-column prop="deliveryCompany" label="物流公司(配送方式)" header-align="center" align="center"></el-table-column>
        <el-table-column prop="deliverySn" label="物流单号" header-align="center" align="center"></el-table-column>
        <el-table-column prop="autoConfirmDay" label="自动确认时间（天）" header-align="center" align="center"></el-table-column>
        <el-table-column prop="integration" label="可以获得的积分" header-align="center" align="center"></el-table-column>
        <el-table-column prop="growth" label="可以获得的成长值" header-align="center" align="center"></el-table-column>
        <el-table-column prop="billType" label="发票类型[0->不开发票；1->电子发票；2->纸质发票]" header-align="center" align="center"></el-table-column>
        <el-table-column prop="billHeader" label="发票抬头" header-align="center" align="center"></el-table-column>
        <el-table-column prop="billContent" label="发票内容" header-align="center" align="center"></el-table-column>
        <el-table-column prop="billReceiverPhone" label="收票人电话" header-align="center" align="center"></el-table-column>
        <el-table-column prop="billReceiverEmail" label="收票人邮箱" header-align="center" align="center"></el-table-column>
        <el-table-column prop="receiverName" label="收货人姓名" header-align="center" align="center"></el-table-column>
        <el-table-column prop="receiverPhone" label="收货人电话" header-align="center" align="center"></el-table-column>
        <el-table-column prop="receiverPostCode" label="收货人邮编" header-align="center" align="center"></el-table-column>
        <el-table-column prop="receiverProvince" label="省份/直辖市" header-align="center" align="center"></el-table-column>
        <el-table-column prop="receiverCity" label="城市" header-align="center" align="center"></el-table-column>
        <el-table-column prop="receiverRegion" label="区" header-align="center" align="center"></el-table-column>
        <el-table-column prop="receiverDetailAddress" label="详细地址" header-align="center" align="center"></el-table-column>
        <el-table-column prop="note" label="订单备注" header-align="center" align="center"></el-table-column>
        <el-table-column prop="confirmStatus" label="确认收货状态[0->未确认；1->已确认]" header-align="center" align="center"></el-table-column>
        <el-table-column prop="deleteStatus" label="删除状态【0->未删除；1->已删除】" header-align="center" align="center"></el-table-column>
        <el-table-column prop="useIntegration" label="下单时使用的积分" header-align="center" align="center"></el-table-column>
        <el-table-column prop="paymentTime" label="支付时间" header-align="center" align="center"></el-table-column>
        <el-table-column prop="deliveryTime" label="发货时间" header-align="center" align="center"></el-table-column>
        <el-table-column prop="receiveTime" label="确认收货时间" header-align="center" align="center"></el-table-column>
        <el-table-column prop="commentTime" label="评价时间" header-align="center" align="center"></el-table-column>
        <el-table-column prop="modifyTime" label="修改时间" header-align="center" align="center"></el-table-column>
        <el-table-column :label="$t('handle')" fixed="right" header-align="center" align="center" width="150">
          <template slot-scope="scope">
            <el-button v-if="$hasPermission('order:order:update')" type="text" size="small" @click="addOrUpdateHandle(scope.row.id)">{{ $t('update') }}</el-button>
            <el-button v-if="$hasPermission('order:order:delete')" type="text" size="small" @click="deleteHandle(scope.row.id)">{{ $t('delete') }}</el-button>
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
import AddOrUpdate from './order-add-or-update'
export default {
  mixins: [mixinViewModule],
  data () {
    return {
      mixinViewModuleOptions: {
        getDataListURL: '/order/order/page',
        getDataListIsPage: true,
        exportURL: '/order/order/export',
        deleteURL: '/order/order',
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
