package PraciceCodes;

import java.util.Scanner;

public class MinMaxWithWhileLoop {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);
                int max = -2;
                int min = 100;
                int count = 1;
                int total = 0;
                double average = 1.0;

                while (count <= 10) {
                    System.out.println("Enter number: ");
                    int num = scanner.nextInt();
                    total = total + num;
                    count = count + 1;
                    if (num < min) {
                        min = num;
                    }
                    if (num > max) {
                        max = num;
                    }
                    average = total / count;
                }

                System.out.printf("The minimum number is %d, the maximum number is %d and the average is %2f", min, max, average);
            }
        }



