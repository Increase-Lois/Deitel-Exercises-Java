package ChapterFour;

import java.util.Scanner;
/*
   (Find the Two Largest Numbers) Using an approach similar to that for Exercise 4.21, find
   the two largest values of the 10 values entered. [Note: You may input each number only once.]
    */
public class TwoLargestNumbers {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int count = 0;
            int largestNumber = Integer.MIN_VALUE;
            int secondLargestNumber = Integer.MIN_VALUE;

            while (count < 4) {
                System.out.println("Enter a number: ");
                int number = scanner.nextInt();

                if (number > largestNumber) {
                    secondLargestNumber = largestNumber;
                    largestNumber = number;
                }
                else if (number > secondLargestNumber) {
                    secondLargestNumber = number;
                }
                count++;
            }
            System.out.printf("%d is the largestNumber",largestNumber);
            System.out.println();
            System.out.printf("%d is the second largestNumber", secondLargestNumber);


        }

    }



