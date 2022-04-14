package PraciceCodes;

import java.util.Scanner;

public class OrderLargeNumToLeastLargeNum {

    public static void main(String[] args) {



            Scanner input = new Scanner(System.in);
            System.out.println("Enter the first number: ");
            int a = input.nextInt();
            System.out.println("Enter the second number: ");
            int b = input.nextInt();
            System.out.println("Enter the third number: ");
            int c = input.nextInt();
            System.out.println("Enter the fourth number: ");
            int d = input.nextInt();

            if(a > b)
                if(a > c)
                    if(a > d)
                        System.out.printf("%d is the largest number", a);

            if(a > b)
                if(a > c)
                    if(a < d)
                        System.out.printf("%d is the second largest number", a);

            if(a > b)
                if(a < c)
                    if(a > d)
                        System.out.printf("%d is the second largest number", a);

            if(a < b)
                if(a > c)
                    if(a > d)
                        System.out.printf("%d is the second largest number", a);

            if(a > b)
                if(a < c)
                    if(a < d)
                        System.out.printf("%d is the third largest number", a);

            if(a < b)
                if(a > c)
                    if(a < d)
                        System.out.printf("%d is the third largest number", a);

            if(a < b)
                if(a < c)
                    if(a > d)
                        System.out.printf("%d is the third largest number", a);

            if(a < b)
                if(a < c)
                    if(a < d)
                        System.out.printf("%d is the lowest number", a);

            System.out.println();

            if(b > a)
                if(b > c)
                    if(b > d)
                        System.out.printf("%d is the largest number", b);

            if(b > a)
                if(b > c)
                    if(b < d)
                        System.out.printf("%d is the second largest number", b);

            if(b > b)
                if(b < c)
                    if(b > d)
                        System.out.printf("%d is the second largest number", b);

            if(b < a)
                if(b > c)
                    if(b > d)
                        System.out.printf("%d is the second largest number", b);

            if(b > a)
                if(b < c)
                    if(b < d)
                        System.out.printf("%d is the third largest number", b);

            if(b < a)
                if(b > c)
                    if(b < d)
                        System.out.printf("%d is the third largest number", b);

            if(b < a)
                if(b < c)
                    if(b > d)
                        System.out.printf("%d is the third largest number", b);

            if(b < a)
                if(b < c)
                    if(b < d)
                        System.out.printf("%d is the lowest number", b);


            System.out.println();


            if(c > b)
                if(c > a)
                    if(c > d)
                        System.out.printf("%d is the largest number", c);

            if(c > b)
                if(c > a)
                    if(c < d)
                        System.out.printf("%d is the second largest number", c);

            if(c > b)
                if(c < a)
                    if(c > d)
                        System.out.printf("%d is the second largest number", c);

            if(c < b)
                if(c > a)
                    if(c > d)
                        System.out.printf("%d is the second largest number", c);

            if(c > b)
                if(c < a)
                    if(c < d)
                        System.out.printf("%d is the third largest number", c);

            if(c < b)
                if(c > a)
                    if(c < d)
                        System.out.printf("%d is the third largest number", c);

            if(c < b)
                if(c < a)
                    if(c > d)
                        System.out.printf("%d is the third largest number", c);

            if(c < b)
                if(c < a)
                    if(c < d)
                        System.out.printf("%d is the lowest number", c);

            System.out.println();

            if(d > b)
                if(d > c)
                    if(d > a)
                        System.out.printf("%d is the largest number", d);

            if(d > b)
                if(d > c)
                    if(d < a)
                        System.out.printf("%d is the second largest number", d);

            if(d > b)
                if(d < c)
                    if(d > a)
                        System.out.printf("%d is the second largest number", d);

            if(d < b)
                if(d > c)
                    if(d > a)
                        System.out.printf("%d is the second largest number", d);

            if(d > b)
                if(d < c)
                    if(d < a)
                        System.out.printf("%d is the third largest number", d);

            if(d < b)
                if(d > c)
                    if(d < a)
                        System.out.printf("%d is the third largest number", d);

            if(d < b)
                if(d < c)
                    if(d > a)
                        System.out.printf("%d is the third largest number", d);

            if(d < b)
                if(d < c)
                    if(d < a)
                        System.out.printf("%d is the lowest number", d);
        }
    }

