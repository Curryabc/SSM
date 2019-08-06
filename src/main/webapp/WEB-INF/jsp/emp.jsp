<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 96047
  Date: 2019/7/25
  Time: 16:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>emp</title>
</head>
<body>
<table border="1">
    <tr>
        <th>编号</th>
        <th>姓名</th>
        <th>工资</th>
    </tr>
    <c:forEach items="${requestScope.emps}" var="emp">
        <tr>
            <td>${emp.id}</td>
            <td>${emp.empname}</td>
            <td>${emp.salary}</td>
        </tr>
    </c:forEach>
</table><br/>
</body>
</html>
