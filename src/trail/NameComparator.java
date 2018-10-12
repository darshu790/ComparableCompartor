package trail;

import java.util.Comparator;

/**
 * 
 * @author Darshan Nagesh
 *
 */

public class NameComparator implements Comparator<Movie> {

	@Override
	public int compare(Movie m1, Movie m2) {
		return m1.getName().compareTo(m2.getName());
	}

}
