<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html lang="en">

<head>
    <title>Ibcs-primax</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <link href="https://fonts.googleapis.com/css?family=Rubik:400,700|Crimson+Text:400,400i" rel="stylesheet">

    <link href="<c:url value="/resources/contact/fonts/icomoon/style.css" />" rel="stylesheet">
    <link href="<c:url value="/resources/contact/css/bootstrap.min.css" />" rel="stylesheet">
    <link href="<c:url value="/resources/contact/css/magnific-popup.css" />" rel="stylesheet">
    <link href="<c:url value="/resources/contact/css/jquery-ui.css" />" rel="stylesheet">
    <link href="<c:url value="/resources/contact/css/owl.carousel.min.css" />" rel="stylesheet">
    <link href="<c:url value="/resources/contact/css/owl.theme.default.min.css" />" rel="stylesheet">
    <link href="<c:url value="/resources/contact/css/aos.css" />" rel="stylesheet">
    <link href="<c:url value="/resources/contact/css/style.css" />" rel="stylesheet">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">


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

<div class="site-section">
    <div class="container">
        <div class="row">
            <div class="col-md-12">
                <h5 class="card-title">Add salary:</h5>
            </div>

            <div class="col-md-12">
                <div class="card">

                    <div class="card-body">

                        <form class="form-detail" action="addSalary" method="post" id="form">
                            <div class="contact">

                                <div class="row">

                                    <div class="col-md-6 ">

                                        <label class="col-form-label">Grade</label>
                                        <select name="gradeName" id="gradeName">
                                            <c:forEach items="${gradeList}" var="grade">
                                                <option value="${grade.gradeName}">${grade.gradeName}</option>
                                            </c:forEach>
                                        </select

                                    </div>


                                    <div class="col-md-6 ">
                                        <label class="col-form-label">BasicSalary</label>
                                        <input type="text" class="form-control" placeholder="Enter basicSalary"
                                               id="basicSalary" name="basicSalary"   >


                                    </div>



                                    <br>

                                    <div class="submit">
                                        <input type="submit" class="form-control">
                                    </div>
                                </div>
                            </div>

                        </form>
                    </div>
                </div>
            </div>
        </div>

    </div>
</div>
</div>







<script src="<c:url value="/resources/contact/js/jquery-3.3.1.min.js" />"></script>
<script src="<c:url value="/resources/contact/js/jquery-ui.js" />"></script>
<script src="<c:url value="/resources/contact/js/popper.min.js" />"></script>
<script src="<c:url value="/resources/contact/js/bootstrap.min.js" />"></script>
<script src="<c:url value="/resources/contact/js/owl.carousel.min.js" />"></script>
<script src="<c:url value="/resources/contact/js/jquery.magnific-popup.min.js" />"></script>
<script src="<c:url value="/resources/contact/js/aos.js" />"></script>
<script src="<c:url value="/resources/contact/js/main.js" />"></script>


</body>

</html>
