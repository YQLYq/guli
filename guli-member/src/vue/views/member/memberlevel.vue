<template>
  <el-card shadow="never" class="aui-card--fill">
    <div class="mod-member__memberlevel}">
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
          <el-button v-if="$hasPermission('member:memberlevel:save')" type="primary" @click="addOrUpdateHandle()">{{ $t('add') }}</el-button>
        </el-form-item>
        <el-form-item>
          <el-button v-if="$hasPermission('member:memberlevel:delete')" type="danger" @click="deleteHandle()">{{ $t('deleteBatch') }}</el-button>
        </el-form-item>
      </el-form>
      <el-table v-loading="dataListLoading" :data="dataList" border @selection-change="dataListSelectionChangeHandle" style="width: 100%;">
        <el-table-column type="selection" header-align="center" align="center" width="50"></el-table-column>
        <el-table-column prop="id" label="id" header-align="center" align="center"></el-table-column>
        <el-table-column prop="name" label="等级名称" header-align="center" align="center"></el-table-column>
        <el-table-column prop="growthPoint" label="等级需要的成长值" header-align="center" align="center"></el-table-column>
        <el-table-column prop="defaultStatus" label="是否为默认等级[0->不是；1->是]" header-align="center" align="center"></el-table-column>
        <el-table-column prop="freeFreightPoint" label="免运费标准" header-align="center" align="center"></el-table-column>
        <el-table-column prop="commentGrowthPoint" label="每次评价获取的成长值" header-align="center" align="center"></el-table-column>
        <el-table-column prop="priviledgeFreeFreight" label="是否有免邮特权" header-align="center" align="center"></el-table-column>
        <el-table-column prop="priviledgeMemberPrice" label="是否有会员价格特权" header-align="center" align="center"></el-table-column>
        <el-table-column prop="priviledgeBirthday" label="是否有生日特权" header-align="center" align="center"></el-table-column>
        <el-table-column prop="note" label="备注" header-align="center" align="center"></el-table-column>
        <el-table-column :label="$t('handle')" fixed="right" header-align="center" align="center" width="150">
          <template slot-scope="scope">
            <el-button v-if="$hasPermission('member:memberlevel:update')" type="text" size="small" @click="addOrUpdateHandle(scope.row.id)">{{ $t('update') }}</el-button>
            <el-button v-if="$hasPermission('member:memberlevel:delete')" type="text" size="small" @click="deleteHandle(scope.row.id)">{{ $t('delete') }}</el-button>
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
import AddOrUpdate from './memberlevel-add-or-update'
export default {
  mixins: [mixinViewModule],
  data () {
    return {
      mixinViewModuleOptions: {
        getDataListURL: '/member/memberlevel/page',
        getDataListIsPage: true,
        exportURL: '/member/memberlevel/export',
        deleteURL: '/member/memberlevel',
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
