package ChapterFour;

import java.util.Scanner;

/*
(Find the Largest Number) The process of finding the largest value is used frequently in computer applications.
For example, a program that determines the winner of a sales contest would input
the number of units sold by each salesperson. The salesperson who sells the most units wins the con-
test. Write a pseudocode program, then a Java application that inputs a series of 10 integers and deter-
mines and prints the largest integer. Your program should use at least the following three variables:
a) counter : A counter to count to 10 (i.e., to keep track of how many numbers have been
input and to determine when all 10 numbers have been processed).
b) number : The integer most recently input by the user.
c) largest : The largest number found so far.
 */
public class LargestNumber {
    public static void main(String[] args) {
        int count = 0;
        int largestNumber = Integer.MIN_VALUE;

        Scanner scanner = new Scanner(System.in);
        while(count <= 10){

            System.out.println("Enter a number: ");
            int number = scanner.nextInt();

            if (number > largestNumber){
                largestNumber = number;
            }
            count++;
            }
        System.out.printf("%d is the largest number", largestNumber);
        }
    }

