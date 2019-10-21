package com.training;

public class Movie {

	
	private long id;
	private String movieName;
	private String genre;
	private String director;
	
	public Movie() {
		super();
		}
	public Movie(long id, String movieName, String genre, String director) {
		super();
		// instance variable = parameter variable 
		this.id = id;
		this.movieName = movieName;
		this.genre = genre;
		this.director = director;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	
	
	
}
