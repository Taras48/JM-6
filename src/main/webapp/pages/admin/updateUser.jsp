<%--
  Created by IntelliJ IDEA.
  User: TARAZ
  Date: 09.10.2019
  Time: 19:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>UpdateUser</title>
</head>
<body>
<h1>Update User</h1>
<p><a href="/admin">All Users</a> |
    <a href="/admin/add">add Users</a> |
    <a href="/admin/delete">Delete Users</a>
</p>
<form action="/admin/update" method="post">
    <p> <input type="hidden" name="id"  value="${param.id}"/>
        NewName: <input type="text" name="name" value="${param.name}"/>
        NewMessage: <input type="text" name="message"value="${param.message}" /></p>
    <p>NewPassword: <input type="password" name="password" value="${param.password}"></p>
    <br/><br/>
    <button>Update user</button>
</form>

</body>
</html>
