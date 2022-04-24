<%--
  Created by IntelliJ IDEA.
  User: 86155
  Date: 2022/4/18
  Time: 13:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--导入jstl核心标签库--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--导入jstl格式化标签库--%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>show....</h2>
<br>
显示单个日期：${mydate}
<br><br><br>
<h2>学生集合</h2>
<table width="800px" border="1" >
    <tr>
        <th>姓名</th>
        <th>生日</th>
    </tr>
    <c:forEach items="${list}" var="stu">
        <tr>
            <th>${stu.name}</th>
            <th>${stu.birthday}----- <fmt:formatDate value="${stu.birthday}" pattern="yyyy-MM-dd"></fmt:formatDate> </th>
        </tr>

    </c:forEach>
</table>
</body>
</html>
