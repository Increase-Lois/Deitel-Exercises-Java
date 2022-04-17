package IntroToJava.ElementaryProgramming;

import java.util.Scanner;

/*
(Convert feet into meters) Write a program that reads a number in feet, converts it
to meters, and displays the result. One foot is 0.305 meter.
 */
public class ConvertFeetToMeters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a value for feet: ");
        double feet = scanner.nextDouble();

        double result = feet * 0.305;
        System.out.println(feet + " feet is " + result + " meters");

    }
}
