package com.ilp.service;

import com.ilp.entity.TvShow;
import com.ilp.model.Entertainment;
import com.ilp.model.MainTrailer;
import com.ilp.model.SeasonTrailer;

public class TvTrailerDisplay implements MainTrailer, SeasonTrailer {

	@Override
	public void displaySeasonTrailer(TvShow tvshow) {
		// TODO Auto-generated method stub
		System.out.println("Trailer of all seasons of "+tvshow.getTitle());
			
	}

	@Override
	public void displayTrailer(Entertainment entertainment) {
		// TODO Auto-generated method stub
		System.out.println("Main trailer of "+entertainment.getTitle());
	}

}
