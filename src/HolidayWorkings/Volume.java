package HolidayWorkings;

import java.util.Scanner;

public class Volume{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the radius and length of a cylinder: ");

		double radius = scan.nextDouble();
		double length = scan.nextDouble();
		double area = radius * radius * 3.142;
		double volume = area * length;

		System.out.printf("The area is %f%n", area);
		System.out.printf("The volume is %f ", volume);







	}






}