package PraciceCodes;
import java.util.Scanner;
public class AnotherMinMaxWithWhileLoop {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            int num = 0;
            int total = 0;
            int count = 0;
            int min = 300;
            int max = -20;
            double average = 1;

            while (num != -42){
                System.out.println("Enter number: ");
                num = scanner.nextInt();
                total = total + num;
                count = count + 1;
                if (num < min){
                    min = num;
                }
                if (num > max){
                    max = num;
                }
                average = total / count;
            }

            average = total / count;
            System.out.printf("The sum, average, minimum and maximum of the following numbers are %d, %2f, %d and %d respectively",
                    total, average, min, max);

        }
    }

