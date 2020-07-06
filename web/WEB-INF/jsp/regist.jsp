<%--
  Created by IntelliJ IDEA.
  User: 14576
  Date: 2020/7/6
  Time: 16:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/registUser" method="post">
    用户名：<input type="text" name="username"/><br/>
    密&nbsp;&nbsp;&nbsp;码：<input type="password" name="password"/><br/>
    <input type="submit" value="注册">
</form>
</body>
</html>
