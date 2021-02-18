<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<title>Movie Application: View all</title>
		<meta name="description" content="Movie Application view all movies page.">
		<%@ include file="includes/styles.jsp" %>
	</head>
	<body>

		<div class="container">
			<div class="hero-unit">
				<h1>Movie List</h1>
			</div>
			<%@ include file="includes/navigation.jsp" %>
			
			<div class="container">
				<c:choose>
					<c:when test="${empty movies}">
						<p>Sorry, the list of movies is empty.</p>
					</c:when>
					<c:otherwise>
						<table>
							<c:forEach var="movie" items="${movies}">
								<tr>
									<th>${movie.title}</th>
									<th>${movie.director}</th>
									<th>${movie.lengthInMinutes}</th>
								</tr>
							</c:forEach>
						</table>
					</c:otherwise>
				</c:choose>
			</div>
			<%@ include file="includes/footer.jsp" %>
		</div>
		<%@ include file="includes/scripts.jsp" %>
	</body>
</html>