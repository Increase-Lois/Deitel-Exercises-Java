package ClassExercises.Methods;

import java.util.Scanner;

public class StaticFactor {

    public static int calculateFactorsOf(int userInput) {
        int factors = 0;
        for (int number = 1; number <= userInput; number++) {
            if (userInput % number == 0) {
                factors++;
               }
             }
                return factors;
        }

        public static void main(String[]args) {
            calculatePrimeNumber();
            System.out.println("\n I don finish");
            System.out.println(calculateFactorsOf(45));
            //isEven(23);
    }

    public static void calculatePrimeNumber(){
            System.out.println("Enter a number to check for:  ");
            Scanner inputCollector = new Scanner(System.in);
            int userInput = inputCollector.nextInt();
            int result = calculateFactorsOf(userInput);
                isEven(userInput);
            if (result<=2)System.out.printf("%d is a prime number%n", userInput);
            else System.out.printf("%d is not a prime number", userInput);

        }
        public static void isEven(int number){
        if(number % 2==0){
            System.out.println("Yes! it is even");
        }
        else{
            System.out.println("Try again");
        }
        }
    }



