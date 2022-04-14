package ChapterTwo;

import java.util.Scanner;

public class Arithmetic {
    /*
    2.15 (Arithmetic) Write an application that asks the user to enter two integers, obtains them from
    the user and prints the square of each, the sum of their squares, and the difference of the squares (first
    number squared minus the second number squared). Use the techniques shown in Fig. 2.7.
     */
        public static void main(String[] args){

            Scanner scan= new Scanner(System.in);

            int firstNumber;
            int secondNumber;
            int sum;
            int product;
            int difference;
            int quotient;

            System.out.println("Enter your first number: ");
            firstNumber=scan.nextInt();

            System.out.println("Enter your second number: ");
            secondNumber=scan.nextInt();

            sum=firstNumber+secondNumber;
            difference=firstNumber-secondNumber;
            product=firstNumber*secondNumber;
            quotient=firstNumber/secondNumber;

            System.out.printf("Sum is %d%n",sum);
            System.out.printf("Difference is %d%n",difference);
            System.out.printf("Product is %d%n",product);
            System.out.printf("Quotient is %d%n",quotient);


        }



    }

