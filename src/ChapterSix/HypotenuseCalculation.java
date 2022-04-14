package ChapterSix;

import java.util.Scanner;
/*
(Hypotenuse Calculations) Define a method hypotenuse that calculates the hypotenuse of
a right triangle when the lengths of the other two sides are given. The method should take two arguments of
type double and return the hypotenuse as a double.Incorporate this method into an
application that reads values for side1 and side2 and performs the calculation with the hypotenuse
method. Use Math methods pow and sqrt to determine the length of the hypotenuse for each of the
triangles in Fig. 6.14. [Note: Class Math also provides method hypot to perform this calculation.]
Triangle     Side 1         Side 2
1              3.0          4.0
2              5.0          12.0
3              8.0          15.0
 */
public class HypotenuseCalculation {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        for (int count = 1; count <=3; count++) {
            System.out.println("Enter your first value:");
            double firstValue = scanner.nextDouble();
            System.out.println("Enter your second value:");
            double secondValue = scanner.nextDouble();

            calculateHypotenuse(firstValue, secondValue);
            System.out.println();
        }
    }
    static double calculateHypotenuse(double side1, double side2){
        //Formula for a right angle triangle is C= a^2 + b^2;
        double value = 0;
       value= Math.sqrt(Math.pow(side1, 2.0) + Math.pow(side2,2.0));
        System.out.printf("Hypotenuse of the triangle is %.2f", value);
        return value;
    }
}
