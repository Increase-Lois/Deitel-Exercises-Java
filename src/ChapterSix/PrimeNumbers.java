package ChapterSix;

import java.util.Scanner;

/*
(Prime Numbers) A positive integer is prime if it’s divisible by only 1 and itself. For exam-
ple, 2, 3, 5 and 7 are prime, but 4, 6, 8 and 9 are not. The number 1, by definition, is not prime.
a) Write a method that determines whether a number is prime.
b) Use this method in an application that determines and displays all the prime numbers
less than 10,000. How many numbers up to 10,000 do you have to test to ensure that
you’ve found all the primes?
c) Initially, you might think that n/2 is the upper limit for which you must test to see
whether a number n is prime, but you need only go as high as the square root of n. Re-
write the program, and run it both ways.
 */
public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        displayPrimeNumbers(number);

    }

         public static void displayPrimeNumbers(int prime) {
        for (int primeNumber = 1; primeNumber <= 10_000; primeNumber++) {
            boolean isPrime = true;

            for (int number = 2; number <= Math.sqrt(primeNumber); number++) {
                if (primeNumber % number == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(primeNumber + " ");
            }
            System.out.println();
        }
    }
}








