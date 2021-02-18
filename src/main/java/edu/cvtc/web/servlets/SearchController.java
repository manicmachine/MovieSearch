package edu.cvtc.web.servlets;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.cvtc.web.dao.MovieDao;
import edu.cvtc.web.dao.impl.MovieDaoException;
import edu.cvtc.web.dao.impl.MovieDaoImpl;
import edu.cvtc.web.model.Movie;

/**
 * @author csather
 *
 */

@WebServlet("/Search")
public class SearchController extends HttpServlet {

	private static final long serialVersionUID = 7816157202142924320L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String target = null;
		
		try {
			
			final MovieDao movieDao = new MovieDaoImpl();
			
			final List<Movie> movies = movieDao.retrieveMovies();
			final List<Movie> filteredMovies;
			
			final String searchBy = request.getParameter("searchBy");
			final String searchValue = request.getParameter("searchValue");
			
			if (searchBy.equals("title")) {	
				
				filteredMovies = movies
									.stream()
									.filter((movie) -> movie.getTitle().equalsIgnoreCase(searchValue))
									.collect(Collectors.toList());
				
			} else {
				
				filteredMovies = movies
									.stream()
									.filter((movie) -> movie.getDirector().equalsIgnoreCase(searchValue))
									.collect(Collectors.toList());
				
			}
			
			request.setAttribute("movies", filteredMovies);
			
			target = "view-all.jsp";
			
		} catch(MovieDaoException e) {
			
			e.printStackTrace();
			request.setAttribute("message", e.getMessage());
			
			target = "error.jsp";
			
		}
		
		request.getRequestDispatcher(target).forward(request, response);
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
