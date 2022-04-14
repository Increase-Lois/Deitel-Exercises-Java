package ChapterTwo;

import java.util.Scanner;
/*
 2.26 (Multiples) Write an application that reads two integers,
    determines whether the first is a multiple of the second and prints the result.
        [Hint: Use the remainder operator.]
 */
public class Multiplication {

        public static void main (String[]args) {

            Scanner input = new Scanner(System.in);


            System.out.print("Enter first integer: ");
            int number1 = input.nextInt();
            System.out.print("Enter second integer: ");
            int number2 = input.nextInt();

            if (number2 % number1 == 0 )
                System.out.printf("%d is a multiple of %d%n", number2 , number1);
            if (number2 % number1 != 0 )
                System.out.printf("%d is not a multiple of %d%n", number2 , number1);

        }
    }

