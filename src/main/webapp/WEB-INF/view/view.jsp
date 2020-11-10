
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: tanvir
  Date: 11/9/2020
  Time: 3:14 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:set var="count" value="0" scope="page"></c:set>

<c:forEach var="student" items="${students}">
    <c:set var="count" value="${count + 1}" scope="page"></c:set>






    <label class="col-form-label">Grade</label>


    <input type="text" class="form-control" placeholder="gradeName" name="gradeName" id="gradeName" required="required"  value="${student.gradeName}" >

</c:forEach>
</body>
</html>
