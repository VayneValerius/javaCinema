package jKingswell.cinemaApplication;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Service {
	
	private int counter = 0;
	protected int countGenre = 0;

	HashMap<Integer, Movie> movieList = new HashMap<Integer, Movie>();
	
	public void addMovie(Movie movie) {
		movieList.put(counter, movie);
		counter++;
	}
	
	public void showMovies() {
		Set set = movieList.entrySet();
	    Iterator iterator = set.iterator();
	    while(iterator.hasNext()) {
	        Map.Entry mentry = (Map.Entry)iterator.next();
	        System.out.print("key is: "+ mentry.getKey() + " & Value is: ");
	        System.out.println(mentry.getValue());
	      }
	}
	
	public void getMovie(int index) {
		Movie var= movieList.get(index);
	    System.out.println("Value at index " + index + "is: "+var);
	}
	
	public void removeMovie(int index) {
		movieList.remove(index);
		showMovies();
	}
	
	public void checkgenreAmount(String genre)
	{
		countGenre = 0;
		for(int i = 0; i < movieList.size(); i++)
		{
			if(movieList.get(i).getGenre().equals(genre))
			{
				countGenre ++;
			}
			System.out.println(countGenre);
		}
	}

}
