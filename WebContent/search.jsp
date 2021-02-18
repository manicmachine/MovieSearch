<!doctype html>
<html>
	<head>
		<title>Movie Application: Search</title>
		<meta name="description" content="Movie Application search page.">
		<%@ include file="includes/styles.jsp" %>
	</head>
	<body>
		<div class="container">
			<div class="hero-unit">
				<h1>Search</h1>
			</div>
			<%@ include file="includes/navigation.jsp" %>
			<div class="container">
				<form action="Search" method="post">
					<label for="searchBy">Search movies by...</label><br>
					<input type="radio" id="titleRadio" name="searchBy" value="title" checked>Title<br>
					<input type="radio" id="directorRadio" name="searchBy" value="director">Director<br>
					
					<input type="text" id="searchValue" name="searchValue" placeholder="Movie title...">
					
					<input type="submit" value="Search!">
				</form>
			</div>
			<%@ include file="includes/footer.jsp" %>
		</div>
		<%@ include file="includes/scripts.jsp" %>
	</body>
	<script src="assets/js/search.js" type="text/javascript"></script>
</html>