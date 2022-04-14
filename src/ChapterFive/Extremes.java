package ChapterFive;

import java.util.Scanner;

/*
(Extremes) Write an application that finds the minimum and maximum amongst several
integers and then computes the sum of the two extremes. The user will be prompted to input how
many values the application should ask the user to input.
 */
public class Extremes {
    public static void main(String[] args) {

        int maximum = Integer.MIN_VALUE;
        int minimum = Integer.MAX_VALUE;
        int sum = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of times you want to input a value: ");
        int userInput = input.nextInt();

        for (int number = 0; number < userInput; number++) {
               System.out.println("Enter a digit:");
               int digit = input.nextInt();

               if (digit > maximum) {
                   maximum = digit;
               }
               if (digit < minimum) {
                   minimum = digit;
               }
           }
                 sum = maximum+ minimum;

            System.out.printf("%d is maximum", maximum);
            System.out.println();
            System.out.printf("%d is minimum", minimum);
            System.out.println();
              System.out.printf("%d is sum", sum);
        }
    }



