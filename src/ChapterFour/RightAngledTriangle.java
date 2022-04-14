package ChapterFour;

import java.util.Scanner;
/*
    (Right-angled Triangle) Write an application that prompts the user to enter the length of
    the base of a triangle, and uses that to draw a right-angled triangle composed of asterisks. Your
    program should work for triangles of base lengths between 1 and 10.
     */
public class RightAngledTriangle {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter the length of the base of a triangle: ");
            int userInput = scanner.nextInt();
            int row = 1;
            while(row <= userInput){
                System.out.print("* ");

                int column = 1;
                while(column < row){
                    System.out.print("* ");
                    column++;
                }
                System.out.println();
                row++;

            }
        }
    }



