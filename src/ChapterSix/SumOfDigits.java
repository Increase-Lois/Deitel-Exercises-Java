package ChapterSix;

import java.util.Scanner;
/*
(Calculating the Sum of Digits) Write a method that takes a four-digit integer value and
returns the sum of the digits. For example, given the number 7631, the method should return 17.
Incorporate the method into an application that reads a value from the user and displays the result.
 */
public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int userInput = scanner.nextInt();
        System.out.println("Sum of digits: " + sumOfDigits(userInput));
    }

    static int sumOfDigits(int number) {
        int sum = 0 ;
        while (number != 0) {
            sum = sum + number % 10;
            number = number / 10;
        }
        return sum;
    }
}

//        for (sum = 0; number >0; sum=sum + number%10,number=number/10) {
//        }
//        return sum;



