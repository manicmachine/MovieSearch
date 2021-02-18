<!doctype html>
<html>
	<head>
		<title>Movie Application: Populate Database</title>
		<meta name="description" content="Movie Application populate database page.">
		<%@ include file="includes/styles.jsp" %>
	</head>
	<body>
		<div class="container">
			<div class="hero-unit">
				<h1>Populate Movie Database</h1>
			</div>
			<%@ include file="includes/navigation.jsp" %>
			<div class="container">
				<form action="PopulateDatabase" method="post">
					<p>Click below to populate the Movie Database!</p>
					<br>
					<p class="warning">Warning: Submitting this form will reset the database!</p>
					<input type="submit" value="Populate!">
				</form>
			</div>
			<%@ include file="includes/footer.jsp" %>
		</div>
		<%@ include file="includes/scripts.jsp" %>
	</body>
</html>