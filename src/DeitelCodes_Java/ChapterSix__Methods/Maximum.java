package DeitelCodes_Java.ChapterSix__Methods;

import java.util.Scanner;

/*
Use a method called maximum to determine and return the largest of three double values.
 */
public class Maximum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter three floating numbers: ");
        double number1 = scanner.nextDouble();
        double number2 = scanner.nextDouble();
        double number3 = scanner.nextDouble();

       double result = maximumNumber( number1, number2,  number3);
        System.out.println("Maximum is:  " + result);

    }
    public static double maximumNumber(double a, double b, double c){
        double maximumValue= a;

        if(b > maximumValue){
            maximumValue = b;

        }
        if (c > maximumValue){
            maximumValue = c;
        }
    return maximumValue;
}
}
