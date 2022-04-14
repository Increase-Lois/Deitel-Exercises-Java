package ClassExercises;

import java.util.Scanner;

public class FactorAndPrimeNumber {
    public static void main(String[] args) {
        System.out.println("Enter a number to check for");
        Scanner inputCollector = new Scanner(System.in);
        int userInput = inputCollector.nextInt();
        int factors = 0;

        //count
        for (int i = 1; i < userInput; i++) {
            if (userInput % i == 0) {
                System.out.println("Factor is "+i);
                factors ++;
            }
        }
        System.out.println("Total factor is :" +factors);
        if (factors<=2){
            System.out.printf("%d is a prime number%n", userInput);
        }
        else{
            System.out.printf("%d is not a prime number", userInput);
        }
    }
}
