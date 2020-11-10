<%@ taglib prefix="https" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: tanvir
  Date: 7/6/2020
  Time: 7:54 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Employee Info.</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="css/jquery.morecontent.css">


    <link href="<c:url value="/resources/table/demo/css/jquery.morecontent.css" />" rel="stylesheet">
    <link href="<c:url value="/resources/table/demo/css/demo.css" />" rel="stylesheet">
    <!--===============================================================================================-->

    <link href="<c:url value="/resources/table/images/icons/favicon.ico" />" rel="stylesheet">
    <!--===============================================================================================-->

    <link href="<c:url value="/resources/table/vendor/bootstrap/css/bootstrap.min.css" />" rel="stylesheet">
    <!--===============================================================================================-->

    <link href="<c:url value="/resources/table/fonts/font-awesome-4.7.0/css/font-awesome.min.css" />" rel="stylesheet">
    <!--===============================================================================================-->

    <link href="<c:url value="/resources/table/vendor/animate/animate.css" />" rel="stylesheet">
    <!--===============================================================================================-->

    <link href="<c:url value="/resources/table/vendor/select2/select2.min.css" />" rel="stylesheet">
    <!--===============================================================================================-->

    <link href="<c:url value="/resources/table/vendor/perfect-scrollbar/perfect-scrollbar.css" />" rel="stylesheet">
    <!--===============================================================================================-->

    <link href="<c:url value="/resources/table/css/util.css" />" rel="stylesheet">

    <link href="<c:url value="/resources/table/css/main.css" />" rel="stylesheet">
    <!--===============================================================================================-->
</head>
<body>


<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
    <a class="navbar-brand" href="#"></a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarText" aria-controls="navbarText" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarText">
        <ul class="navbar-nav mr-auto">
            <li class="nav-item active">
                <a class="nav-link" href="/home">Home <span class="sr-only">(current)</span></a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="/employeeview">Employee Info.</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="#"></a>
            </li>
        </ul>
        <span class="navbar-text">

    </span>
    </div>
</nav>

<div class="limiter">
    <div class="container-table100">

        <div class="wrap-table100">


            <div class="table100">

                <table>
                    <thead>
                    <tr class="table100-head">
                        <th class="column1 text-left">No.:</th>
                        <th class="column2 text-left">Name:</th>
                        <th class="column3 text-left">Address:</th>
                        <th class="column4 text-left">Mobile:</th>
                        <th class="column5 text-left">Bank account:</th>
                        <th class="column6 text-left">Salary</th>
                        <th class="column7 text-left">Edit</th>
                        <th class="column8 text-left">Delete</th>
                    </tr>
                    </thead>
                    <tbody>

                    <c:set var="count" value="0" scope="page"></c:set>

                    <c:forEach var="abc" items="${gradeList}">


                        <c:set var="count" value="${count + 1}" scope="page"></c:set>

                        <tr>
                            <td class="column1 text-left" >${count}</td>


                            <td class="column2 text-left">${abc.name}</td>
                            <td class="column3 text-left">${abc.address}</td>
                            <td class="column4 text-left">${abc.mobile}</td>
                            <td class="column5 text-left">${abc.bankAccount}</td>
                            <td class="column6 text-left">${abc.basicSalary}</td>



                            <td class="column7 text-left"><a href="/update-employee?id=${abc.id }"> Update<span>
                                     <i class="fa fa-edit"></i></span></a></td>

                            <td class="column8 text-left"><a href="/delete-employee?id=${abc.id }"> Delete<span>
                                     <i class="fa fa-trash-o"></i></span></a></td>


                        </tr>
                    </c:forEach>

                    </tbody>
                </table>
            </div>
        </div>
    </div>
</div>



<script src="<c:url value="/resources/table/vendor/jquery/jquery-3.2.1.min.js" />"> </script>
<!--===============================================================================================-->
<script src="<c:url value="https://code.jquery.com/jquery-1.12.4.min.js"/>"></script>

<!--===============================================================================================-->

<script src="<c:url value="/resources/table/vendor/bootstrap/js/popper.js" />"> </script>
<!--===============================================================================================-->

<script src="<c:url value="/resources/table/vendor/bootstrap/js/bootstrap.min.js" />"> </script>
<!--===============================================================================================-->

<script src="<c:url value="/resources/table/vendor/select2/select2.min.js" />"> </script>
<!--===============================================================================================-->

<script src="<c:url value="/resources/table/js/main.js" />"> </script>


<script src="<c:url value="/resources/table/demo/js/jquery.morecontent.js" />"> </script>


<script src="<c:url value="/resources/table/demo/js/demo.js" />"> </script>

</body>
</html>
