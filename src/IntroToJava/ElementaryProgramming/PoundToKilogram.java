package IntroToJava.ElementaryProgramming;

import java.util.Scanner;

/*
(Convert pounds into kilograms) Write a program that converts pounds into kilo-
grams. The program prompts the user to enter a number in pounds, converts it
to kilograms, and displays the result. One pound is 0.454 kilograms.
 */
public class PoundToKilogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number in pounds: ");
        double pounds = scanner.nextDouble();

        double result = pounds * 0.454;
        System.out.println(pounds +" pounds is " + result +" kilograms");
    }
}
