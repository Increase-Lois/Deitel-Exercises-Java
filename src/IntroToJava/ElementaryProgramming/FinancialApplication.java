package IntroToJava.ElementaryProgramming;

import java.util.Scanner;

/*
(Financial application: calculate tips) Write a program that reads the subtotal
and the gratuity rate, then computes the gratuity and total. For example, if the
user enters 10 for subtotal and 15% for gratuity rate, the program displays $1.5
as gratuity and $11.5 as total.
 */
public class FinancialApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the subtotal rate :");
        double subTotal = scanner.nextDouble();
        System.out.println("Enter the gratuity rate: ");
        double gratuityRate = scanner.nextDouble();

        double newGratuityRate = gratuityRate / 10;
        double newSubTotal = subTotal + 1.5 ;

        System.out.println("The gratuity is " + "$" +newGratuityRate +
                " and total is " + "$"+newSubTotal );

    }
}
