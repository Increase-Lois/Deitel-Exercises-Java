package ChapterFour;

import java.util.Scanner;
/*
    (Palindromes) A palindrome is a sequence of characters that reads the same backward as for-
    ward. For example, each of the following five-digit integers is a palindrome: 12321, 55555, 45554
    and 11611. Write an application that reads in a five-digit integer and determines whether it’s a palindrome.
    If the number is not five digits long, display an error message and allow the user to enter
    a new value.
     */
public class Palindromes {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            int count=0;
            while(count <= 10){
                System.out.println("Enter a five digit integer: ");
                int userInput = scanner.nextInt();

                int firstDigit = userInput / 10000;
                int firstDigitRemainder = userInput % 10000;
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
                    System.out.println("Try again");
                }

                count++;
                System.out.println();
            }

        }
    }


