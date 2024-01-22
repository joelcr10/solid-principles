package com.ilp.service;

import java.util.Scanner;

import com.ilp.entity.Movie;
import com.ilp.entity.TvShow;

public class AddMedia {
	public static Movie addMovie() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter movieId: ");
		int movieId = scanner.nextInt();
		
		scanner.nextLine();
		
		System.out.print("Enter Movie Title");
		String movieTitle = scanner.nextLine();
		
		System.out.print("Enter release date: ");
		String releaseDate = scanner.nextLine();
		
		System.out.print("Enter poster url: ");
		String posterUrl = scanner.nextLine();
		
		System.out.print("Enter overview of movie: ");
		String overview = scanner.nextLine();
		
		System.out.print("Enter the duration of movie(in minutes): ");
		int movieDuration = scanner.nextInt();
		
		System.out.print("Enter Box office: ");
		double boxOffice = scanner.nextDouble();
		
		Movie movie = new Movie(movieId,movieTitle, releaseDate, posterUrl, overview, movieDuration, boxOffice);
		
		return movie;	
		
	}
	
	public static TvShow addTvShow() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter TvId: ");
		int tvId = scanner.nextInt();
		
		
		scanner.next();
		System.out.print("Enter Tv Title");
		String tvTitle = scanner.nextLine();
		
		
		System.out.print("Enter release date: ");
		String releaseDate = scanner.nextLine();
		
		System.out.print("Enter poster url: ");
		String posterUrl = scanner.nextLine();
		
		System.out.print("Enter overview of Tv: ");
		String overview = scanner.nextLine();
		
		System.out.print("Enter the number of Season of Tv: ");
		int tvDuration = scanner.nextInt();
		
		System.out.print("Enter show status: ");
		boolean showStatus = scanner.nextBoolean();
		
		TvShow tvshow = new TvShow(tvId,tvTitle, releaseDate, posterUrl, overview, tvDuration, showStatus);
		
		return tvshow;	
		
	}
}
