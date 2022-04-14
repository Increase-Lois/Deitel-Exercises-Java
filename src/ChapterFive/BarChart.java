package ChapterFive;

import java.util.Scanner;
/*
(Bar-Chart Printing Program) One interesting application of computers is to display
graphs and bar charts. Write an application that reads five numbers between 1 and 30. For each
number that’s read, your program should display the same number of adjacent asterisks. For exam-
ple, if your program reads the number 7, it should display ******* . Display the bars of asterisks after
you read all five numbers.
 */
public class BarChart {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int count = 0;
        while (count < 5){
            System.out.println("Enter a number between 1 and 30");
            int userInput = input.nextInt();
            if (userInput > 0 && userInput <= 30){
                for (int i = 0; i < userInput; i++)
                System.out.print("* ");
                count++;
            }
            else {
                System.out.print("Try again");
            }
            System.out.println();
        }
    }
}

