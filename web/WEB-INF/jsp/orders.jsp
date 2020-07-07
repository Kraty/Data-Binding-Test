<%--
  Created by IntelliJ IDEA.
  User: 14576
  Date: 2020/7/6
  Time: 16:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>订单查询页面</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/findOrders" method="post">
    订单编号：<input type="text" name="oId"/><br/>
    所属用户：<input type="text" name="user.username"/><br/>
    <input type="submit" value="查询"/>
</form>
</body>
</html>
