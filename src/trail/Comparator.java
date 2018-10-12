package trail;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 
 * @author Darshan Nagesh
 *
 */

public class Comparator {

	public static void main(String[] args) {
		
		 ArrayList<Movie> list = new ArrayList<Movie>(); 
	        list.add(new Movie(8.3,"Force Awakens", 2015)); 
	        list.add(new Movie(8.7, "Star Wars", 1977)); 
	        list.add(new Movie(8.8, "Empire Strikes Back", 1980)); 
	        list.add(new Movie(8.4, "Return of the Jedi",  1983)); 
	  
	        // Sort by rating : (1) Create an object of ratingCompare 
	        //                  (2) Call Collections.sort 
	        //                  (3) Print Sorted list 
	        System.out.println("Sorted by rating"); 
	        RatingComparator ratingCompare = new RatingComparator(); 
	        Collections.sort(list, ratingCompare); 
	        for (Movie movie: list) 
	            System.out.println(movie.getRating() + " " + 
	                               movie.getName() + " " + 
	                               movie.getYear()); 
	  
	  
	        // Call overloaded sort method with RatingCompare 
	        // (Same three steps as above) 
	        System.out.println("\nSorted by name"); 
	        NameComparator nameCompare = new NameComparator(); 
	        Collections.sort(list, nameCompare); 
	        for (Movie movie: list) 
	            System.out.println(movie.getName() + " " + 
	                               movie.getRating() + " " + 
	                               movie.getYear()); 
	  
	        // Uses Comparable to sort by year 
	        System.out.println("\nSorted by year"); 
	        Collections.sort(list); 
	        for (Movie movie: list) 
	            System.out.println(movie.getYear() + " " + 
	                               movie.getRating() + " " + 
	                               movie.getName()+" "); 

	}

}
