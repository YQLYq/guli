<template lang="">
  <div>
    <el-switch
      v-model="draggable"
      active-text="开启拖拽"
      inactive-text="关闭拖拽"
    >
    </el-switch>

    <el-button v-if="draggable" @click="saveList">批量保存</el-button>
    <el-button type="danger" @click="batchDelete">批量删除</el-button>
    <el-tree
      :data="data"
      :props="defaultProps"
      @node-click=""
      :expand-on-click-node="false"
      show-checkbox
      node-key="catId"
      :default-expanded-keys="expandkey"
      :draggable="draggable"
      :allow-drop="allowDrop"
      @node-drop="handleDrop"
      ref="tree"
    >
      <span class="custom-tree-node" slot-scope="{ node, data }">
        <span>{{ node.label }}</span>

        <span>
          <el-button
            v-if="node.level <= 2"
            type="text"
            size="mimi"
            @click="() => append(data)"
          >
            Append
          </el-button>
          <el-button type="text" size="mimi" @click="() => edit(data)">
            Edit
          </el-button>
          <el-button
            v-if="node.childNodes == 0"
            type="text"
            size="mini"
            @click="() => remove(node, data)"
          >
            Delete
          </el-button>
        </span>
      </span>
    </el-tree>
    <el-dialog
      :title="title"
      :visible.sync="dialogVisible"
      width="30%"
      :close-on-click-modal="false"
    >
      <el-form :model="inputData">
        <el-form-item label="分类名" prop="pass">
          <el-input
            type="text"
            v-model="inputData.name"
            autocomplete="off"
          ></el-input>
        </el-form-item>
        <el-form-item label="图标" prop="pass">
          <el-input
            type="text"
            v-model="inputData.icon"
            autocomplete="off"
          ></el-input>
        </el-form-item>
        <el-form-item label="计量单位" prop="pass">
          <el-input
            type="text"
            v-model="inputData.productUnit"
            autocomplete="off"
          ></el-input>
        </el-form-item>
        <el-form-item>
          <el-button type="primary" @click="submitForm()">提交</el-button>
          <el-button @click="cancel()">取消</el-button>
        </el-form-item>
      </el-form>
    </el-dialog>
  </div>
