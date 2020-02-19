<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>All Users</title>
</head>
<body>
<h1>All Users</h1>
<p><a href="/admin/add">Add Users</a> |
    <a href="/admin/update">Update Users</a> |
    <a href="/admin/delete">Delete Users</a>
</p>
<c:if test="${list.size() > 0}">
    <table border="1px solid black">
        <tr>
            <td>Id</td>
            <td>Name</td>
            <td>Password</td>
            <td>Message</td>
        </tr>

        <c:forEach var="user" items="${list}">
            <tr>
                <td>${user.getId()}</td>
                <td>${user.getName()}</td>
                <td>${user.getPassword()}</td>
                <td>${user.getMessage()}</td>
            </tr>

        </c:forEach>
    </table>
</c:if>
<c:if test="${list.size() == 0}">
    <h3>Table is empty</h3>
</c:if>
</body>
</html>
