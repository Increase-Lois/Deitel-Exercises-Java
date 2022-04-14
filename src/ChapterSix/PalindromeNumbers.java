package ChapterSix;

import java.util.Scanner;

/*
(Palindrome Numbers) A positive integer is a palindrome if its value is the same after re-
versing the order of the digits in the number. For example, 12321 is a palindrome, but 12563 is not.
Write a method that determines whether a number is a palindrome. Use this method in an application
that determines whether a number entered by the user is a palindrome or not and prints the
result to the console.
 */
public class PalindromeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a four digit number or a negative to exit: ");
        int userInput = scanner.nextInt();
        isAPalindrome(userInput);
    }
     static void isAPalindrome(int palindrome) {
         int firstDigit = palindrome / 10000;
         int firstDigitRemainder = palindrome % 10000;
         int secondDigit = firstDigitRemainder / 1000;
         int secondDigitRemainder = firstDigitRemainder % 1000;
         int thirdDigit = secondDigitRemainder / 100;
         int thirdDigitRemainder = secondDigitRemainder % 100;
         int fourthDigit = thirdDigitRemainder / 10;
         int fourthDigitRemainder =thirdDigitRemainder % 10;
         int fifthDigit=fourthDigitRemainder;

         if (firstDigit == fifthDigit && secondDigit== fourthDigit){
             System.out.println("This is a palindrome");
         }
         else {
             System.out.println("This is not a palindrome");
         }

     }
}
