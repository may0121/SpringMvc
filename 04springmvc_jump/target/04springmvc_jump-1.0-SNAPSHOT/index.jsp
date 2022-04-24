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
<a href="${pageContext.request.contextPath}/one.action">请求转发页面（默认）</a>
<a href="${pageContext.request.contextPath}/two.action">请求转发action</a>
<a href="${pageContext.request.contextPath}/three.action">重定向页面</a>
<a href="${pageContext.request.contextPath}/four.action">重定向action</a>
<br><br>
<a href="${pageContext.request.contextPath}/data.action?name=may">请求参数携带数据到服务器</a>
<br><br><br>
<form action="${pageContext.request.contextPath}/mydate.action">
    日期:<input type="date" name="mydate"><br>
    <input type="submit" value="提交">
</form>
<br><br><br>
<a href="${pageContext.request.contextPath}/list.action">显示集合中学生信息</a>
</body>
</html>
