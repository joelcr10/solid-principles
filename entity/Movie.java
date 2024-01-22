package com.ilp.entity;

import com.ilp.model.Entertainment;

public class Movie extends Entertainment{
	private int duration;
	private double boxOffice;
	
	public Movie(int id, String title, String releaseDate, String poster, String overview, int duration, double boxOffice) {
		super(id, title, releaseDate, poster, overview);
		this.duration = duration;
		this.boxOffice = boxOffice;
	}
	
	
	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public double getBoxOffice() {
		return boxOffice;
	}

	public void setBoxOffice(double boxOffice) {
		this.boxOffice = boxOffice;
	}
	


	
	
	
}
