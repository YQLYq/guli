<!--
 * @Description: 
 * @Version: 2.0
 * @Autor: 阳秦林
 * @Date: 2023-05-03 13:12:51
 * @LastEditors: 阳秦林
 * @LastEditTime: 2023-05-03 13:38:41
-->
<template lang="">
  <el-tree
    :data="data"
    :props="defaultProps"
    @node-click="nodeClick"
    ref="tree"
  >
  </el-tree>
</template>
<script>
export default {
  data() {
    return {
      data: [],
      defaultProps: {
        children: 'children',
        label: 'name',
      },
      expandkey: [],
    }
  },
  methods: {
    //获取树状
    getMenus() {
      this.$http
        .get('/product/category/list/tree')
        .then((result) => {
          this.data = result.data
        })
        .catch((err) => {})
    },
    nodeClick(data, node, component) {
      //向父组件发送事件
      this.$emit("treeNodeClick",data, node, component)
    },
  },
  created() {
    this.getMenus()
  },
}
</script>
<style lang=""></style>
