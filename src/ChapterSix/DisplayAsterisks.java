package ChapterSix;

import java.util.Scanner;
/*
(Displaying a Square of Asterisks) Write a method squareOfAsterisks that displays a solid
square (the same number of rows and columns) of asterisks whose side is specified in integer parameter side.
For example, if side is 4 , the method should display
****
****
****
****
Incorporate this method into an application that reads an integer value for side from the user and
outputs the asterisks with the squareOfAsterisks method.
 */
public class DisplayAsterisks {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the length you require: ");
        int userInput = input.nextInt();
        squareOfAsterisks(userInput);

    }

    public static void squareOfAsterisks(int asterisk){
        for (int row =1; row <= asterisk; row++) {
            for (int column = 1; column <= asterisk; column++)
                System.out.print("* ");
            System.out.println();
        }
            System.out.println();
            }

        }


