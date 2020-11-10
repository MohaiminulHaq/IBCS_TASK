<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<%--
  Created by IntelliJ IDEA.
  User: tanvir
  Date: 7/6/2020
  Time: 4:01 PM
  To change this template use File | Settings | File Templates.
--%>
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



<div class="site-section">
    <div class="container">
        <div class="row">
            <div class="col-md-12">
                <h5 class="card-title">Grade:</h5>
            </div>

            <div class="col-md-12">
                <div class="card" >

                    <div class="card-body">

                        <form class="form-detail" action="addGrade" method="post" id="form">
                            <div class="contact">
                                <div class="row">

                                    <div class="col-md-12">
                                        <label class="col-form-label">Input Grade</label>
                                        <input type="text" class="form-control" placeholder="Enter grade" id="gradeName" name="gradeName" required="required">

                                        <label class="col-form-label">Remarks</label>
                                        <input type="text" class="form-control" placeholder="Enter remarks" id="remarks" name="remarks" required="required">

                                        <input type="checkbox" id="isActive" name="isActive">
                                        <label class="form-check-label" for="isActive">Active</label>



                                        <div class="row">

                                        <div class="col-md-6">
                                            <input type="submit" class="form-control">
                                        </div>

                                            <div class="col-md-6">
                                                <a href="/grade" class="btn btn-info form-control" role="button">Cancel</a>



                                            </div>
                                    </div>

                                    </div>


                                </div>



                            </div>
                            <br>




                        </form>



                    </div>
                </div>



            </div>


        </div>

    </div>
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
