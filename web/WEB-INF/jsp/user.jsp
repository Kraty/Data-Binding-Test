<%--
  Created by IntelliJ IDEA.
  User: 14576
  Date: 2020/7/7
  Time: 16:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>用户列表</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/deleteUser" method="post">
    <table width="20%" border=1>
        <tr>
            <td>选择</td>
            <td>用户名</td>
        </tr>
        <tr>
            <td><label>
                <input name="ids" value="1" type="checkbox">
            </label></td>
            <td>tom</td>
        </tr>
        <tr>
            <td><label>
                <input name="ids" value="2" type="checkbox">
            </label></td>
            <td>jack</td>
        </tr>
        <tr>
            <td><label>
                <input name="ids" value="3" type="checkbox">
            </label></td>
            <td>lucy</td>
        </tr>
    </table>
    <input type="submit" value="删除">
</form>
</body>
</html>
