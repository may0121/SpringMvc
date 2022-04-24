<%--
  Created by IntelliJ IDEA.
  User: 86155
  Date: 2022/4/17
  Time: 11:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>mian... 显示数据</h2>
<%--
        request.setAttribute("requestUsers",u);
        session.setAttribute("sessionUsers",u);
        model.addAttribute("modelUsers",u);
        map.put("mapUsers",u);
        modelMap.addAttribute("modelMapUsers",u);--%>
requestUsers:${requestUsers}<br>
sessionUsers:${sessionUsers}<br>
modelUsers:${modelUsers}<br>
mapUsers:${mapUsers}<br>
modelMapUsers:${modelMapUsers}<br>
index.jsp页面的数据带到main页面：${param.name}
</body>
</html>
