/**
 * 
 */
package edu.cvtc.web.model;

import java.io.Serializable;

/**
 * @author csather
 *
 */
public class Movie implements Serializable {

	private static final long serialVersionUID = -833077276058540099L;
	
	private String title;
	private String director;
	private Integer lengthInMinutes;
	
	public Movie() {
		
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public Integer getLengthInMinutes() {
		return lengthInMinutes;
	}

	public void setLengthInMinutes(Integer lengthInMinutes) {
		this.lengthInMinutes = lengthInMinutes;
	}

}
