<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: tanvir
  Date: 11/8/2020
  Time: 8:10 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home</title>

    <link href="https://fonts.googleapis.com/css?family=Rubik:400,700|Crimson+Text:400,400i" rel="stylesheet">

    <link href="<c:url value="/resources/contact/fonts/icomoon/style.css" />" rel="stylesheet">
    <link href="<c:url value="/resources/contact/css/bootstrap.min.css" />" rel="stylesheet">
    <link href="<c:url value="/resources/contact/css/magnific-popup.css" />" rel="stylesheet">
    <link href="<c:url value="/resources/contact/css/jquery-ui.css" />" rel="stylesheet">
    <link href="<c:url value="/resources/contact/css/owl.carousel.min.css" />" rel="stylesheet">
    <link href="<c:url value="/resources/contact/css/owl.theme.default.min.css" />" rel="stylesheet">
    <link href="<c:url value="/resources/contact/css/aos.css" />" rel="stylesheet">
    <link href="<c:url value="/resources/contact/css/style.css" />" rel="stylesheet">

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
<br>

<div class="container-fluid">
<div class="row">
    <div class="col" >
        <div class="dropdown">
            <button class="btn btn-secondary dropdown-toggle" type="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                Inputs:
            </button>
            <div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
                <a class="dropdown-item" href="/grade">Grade Information: </a>
                <a class="dropdown-item" href="/employee">Employee Information: </a>
                <a class="dropdown-item" href="/salarydistribution">Basic salary of the lowest grade:</a>
            </div>
        </div>
    </div>
    <div class="col"></div>
</div>
</div>

<script src="<c:url value="/resources/contact/js/jquery-3.3.1.min.js" />"> </script>


<script src="<c:url value="/resources/contact/js/jquery-ui.js" />"> </script>


<script src="<c:url value="/resources/contact/js/popper.min.js" />"> </script>


<script src="<c:url value="/resources/contact/js/bootstrap.min.js" />"> </script>


<script src="<c:url value="/resources/contact/js/owl.carousel.min.js" />"> </script>


<script src="<c:url value="/resources/contact/js/jquery.magnific-popup.min.js" />"> </script>


<script src="<c:url value="/resources/contact/js/aos.js" />"> </script>

<script src="<c:url value="/resources/contact/js/main.js" />"> </script>

</body>
</html>
