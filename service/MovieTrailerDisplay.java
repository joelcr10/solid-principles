package com.ilp.service;

import com.ilp.model.Entertainment;
import com.ilp.model.MainTrailer;

public class MovieTrailerDisplay implements MainTrailer{

	@Override
	public void displayTrailer(Entertainment entertainment) {
		// TODO Auto-generated method stub
		System.out.println("Main trailer of "+entertainment.getTitle());
	}

}
