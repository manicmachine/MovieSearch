$(function() {
	
	$titleRadio = $("#titleRadio");
	$directorRadio = $("#directorRadio");
	$searchValue = $("#searchValue");

	$titleRadio.click(function() {
		$searchValue.attr("placeholder", "Movie title...");
	});
	
	$directorRadio.click(function() {
		$searchValue.attr("placeholder", "Movie director...");
	});
	
});