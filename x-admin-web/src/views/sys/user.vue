<template>
  <div>
    <!-- 搜索栏 -->
    <el-card class="box-card">
      <el-row>
        <el-col :span="20">
          <el-input
            v-model="searchModel.username"
            placeholder="用户名"
            clearable
          />
          <el-input
            v-model="searchModel.phone"
            placeholder="电话"
            clearable
          />
          <!-- 搜索 -->
          <el-button type="primary" icon="el-icon-search">搜索</el-button>
        </el-col>
        <!-- 新增 -->
        <el-col :span="4" align="right">
          <el-button type="primary" icon="el-icon-plus" circle />
        </el-col>
      </el-row>
    </el-card>

    <!-- 结果列表 -->
    <el-card>
      <el-table
        highlight-current-row
        :header-cell-style="{ 'text-align': 'center' }"
        :cell-style="{ 'text-align': 'center' }"
        :data="userList"
        stripe="true"
        style="width: 100%"
      >
        <el-table-column
          label="序号"
          type="index"
          width="auto"
        />
        <el-table-column
          prop="id"
          label="用户ID"
          width="auto"
        />
        <el-table-column
          prop="username"
          label="用户名"
          width="auto"
        />
        <el-table-column
          prop="phone"
          label="电话"
          width="auto"
        />
        <el-table-column
          prop="e-mail"
          label="电子邮件"
          width="auto"
        />
        <el-table-column
          label="操作"
          width="100"
        />
      </el-table>
      <el-pagination
        style="margin-top: 10px;width: auto;text-align: center;border-radius: 10px"
        layout="prev, pager, next"
        :total="30"
      />
    </el-card>
  </div>
</template>

<script>
export default {
  data() {
    return {
      searchModel: {},
      userList: [{ 'username': 'hh', 'phone': 'asd' }, { 'username': 'hh', 'phone': 'asd' }, { 'username': 'hh', 'phone': 'asd' }, { 'username': 'hh', 'phone': 'asd' }, { 'username': 'hh', 'phone': 'asd' }]
    }
  }
}
</script>

<style>
</style>
