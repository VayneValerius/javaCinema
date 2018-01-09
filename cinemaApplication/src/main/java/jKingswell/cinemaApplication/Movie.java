package jKingswell.cinemaApplication;

public class Movie {
	private String title, genre, ageRating;

	public Movie(String title, String genre, String ageRating) {
		super();
		this.title = title;
		this.genre = genre;
		this.ageRating = ageRating;
	}
	
	public String toString() {
		return title + " || " + genre + " || " + ageRating;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getAgeRating() {
		return ageRating;
	}

	public void setAgeRating(String ageRating) {
		this.ageRating = ageRating;
	}

}
