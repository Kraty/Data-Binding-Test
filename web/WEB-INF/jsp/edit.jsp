<%--
  Created by IntelliJ IDEA.
  User: 14576
  Date: 2020/7/7
  Time: 16:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/editUser" method="post">
    <table width="20%" border=1>
        <tr>
            <td>选择</td>
            <td>用户名</td>
        </tr>
        <tr>
            <td><label>
                <input name="users[0].id" value="1" type="checkbox">
            </label></td>
            <td><label>
                <input name="users[0].username" value="tom" type="text">
            </label></td>
        </tr>
        <tr>
            <td><label>
                <input name="users[1].id" value="2" type="checkbox">
            </label></td>
            <td><label>
                <input name="users[1].username" value="jack" type="text">
            </label></td>
        </tr>
    </table>
    <input type="submit" value="修改">
</form>
</body>
</html>
