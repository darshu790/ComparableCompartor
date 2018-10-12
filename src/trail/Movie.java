package trail;

import java.lang.Comparable;

/**
 * 
 * @author Darshan Nagesh
 *
 */

public class Movie implements Comparable<Movie> {
	
	private double rating;
	private String name; 
	private int year; 

	@Override
	public int compareTo(Movie movie) {
		return this.year - movie.year;  	
	}

	public Movie (Double rating, String name, int year) { 
		this.name = name; 
		this.rating = rating; 
		this.year = year; 
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	
}
