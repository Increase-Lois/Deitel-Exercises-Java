package IntroToJava.ElementaryProgramming;

import java.util.Scanner;

/*
(Convert Celsius to Fahrenheit) Write a program that reads a Celsius degree in
a double value from the console, then converts it to Fahrenheit and displays the
result. The formula for the conversion is as follows:
fahrenheit = (9 / 5) * celsius + 32
Hint: In Java, 9 / 5 is 1 , but 9.0 / 5 is 1.8 .
 */
public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a degree in celsius: ");
        double celsius = scanner.nextDouble();
        double fahrenheit = 9.0/5 * celsius + 32;

        System.out.println(celsius +  " Celsius is " + fahrenheit +" fahrenheit");

    }
}
