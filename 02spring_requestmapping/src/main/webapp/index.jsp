<%--
  Created by IntelliJ IDEA.
  User: 86155
  Date: 2022/4/17
  Time: 11:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>测试不同的请求</h2>
<form action="${pageContext.request.contextPath}/req.action" method="post">
    <input type="submit" value="提交">
</form>
<br>
<h2>第一种数据提交测试</h2>
<form action="${pageContext.request.contextPath}/one.action">
    姓名：<input name="myname"><br>
    年龄：<input name="age"><br>
    <input type="submit" value="提交">
</form>
<br>
<h2>第二种数据提交测试</h2>
<form action="${pageContext.request.contextPath}/two.action">
    姓名：<input name="name"><br>
    年龄：<input name="age"><br>
    <input type="submit" value="提交">
</form>
<br>
<h2>第三种动态占位符提交</h2>
<a href="${pageContext.request.contextPath}/three/张三/22.action">动态提交</a>
<br>
<h2>第四种请求参数名称映射</h2>
<form action="${pageContext.request.contextPath}/four.action " method="post">
    姓名：<input name="name"><br>
    年龄：<input name="age"><br>
    <input type="submit" value="提交">
</form>
<br>
<h2>第五种手动接收数据</h2>
<form action="${pageContext.request.contextPath}/five.action">
    姓名：<input name="name"><br>
    年龄：<input name="age"><br>
    <input type="submit" value="提交">
</form>
</body>
</html>
