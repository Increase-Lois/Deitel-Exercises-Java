package ChapterSix;

import java.util.Scanner;
/*
(Perfect Numbers) An integer number is said to be a perfect number if its factors, including
1 (but not the number itself), sum to the number. For example, 6 is a perfect number, because 6 =
1 + 2 + 3. Write a method isPerfect that determines whether parameter number is a perfect number.
Use this method in an application that displays all the perfect numbers between 1 and 1000. Display
the factors of each perfect number to confirm that the number is indeed perfect. Challenge the computing
power of your computer by testing numbers much larger than 1000. Display the results.
 */
public class PerfectNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = scanner.nextInt();
        isPerfect(number);
    }
    static int isPerfect(int number) {

        int factors = 0;
        for (int prime = 1; prime < number; prime++) {
            if (number % prime== 0) {
                System.out.printf("Factors of %d is : " + prime);
                factors ++;
                        //= prime;
            }
            System.out.println();
        }
        if (factors <= number) {
            System.out.println("This is a perfect number");
        } else {
            System.out.println("This is not a perfect number");
        }
        return factors;
    }

}
