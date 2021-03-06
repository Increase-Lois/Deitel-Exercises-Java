package ChapterSix;

import java.util.Scanner;

/*
Multiples) Write a method isMultiple that determines, for a pair of integers, whether the
second integer is a multiple of the first. The method should take two integer arguments and return
true if the second is a multiple of the first and false otherwise. [Hint: Use the remainder operator.]
Incorporate this method into an application that inputs a series of pairs of integers (one pair at a
time) and determines whether the second value in each pair is a multiple of the first.
 */
public class Multiples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer");
        int userInput = scanner.nextInt();
        System.out.println("Enter another integer");
        int userEntry = scanner.nextInt();

        System.out.println(isMultiple(userInput,userEntry));
    }
    public static boolean isMultiple (int a, int b){
        if (b % a ==0){
            return true;
        }
        return false;

    }
}
