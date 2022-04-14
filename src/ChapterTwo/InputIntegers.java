package ChapterTwo;

import java.util.Scanner;
/*
 2.17 (Arithmetic, Smallest and Largest) Write an application that inputs three integers from the
     user and displays the sum, average, product, smallest and largest of the numbers. Use the techniques
     shown in Fig. 2.15. [Note: The calculation of the average in this exercise should result in an integer
     representation of the average. So, if the sum of the values is 7, the average should be 2, not
 2.3333….]
 */
public class InputIntegers {

        public static void main(String[] args){

            Scanner input = new Scanner(System.in);

            int a;
            int b;
            int c;

            System.out.print("Enter first number: ");
            a = input.nextInt();

            System.out.print("Enter second number: ");
            b = input.nextInt();

            System.out.print("Enter third number: ");
            c = input.nextInt();

            int sum = a + b + c;
            int average = (a+b+c)/3;
            int product = a*b*c;

            if (a > b){
                if (a < c){
                    System.out.printf("The highest number is %d%n", a);
                }
            }

            if (b > a){
                if (b < c){
                    System.out.printf("The highest number is %d%n", b);
                }
            }

            if (c > a){
                if (c < b){
                    System.out.printf("The highest number is %d%n", c);
                }
            }


            if (a < b) {
                if (a < c) {
                    System.out.printf("The lowest number is %d%n", a);
                }
            }

            if (b < a){
                if (b < c){
                    System.out.printf("The lowest number is %d%n", b);
                }
            }

            if (c < a){
                if (c < b){
                    System.out.printf("The lowest number is %d%n", c);
                }
            }


            System.out.printf("Sum is %d%n",sum);
            System.out.printf("Product is %d%n",product);
            System.out.printf("The average is %d%n",average);

        }

    }

