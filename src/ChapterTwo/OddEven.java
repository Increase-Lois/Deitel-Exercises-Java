package ChapterTwo;

import java.util.Scanner;
/*
2.25 (Odd or Even) Write an application that reads an integer and determines and prints whether it’s odd or even.
            [Hint: Use the remainder operator. An even number is a multiple of 2.
    Any multiple of 2 leaves a remainder of 0 when divided by 2.]
 */
public class OddEven {

    public static void main (String[]args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter integer: ");
        int number = input.nextInt();

            if (number % 2 == 0 )
                System.out.printf("%d is even", number);
            if (number % 2 != 0  )
                System.out.printf("%d is odd", number);

        }
    }


