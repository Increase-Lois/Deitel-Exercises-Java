package ChapterSix;

import java.util.Scanner;

/*
(Divisible by 5) Write a method isDivisible that uses the remainder operator (%) to deter-
mine whether ten input integers are divisible by 5 or not. The method should take an integer argument
and return true if the integer is divisible by 5 and false otherwise. Incorporate this method
into an application that inputs a sequence of integers (one at a time) and determines the result.
 */
public class DivisibleBy5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            System.out.println("Enter an integer: ");
            int userInput = scanner.nextInt();
         System.out.println(isDivisibleBy5(userInput));
    }

    public static boolean isDivisibleBy5(int number) {
            if (number % 5 == 0) {
                return true;
            }
        return false;
    }
}