</template>
<script>
export default {
  data() {
    return {
      draggable: false,
      title: '',
      dialogType: '', //add edit 区分
      data: [],
      expandkey: [],
      defaultProps: {
        children: 'children',
        label: 'name',
      },
      handledData: [],
      List: {},
      children: {},
      inputData: {
        name: '',
        parentCid: 0,
        catLevel: 0,
        showStatus: 1,
        sort: 0,
        catId: 0,
        icon: '',
        productUnit: '',
      },
      dialogVisible: false,
      maxLevel: 1,
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
    //点击添加按钮
    append(data) {
      this.inputData.parentCid = data.catId
      this.dialogType = 'add'
      this.title = '添加'
      this.inputData.catLevel = data.catLevel + 1
      this.dialogVisible = true
    },
    //点击修改按钮
    edit(data) {
      this.dialogType = 'edit'
      this.$axios({
        method: 'get',
        url: '/product/category/' + data.catId,
      }).then((result) => {
        this.inputData = result.data.data
      })
      this.title = '修改'
      this.dialogVisible = true
    },
    //取消
    cancel() {
      this.dialogVisible = false
      this.inputData = {}
    },
    //提交表单时 判断是什么操作
    submitForm() {
      if (this.dialogType === 'edit') {
        this.editMenu()
      } else if (this.dialogType === 'add') {
        this.addMenu()
      }
    },
    //修改
    editMenu() {
      var { catId, name, icon, productUnit } = this.inputData
      this.$axios({
        method: 'put',
        url: '/product/category',
        data: { catId, name, icon, productUnit },
      }).then(() => {
        this.dialogVisible = false
        this.$message({
          showClose: true,
          message: '修改成功',
        })
        this.getMenus()
        this.expandkey = [this.inputData.parentCid]
        this.inputData = {}
      })
    },
    //添加
    addMenu() {
      console.log(this.inputData)
      this.$axios({
        method: 'post',
        url: '/product/category',
        data: this.inputData,
      }).then(() => {
        this.dialogVisible = false
        this.$message({
          showClose: true,
          message: '添加成功',
        })
        this.getMenus()
        this.expandkey = [this.inputData.parentCid]
        this.inputData = {}
      })
    },
    //删除
    remove(node, data) {
      console.log(node, data)
      var ids = [data.catId]
      this.$confirm(`此操作将永久删除${data.name},是否继续?`, '提示', {
        confirmButtonText: '确定',
        cancelButtonText: '取消',
        type: 'warning',
      })
        .then(() => {
          this.$axios({
            url: '/product/category',
            method: 'DELETE',
            data: ids,
          }).then(() => {
            this.$message({
              showClose: true,
              message: '删除成功',
            })
            this.getMenus()
            this.expandkey = [node.parent.data.catId]
          })
        })
        .catch(() => {
          this.$message({
            type: 'info',
            message: '已取消删除',
          })
        })
    },
    //允许可以拖拽的节点
    allowDrop(draggingNode, dropNode, type) {
      this.maxLevel = 1
      this.countNodeLevel(draggingNode.data)
      let deep = Math.abs(this.maxLevel - draggingNode.level + 1)

      if (type === 'inner') {
        return deep + dropNode.level <= 3
      } else {
        return deep + dropNode.parent.level <= 3
      }
    },
    //计算该节点的层数
    countNodeLevel(data) {
      if (data.children != null && data.children.length > 0) {
        for (let index = 0; index < data.children.length; index++) {
          if (data.children[index].level > this.maxLevel) {
            this.maxLevel = data.children[index].level
          }
          this.countNodeLevel(data.children[index])
        }
      }
    },
    //拖拽完成后
    handleDrop(draggingNode, dropNode, dropType, ev) {
      console.log('draggingNode', draggingNode)
      console.log('dropNode', dropNode)
      console.log(dropType)
      this.List = []
      //父节点
      this.List.catId = draggingNode.data.catId
      if (dropType === 'inner') {
        this.List.parentCid = dropNode.data.catId
        this.List.catLevel = dropNode.level + 1
      } else {
        this.List.parentCid = dropNode.data.parentCid
        this.List.catLevel = dropNode.data.catLevel
        if (dropType === 'before') {
          this.List.sort = dropNode.data.sort + 1
        } else {
          this.List.sort = dropNode.data.sort - 1
        }
      }
      this.handledData.push({
        catId: this.List.catId,
        parentCid: this.List.parentCid,
        catLevel: this.List.catLevel,
      })
      //子节点
      draggingNode.data.children.forEach((element) => {
        if (this.List.catLevel != draggingNode.data.level) {
          if (dropType === 'before') {
            this.handledData.push({
              catId: element.catId,
              catLevel: element.catLevel - 1,
            })
          } else {
            this.handledData.push({
              catId: element.catId,
              catLevel: element.catLevel + 1,
            })
          }
        }
      })
    },
    saveList() {
      this.$axios({
        url: '/product/category/list',
        method: 'put',
        data: this.handledData,
      }).then(() => {
        this.$message({
          showClose: true,
          message: '拖拽成功',
        })

        this.handledData = []
      })
    },
    batchDelete() {
      let checkNode = this.$refs.tree.getCheckedNodes()
      let ids = []
      checkNode.forEach((node) => {
        ids.push(node.catId)
      })
      this.$confirm(`此操作将永久删除${ids},是否继续?`, '提示', {
        confirmButtonText: '确定',
        cancelButtonText: '取消',
        type: 'warning',
      })
        .then(() => {
          this.$axios({
            url: '/product/category',
            method: 'DELETE',
            data: ids,
          }).then(() => {
            this.$message({
              showClose: true,
              message: '删除成功',
            })
            this.expandkey = [ids[0]]
            this.getMenus()
          })
        })
        .catch(() => {})
    },
  },

  created() {
    this.getMenus()
  },
}
</script>
<style scoped></style>
