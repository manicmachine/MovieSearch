<!DOCTYPE html>
<html>
	<head>
		<title>Movie Application: Add New Movie</title>
		<meta name="description" content="Movie Application add a new movie page.">
		<%@ include file="includes/styles.jsp" %>
	</head>
	<body>
		<div class="container">
		
			<div class="hero-unit">
				<h1>Add A Movie</h1>
			</div>
			<%@ include file="includes/navigation.jsp" %>
			<div class="container">
				<form action="AddMovie" method="post">
					<label for="title"><strong>Title</strong></label><br>
					<input name="title" placeholder="Movie title..."><br>
					
					<label for="director"><strong>Director</strong></label><br>
					<input name="director" placeholder="Movie director..."><br>
					
					<label for="lengthInMinutes"><strong>Length in minutes</strong></label><br>
					<input name="lengthInMinutes" placeholder="Movie length..."><br>
					
					<input type="submit" value="Add Movie">
				</form>
			</div>
			<%@ include file="includes/footer.jsp" %>
		</div>
	<%@ include file="includes/scripts.jsp" %>
	</body>
</html>