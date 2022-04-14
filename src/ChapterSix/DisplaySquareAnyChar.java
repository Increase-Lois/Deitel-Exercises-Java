package src.ChapterSix;

import java.util.Scanner;

/*
(Displaying a Square of Any Character) Modify the method created in Exercise 6.18 to
receive a second parameter of type char called fillCharacter . Form the square using the char provided as an argument.
Thus, if side is 5 and fillCharacter is # , the method should display
#####
#####
#####
#####
#####
Use the following statement (in which input is a Scanner object) to read a character from the user
at the keyboard:
// next() returns a String and charAt(0) gets the String's first character
char fill = input.next().charAt(0);
 */
public class DisplaySquareAnyChar {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the length you require: ");
        int userInput = input.nextInt();
         System.out.println("Enter the character you want to fill in: ");
        char fill = input.next().charAt(0);
        squareOfAsterisks(userInput,fill);

    }

    public static void squareOfAsterisks(int asterisk, char fill){
        for (int row =1; row <= asterisk; row++) {
            for (int column = 1; column <= asterisk; column++)
              System.out.print(fill);
            System.out.println();
        }
       // System.out.println();
    }

}
