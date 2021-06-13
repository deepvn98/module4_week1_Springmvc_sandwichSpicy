<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 13/6/2021
  Time: 12:18 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>danh sách gia vị của sandwich</h1><br><br>
<ul>
    <c:forEach var="giavi" items="${sandwich}">
        <li>${giavi}</li>
    </c:forEach>
</ul>
</body>
</html>
