<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/12/1 0001
  Time: 21:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <title>后台管理系统</title>
    <link rel="stylesheet" href="AdminTemplate/plugins/layui/css/layui.css" media="all" type="text/css"/>
    <link rel="stylesheet" href="AdminTemplate/plugins/layui/layui.all.js" media="all" type="text/css"/>
    <link rel="stylesheet" href="AdminTemplate/plugins/font-awesome/css/font-awesome.min.css" media="all" />
    <style>
        .layui-body{background: no-repeat url("./image/3.jpg");background-size: 100%}
    </style>

</head>
<body class="layui-layout-body">
<div class="layui-layout layui-layout-admin">
    <div class="layui-header">
        <div class="layui-logo">后台管理系统</div>
        <ul class="layui-nav layui-layout-left">
            <li class="layui-nav-item layui-this"><a href="javascript:;">控制台</a></li>
        </ul>
        <ul class="layui-nav layui-layout-right ">
            <li class="layui-nav-item">
                <a href="javascript:;">
                    <i class="layui-icon">;</i> 皮肤
                </a>
                <dl class="layui-nav-child skin">
                    <dd><a href="javascript:;" data-skin="default" style="color:#393D49;"><i class="layui-icon">&#xe658;</i> 默认</a></dd>
                    <dd><a href="javascript:;" data-skin="orange" style="color: #FF5722;"><i class="layui-icon">&#xe658;</i> 橘子橙</a></dd>
                    <dd><a href="javascript:;" data-skin="green" style="color:#00a65a;"><i class="layui-icon">&#xe658;</i> 原谅绿</a></dd>
                    <dd><a href="javascript:;" data-skin="pink" style="color:#FA6086;"><i class="layui-icon">&#xe658;</i> 少女粉</a></dd>
                    <dd><a href="javascript:;" data-skin="blue.1" style="color:#00c0ef;"><i class="layui-icon">&#xe658;</i> 天空蓝</a></dd>
                    <dd><a href="javascript:;" data-skin="red" style="color:#dd4b39;"><i class="layui-icon">&#xe658;</i> 枫叶红</a></dd>
                </dl>
            </li>
            <li class="layui-nav-item">
                <dl class="layui-nav-child">
                    <dd><a href="javascript:;"><span>基本资料</span></a></dd>
                    <dd><a href="javascript:;">安全设置</a></dd>
                </dl>
            </li>
            <li class="layui-nav-item"><a href="login.html"><i class="fa fa-sign-out" aria-hidden="true"></i> 注销</a></li>
        </ul>
    </div>
    <div class="layui-side layui-bg-green">
        <div class="layui-side-scroll">
            <div class="kit-side-fold"><i class="fa fa-navicon" aria-hidden="true"></i></div>
            <ul class="layui-nav layui-nav-tree layui-inline" lay-filter="demo" style="margin-right: 100px;">
                <li class="layui-nav-item layui-nav-itemed">
                    <a href="javascript:;">活动管理</a>
                    <dl class="layui-nav-child">
                        <dd><a href="activity.jsp">发布预告</a></dd>
                        <dd><a href="javascript:;">宣传总结</a></dd>
                        <dd><a href="javascript:;">活动报名表</a></dd>
                    </dl>
                </li>
                <li class="layui-nav-item">
                    <a href="javascript:;">画作管理</a>
                    <dl class="layui-nav-child">
                        <dd><a href="uppainting.jsp">添加画作</a></dd>
                        <dd><a href="">查看画作</a></dd>
                    </dl>
                </li>
                <li class="layui-nav-item">
                    <a href="javascript:;">画手管理</a>
                    <dl class="layui-nav-child">
                        <dd><a href="">添加画手</a></dd>
                        <dd><a href="">查看画手</a></dd>
                    </dl>
                </li>
                <li class="layui-nav-item">
                    <a href="javascript:;">私人订制</a>
                    <dl class="layui-nav-child">
                        <dd><a href="">a</a></dd>
                        <dd><a href="">b</a></dd>
                    </dl>
                </li>
            </ul>
        </div>
    </div>
    <div class="layui-body"></div>
    <div class="layui-footer">传风画网</div>
</div>
<script src="AdminTemplate/plugins/layui/layui.js"></script>
<script>

    layui.use('element', function(){
        var element = layui.element;

        //一些事件监听
        element.on('tab(demo)', function(data){
            console.log(data);
        });
    });
</script>

</body>
</html>
