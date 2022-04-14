package ChapterFour;

import java.util.Scanner;
/*
(Tax Calculator) Develop a Java application that determines the total tax for each of three
citizens. The tax rate is 15% for earnings up to 30,000 USD earned by each citizen and 20% for all
earnings in excess of that ceiling. You are given a list with the citizens’ names and their earnings in
a given year. Your program should input this information for each citizen, then determine and dis-
play the citizen’s total tax. Use class Scanner to input the data.
 */

public class TaxCalculator {

    public static void main(String[] args) {
        double totalTax= 0;
        double taxRate;
        int count = 1;

        Scanner scanner = new Scanner(System.in);

        while(count <=3 ) {
            System.out.println("Enter your name: ");
            String name = scanner.nextLine();

            System.out.println("Enter your total earning for the year: ");
            int earning = scanner.nextInt();

            if (earning <= 30_000) {
                taxRate = 0.15;
                totalTax = earning * taxRate;
                System.out.printf("%.2f is your total tax for the year",totalTax );
            }
            else if (earning > 30_000) {
                taxRate = 0.20;
                totalTax = earning * taxRate;
                System.out.printf("%.2f is your total tax for the year", totalTax);
            }
            System.out.println();
            scanner.nextLine();

            count++;
        }

            }
        }


