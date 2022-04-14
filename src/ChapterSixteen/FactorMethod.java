package ChapterSixteen;

import java.util.Scanner;

public class FactorMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an integer: ");
      int userInput = scanner.nextInt();
      factorialNumber(userInput);

    }



    public static int factorialNumber(int number) {
        int count = 2;
        for (int i = count; i < number / 2; i++) {
            if (number % i == 0 && number / i > i) {
                count += 2;
            }
        }
        return count;
    }
    }

