<!DOCTYPE html>
<html>
	<head>
		<title>Movie Application: Error 404 - Page Not Found</title>
		<meta name="description" content="Movie application - error 404 page.">
		<%@ include file="includes/styles.jsp" %>
	</head>
	<body>
		<div class="container">
			<div class="hero-unit">
				<h1>404 - Sorry!</h1>
			</div>
			<%@ include file="includes/navigation.jsp" %>
			<div class="container">
				<p>Sorry, this page doesn't appear to exist.</p>
				<p>To continue, click the Back button.</p>
			</div>
			<%@ include file="includes/footer.jsp" %>
		</div>
		<%@ include file="includes/scripts.jsp" %>
	</body>
</html>