 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
 
</head>
<body  background="../img/log01.jpg"  >

	<div class="container" style="width: 30%"  >
 
		<h2 style="color:white">please log in</h2>
		<span  style="color: orange">${errorMessage}</span>
		<hr>
		<form action="welcome" method="post">
			<div class="form-group">
				<label for="username">User:</label> 
				<input type="text" class="form-control"   placeholder="Enter username" name="username">
			</div>
			<div class="form-group">
				<label for="pwd">Password:</label> 
				<input type="text" class="form-control"   placeholder="Enter password" name="pwd">
			</div>
			 
			<button type="submit" class="btn btn-primary">Submit</button>
		</form>
	</div>




</body>
</html>