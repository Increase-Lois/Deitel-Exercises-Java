package IntroToJava.ElementaryProgramming;

import java.util.Scanner;

/*
(Compute the volume of a cylinder) Write a program that reads in the radius
and length of a cylinder and computes the area and volume using the following
formulas:
area = radius * radius *
 */
public class VolumeOfACylinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius of a cylinder: ");
        double radius = scanner.nextDouble();
        System.out.println("Enter the length of a cylinder: ");
        double length = scanner.nextDouble();

        double area = radius * radius * Math.PI;
        double volume = area * length;

        System.out.println("The area is " + area);
        System.out.println("The volume is " + volume);
    }
}
