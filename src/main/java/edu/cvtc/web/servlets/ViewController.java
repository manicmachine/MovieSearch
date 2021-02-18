package edu.cvtc.web.servlets;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.cvtc.web.comparators.DirectorComparator;
import edu.cvtc.web.comparators.LengthComparator;
import edu.cvtc.web.comparators.TitleComparator;
import edu.cvtc.web.dao.MovieDao;
import edu.cvtc.web.dao.impl.MovieDaoException;
import edu.cvtc.web.dao.impl.MovieDaoImpl;
import edu.cvtc.web.model.Movie;

@WebServlet("/ViewAll")
public class ViewController extends HttpServlet {
	
	private static final long serialVersionUID = 4489132062487958593L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String target = null;
		
		try {
			
			final MovieDao movieDao = new MovieDaoImpl();
			
			final List<Movie> movies = movieDao.retrieveMovies();
			
			final String sortType = request.getParameter("sortType");
			
			if (sortType != null) {
				sortMovies(movies, sortType);
			}
			
			request.setAttribute("movies", movies);
			
			target = "view-all.jsp";
			
		} catch (MovieDaoException e) {
			
			e.printStackTrace();
			request.setAttribute("message", e.getMessage());
			
			target = "error.jsp";
		} 
		
		request.getRequestDispatcher(target).forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	
	public void sortMovies(final List<Movie> movies, final String sortType) {
		switch(sortType) {
		case "title":
			Collections.sort(movies, new TitleComparator());
			break;
		case "director":
			Collections.sort(movies, new DirectorComparator());
			break;
		case "length":
			Collections.sort(movies, new LengthComparator());
			break;
		default:
			break;
		}
	}

}
