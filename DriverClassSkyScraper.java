package com.greatlearing.Project2;

import java.util.Scanner;

public class DriverClassSkyScraper {

	public static void main(String[] args) {

		System.out.println("Enter the total number of floors in the Building : ");
		try (Scanner sc = new Scanner(System.in)) {
			int totalFloors = sc.nextInt();
			int[] listofFloors = new int[totalFloors];
			for (int i = 0; i <totalFloors; i++) {
				System.out.println("Enter the Floor size given on the day : " + (i + 1));
				int floorSize = sc.nextInt();
				listofFloors[i] = floorSize;
			}
			SkyScraper.calculateFloors(listofFloors);
		}
	}

}
