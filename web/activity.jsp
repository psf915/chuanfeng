<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/10/18 0018
  Time: 10:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>活动管理</title>
    <link rel="stylesheet" href="AdminTemplate/plugins/layui/css/layui.css" media="all">
    <style>
        .header{background: url("./image/t2.jpg") no-repeat;background-size: 100% ;margin-top: 20px}
        .body{background: url("./image/t2.jpg") no-repeat;background-size: 100%}
    </style>
</head>
<body class="body">
<form action="${pageContext.request.contextPath}/ActivityServlet"method="post">
    <fieldset class="header"  >
        <legend>活动管理</legend>
        <div class="layui-textarea">活动名称
        </div>

        <table>
        <tr>
            <td>活动名称:</td>
            <td><input type="text"name="name"></td>
        </tr>
        <tr>
            <td>活动时间:</td>
            <td><input type="text" name="atime"></td>
        </tr>
        <tr>
            <td>活动地点</td>
            <td><input type="text" name="place"></td>
        </tr>
        <tr>
            <td>活动概述</td>
            <td><input type="text" name="content" ></td>
        </tr>
        <tr>
            <td><input type="submit" value="提交"></td>
        </tr>

    </table>
    </fieldset>
</form>

</body>
</html>
