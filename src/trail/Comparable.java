package trail;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 
 * @author Darshan Nagesh
 *
 */

public class Comparable {

	public static void main(String[] args) {
		
		ArrayList<Movie> list = new ArrayList<>(); 
		list.add(new Movie(5.4, "Venom", 2018)); 
		list.add(new Movie(8.2, "Jurassic World", 2017));
		list.add(new Movie(6.9, "Star Wars", 2016));
		list.add(new Movie(8.3, "Force Awakens", 2015));
		
		Collections.sort(list);
		
		System.out.println("Movies after sorting : "); 
        for (Movie movie: list) 
        { 
            System.out.println(movie.getName() + " " + 
                               movie.getRating() + " " + 
                               movie.getYear()); 
        } 
	}

}
