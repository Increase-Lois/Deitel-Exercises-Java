package ChapterEleven;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        int firstNumber;
        int secondNumber;
         firstNumber = input("Enter a number: ");
         secondNumber = input("Enter a second number: ");

        int result = firstNumber/secondNumber;

    }

    private static int input(String message){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        try{
            int input = scanner.nextInt();
            return input;
        }
        catch(InputMismatchException sho){
            System.out.println("Wrong input... Try again");
            return input(message);
        }

    }
}
