package ChapterTwo;

import java.util.Scanner;
/*
 2.16 (Comparing Integers) Write an application that asks the user to enter one integer, obtains
     it from the user and displays whether the number and its square are greater than, equal to, not equal
     to, or less than the number 100. Use the techniques shown in Fig. 2.15
 */

public class ComparingIntegers {

        public static void main(String[] args){

            Scanner input= new Scanner (System.in);

            System.out.print("Enter first integer");
            int number1 = input.nextInt();

            System.out.print("Enter second integer");
            int number2 = input.nextInt();

            if (number1 > number2)
                System.out.printf("%d is larger", number1);

            if (number1 < number2)
                System.out.printf("%d is larger", number2);

            if (number1 == number2)
                System.out.println("these numbers are equal");
        }
    }

