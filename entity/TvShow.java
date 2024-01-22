package com.ilp.entity;

import com.ilp.model.Entertainment;

public class TvShow extends Entertainment{
	private int numberOfSeasons;
	private boolean showStatus;
	
	public TvShow(int id, String title, String releaseDate, String poster, String overview, int numberOfSeasons,
			boolean showStatus) {
		super(id, title, releaseDate, poster, overview);
		this.numberOfSeasons = numberOfSeasons;
		this.showStatus = showStatus;
	}

	public int getNumberOfSeasons() {
		return numberOfSeasons;
	}

	public void setNumberOfSeasons(int numberOfSeasons) {
		this.numberOfSeasons = numberOfSeasons;
	}

	public boolean getShowStatus() {
		return showStatus;
	}

	public void setShowStatus(boolean showStatus) {
		this.showStatus = showStatus;
	}
	
	
		
}
