package com.ilp.model;

public abstract class Entertainment {
	private int id;
	private String title;
	private String releaseDate;
	private String poster;
	private String overview;
	
	
	public Entertainment(int id, String title, String releaseDate, String poster, String overview) {
		this.id = id;
		this.title = title;
		this.releaseDate = releaseDate;
		this.poster = poster;
		this.overview = overview;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getReleaseDate() {
		return releaseDate;
	}


	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}


	public String getPoster() {
		return poster;
	}


	public void setPoster(String poster) {
		this.poster = poster;
	}


	public String getOverview() {
		return overview;
	}


	public void setOverview(String overview) {
		this.overview = overview;
	}

	
}
