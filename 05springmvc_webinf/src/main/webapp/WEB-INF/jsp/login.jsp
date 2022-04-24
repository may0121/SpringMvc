<%--
  Created by IntelliJ IDEA.
  User: 86155
  Date: 2022/4/19
  Time: 11:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<br><br>
${msg}
<form action="${pageContext.request.contextPath}/login">
    用户名：<input name="name"><br>
    密码：<input type="password" name="pwd"><br>
    <input type="submit" value="登录"><br>
</form>
</body>
</html>
