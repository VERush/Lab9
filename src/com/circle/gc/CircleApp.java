package com.circle.gc;

import java.util.Scanner;

public class CircleApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to the Circle Tester");

		double radius = 0;
		int counter = 0;
		boolean inputValid = true;
		String input;
		String cont = "y";

		// Loop through creating circles
		do {

			// Loop through getting valid input
			do {

				System.out.println("Enter radius: ");
				input = scan.nextLine();
				// Validate input and assign radius

				try {
					radius = Double.parseDouble(input);
				} catch (NumberFormatException e) {
					System.out.println("Invalid entry, please enter a valid numeric radius.");
					inputValid = false;
				}
			} while (!inputValid);

			// Create new circle object
			Circle circleInstance = new Circle(radius);

			System.out.println("Circumference: " + circleInstance.getFormattedCircumference());
			System.out.println("Area: " + circleInstance.getFormattedArea());

			System.out.println("Continue? (y/n): ");
			cont = scan.nextLine();
			counter++;
		} while (cont.equalsIgnoreCase("y"));

		// Should circle be plural?
		if (counter == 1) {
			System.out.println("Thanks for using Circle Tester.  You tested " + counter + " circle.");
		} else {
			System.out.println("Thanks for using Circle Tester.  You tested " + counter + " circles.");
		}
	scan.close();	
	}
}
