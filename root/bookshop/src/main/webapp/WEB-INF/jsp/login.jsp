<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/jsp/common/define.jsp"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link
        href="https://fonts.googleapis.com/css2?family=Great+Vibes&family=Poppins:wght@100;200;300;400;500;600;700;800&display=swap"
        rel="stylesheet">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <link rel="stylesheet" href="./css/animate.css">
    <link rel="stylesheet" href="./css/owl.carousel.min.css">
    <link rel="stylesheet" href="./css/owl.theme.default.min.css">

    <link rel="stylesheet" href="./css/aos.css">

    <link rel="stylesheet" href="http://code.ionicframework.com/ionicons/2.0.1/css/ionicons.min.css">

    <link rel="stylesheet" href="./css/bootstrap-datepicker.css">
    <link rel="stylesheet" href="./css/jquery.timepicker.css">


    <link rel="stylesheet" href="./css/flaticon.css">
    <link rel="stylesheet" href="./css/icomoon.css">
    <link rel="stylesheet" href="./css/style.css">
    <title>Document</title>
</head>

<body>
	    <!-- order a cake section starts -->

    <section class="ftco-section img" id="order" style="background-image: url(./images/order_bg.jpg);"
        data-stellar-background-ratio="0.5">
        <div class="container">
            <div class="row d-flex">
                <div class="col-md-7 ftco-animate makereservation p-4 px-md-5 pb-md-5">
                    <div class="heading-section ftco-animate mb-5 text-center">
                        <span class="subheading">Welcom to</span><br>
                        <h2 class="mb-4">Fairy's Cake</h2>
                    </div>
                    <form action="#">
                        <div class="row">
                            <div class="col-md-6">
                                <div class="form-group">
                                    <label for="">Email</label>
                                    <input type="email" class="form-control" placeholder="">
                                </div>
                            </div>
                            <div class="col-md-6">
                                <div class="form-group">
                                    <label for="">Password</label>
                                    <input type="text" class="form-control" placeholder="">
                                </div>
                            </div>
                            <div class="col-md-12 mt-3">
                                <div class="form-group text-center">
                                    <input type="submit" value="Login" class="btn btn-primary py-3 px-5">
                                </div>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </section>
    <!-- order a cake section ends -->
        <!-- scripts -->
    <script src="./js/jquery.min.js"></script>
    <script src="./js/jquery-migrate-3.0.1.min.js"></script>
    <script src="./js/bootstrap.min.js"></script>
    <script src="./js/jquery.waypoints.min.js"></script>
    <script src="./js/jquery.stellar.min.js"></script>
    <script src="./js/owl.carousel.min.js"></script>
    <script src="./js/jquery.magnific-popup.min.js"></script>
    <script src="./js/aos.js"></script>
    <script src="./js/jquery.animateNumber.min.js"></script>
    <script src="./js/bootstrap-datepicker.js"></script>
    <script src="./js/jquery.timepicker.min.js"></script>
    <script src="./js/scrollax.min.js"></script>
    <script src="./js/main.js"></script>
</body>

</html>

















<div id="section">
	<div id="article">

${SPRING_SECURITY_LAST_EXCEPTION.message}
	<h1>ログイン</h1>
	<form:form modelAttribute="loginForm" action="auth">
	<form:errors path="*"/>
	<dl>
		<dt>ログインID</dt>
		<dd><form:input path="username"/></dd>
		<dt>パスワード</dt>
		<dd><form:input path="password"/></dd>
	</dl>
	<input type="submit" value="ログイン" class="btn">
	</form:form>

	</div>
</div>
<jsp:include page="/WEB-INF/jsp/common/footer.jsp"></jsp:include>
