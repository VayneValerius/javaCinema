package jKingswell.cinemaApplication;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Service cinemaService = new Service();
		
		Movie movie1 = new Movie("Harry Putin and the Goblet of Atomic Fire", "Comedy", "PG");
		Movie movie2 = new Movie("Star Wars Episode Disney", "Comedy", "PG");
		cinemaService.addMovie(movie1);
		cinemaService.addMovie(movie2);
		cinemaService.showMovies();
		cinemaService.getMovie(1);
		cinemaService.removeMovie(0);
	}

}
