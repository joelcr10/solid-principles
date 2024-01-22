package com.ilp.utility;

import java.util.Scanner;

import com.ilp.model.Entertainment;

import com.ilp.service.AddMedia;

public class MainUtility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Entertainment ent = null;
		System.out.println("Welcome to IMDb");
		System.out.println("----------------");
		char menuChoice = 'y';
		do {
			int option;
			System.out.println("\n1. Add Movie \n2. Add Tv Show \n3. Display");
			option = scanner.nextInt();
			switch(option) {
				case 1 : ent = AddMedia.addMovie();
						 break;
				case 2 : ent = AddMedia.addTvShow();
						 break;
				
			}
			
			System.out.print("Do you want to continue: ");
			menuChoice = scanner.next().charAt(0);
		}while(menuChoice=='y');
		
		

	}

}
