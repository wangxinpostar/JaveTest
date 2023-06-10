<%--
Created by IntelliJ IDEA.
User: wangx
Date: 2023/6/8
Time: 16:17
To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Title</title>
  <script src="js/axios.js"></script>
  <script src="js/JQuery.js"></script>
  <script src="js/Vue.js"></script>
  <!-- 引入样式 -->
  <link rel="stylesheet" href="https://unpkg.com/element-ui/lib/theme-chalk/index.css">
  <!-- 引入组件库 -->
  <script src="https://unpkg.com/element-ui/lib/index.js"></script>
</head>
<body>
<br><br><br>
<div class="test">
  <div style="text-align: center;">
    <el-tag @click="showStu() ">访问服务器返回学生集合</el-tag>
  </div>
  <div style="text-align: center;">
    <el-tag v-html="content" v-show="p"></el-tag>
  </div>
  <template>
    <el-table :data="lists"
              :header-cell-style="{'text-align':'center'}"
              :cell-style="{'text-align':'center'}"
              style="width: 50%; margin: auto"
              v-if="q">
      <el-table-column style="width: auto"
                       prop="name"
                       label="姓名">
      </el-table-column>
      <el-table-column style="width: auto"
                       prop="age"
                       label="年龄">
      </el-table-column>
    </el-table>
  </template>
</div>
</body>
<script type="module">
  
  Vue.prototype.$http = axios;
  var app = new Vue({
    el: ".test",
    data: {
      content: "等待服务器返回数据",
      lists: [],
      p: true,
      q: false,
    },
    methods: {
      showStu() {
        let that = this;
        let list = [];
        this.$http.get('/SpringMVC/ajax.action', {
          params: {
            ID: 12345
          }
        }).then(function (response) {
          $.each(response.data, (inedx, item) => {
                list.push(item);
              }
          );
          that.p = false;
          that.q = true;
          that.lists = list;
        }).catch(function (error) {
          console.log(error);
        });
      }
    }
  });
</script>
</html>