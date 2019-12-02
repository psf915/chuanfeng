<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/12/1 0001
  Time: 17:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>上传画作</title>
    <link rel="stylesheet" href="AdminTemplate/plugins/layui/css/layui.css" media="all">
</head>
<body>
<form action="${pageContext.request.contextPath }/UppaintingServlet" method="post">
<fieldset class="" style="margin-top: 20px;">
    <legend>添加画作信息</legend>

<form class="layui-form">
    <div class="layui-form-item">
        <label class="layui-form-label">画作名称</label>
        <div class="layui-input-block"><!--一个表单元素占一行
                                            layui-input-inline多个表单控件占一行，一行可以放置多个表单元素-->
            <input type="text" name="name"    class="layui-input">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">画作种类</label>
        <div class="layui-input-block">
            <input type="radio" name="kind" value="山水" class="layui-input">山水
            <input type="radio" name="kind" value="星空" class="layui-input">星空
            <input type="radio" name="kind" value="人物" class="layui-input">人物
        </div>
    </div>
</form>
        <div class="">
            <label class="">画作名称</label>
            <input type="text" name="name" >
        </div>
        <div class="">
            <label class="">画作种类</label>
            <div class="">
                <input type="radio" name="kind" value="山水">山水
                <input type="radio" name="kind" value="星空">星空
                <input type="radio" name="kind" value="人物">人物
            </div>
        </div>
        <div class="">
            <label class="">画作尺寸</label>
            <div class="">
                <input type="text" name="length"  placeholder="长度">
                <input type="text" name="width" placeholder="宽度">
            </div>
        </div>
        <div class="">
            <label class="">画家</label>
            <div class="">
                <input type="text" name="author">
            </div>
        </div>
        <div class="">
            <div class="">
                <input type="submit" value="提交"></div>
                <button type="reset" >重置</button>
            </div>
        </div>


</fieldset>

</form>
</body>
</html>
