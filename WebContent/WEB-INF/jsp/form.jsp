<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html lang="en" xmlns:th="http://www.thymeleaf.org">

 <head>
 
	<%-- <%@ include file="spring-url.jsp" %> --%>
	<spring:url value="/resources/css/bootstrap.css" var="bootstrap_css" />
 	<spring:url value="/resources/css/font-awesome.css" var="fa_css" />
 	<spring:url value="/resources/js/bootstrap.js" var="bootstrap_js" />
 	<spring:url value="/resources/css/styles.css" var="style_css" />
 	
   	<meta charset="utf-8">
   	<meta http-equiv="X-UA-Compatible" content="IE=edge">
   	<meta name="viewport" content="width=device-width, initial-scale=1">
   	<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
   	<title>Bootstrap 101 Template</title>

   	<!-- Bootstrap -->
   	<link href="${bootstrap_css}" rel="stylesheet">
   	<link href="${fa_css}" rel="stylesheet">
   	<link href="https://fonts.googleapis.com/css?family=Fjalla+One" rel="stylesheet">
   	<link href="${style_css}" rel="stylesheet">

   	<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
   	<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
   	<!--[if lt IE 9]>
     <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
     <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
   	<![endif]-->
 	</head>
 
 	<body>
 	
	 	<div class="container"> 
	 	
	   		<div class="page-header">
	  			<h1>Subscribe to BowHunting Magazine</h1>
			</div>
			
			<form action="#" th:action="@{/form}" th:object="${formModel}" method="post">		
				<div class="form-group">
					<label class="control-label" for="exampleInputEmail1">Email address</label> 
					<input type="email" th:field="*{email}" class="form-control" id="exampleInputEmail1" placeholder="Email">
				</div>
				<div class="form-group">
					<label for="exampleInputPassword1">Password</label> 
					<input type="password" th:field="*{password}" class="form-control" id="exampleInputPassword1" placeholder="Password">
				</div>
				<button type="submit" class="btn btn-default">Submit</button>
			</form>
			
		</div>

    	<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    	<!-- Include all compiled plugins (below), or include individual files as needed -->
    	<script src="${bootstrap_js}"></script>
  	</body>
  
</html>