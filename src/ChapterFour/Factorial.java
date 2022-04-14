package ChapterFour;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter an integer: ");
        int number = scan.nextInt();
        int factorial = 1;
        if (number == 0 || number == 1) {
            System.out.println(factorial);
        }
            if (number >= 2) {
                for(int i = 1; i <= number; number--){
                factorial *= number;
                }
                System.out.println(factorial);
            }
        }
}


//     static int numberFactorial(int factorial){
//        int number = 1;
//        factorial = 1;
//        if (number == 0 && number == 1){
//            return 1;
//        }
//        if(number >= 2){
//            factorial = factorial * number;
//            System.out.println(factorial);
//        }
//
//    }
