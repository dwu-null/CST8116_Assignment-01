/*
 * Student Name: Di Wu
 * Lab Professor: Professor James Mwangi
 * Due Date: June 07, 2024
 * Modified: June 01, 2024
 * Description: this class outputs volume of donut from within method main.
 */

import java.util.Scanner;

//create class to launch the program, contains method main
public class DonutCalculator {
	//this is the entry point for the program
	public static void main(String[] args) {
		double outerRadius;
		double innerRadius;
		Scanner scanner = new Scanner(System.in);
		//input for outer radius
		System.out.print("Enter outer radius: ");
		outerRadius = scanner.nextDouble();
		//input for inner radius
		System.out.print("Enter inner radius: ");
		innerRadius = scanner.nextDouble();
		//create object reference
		Donut donut = new Donut(outerRadius, innerRadius);
		//use object to call method and print
		System.out.printf("Volume is %.2f%n", donut.calculateDonutVolume());
		System.out.println("Programmed by Di Wu");
		
		scanner.close();		

	}

}
