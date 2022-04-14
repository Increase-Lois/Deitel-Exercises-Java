package ChapterTwo;

import java.util.Scanner;

/*
    2.33 (Body Mass Index Calculator) We introduced the body mass index (BMI) calculator in Exercise 1.10.
    The formulas for calculating BMI are

    weightInPounds  ×   703
    BMI = -------------------------------------
    heightInInches × heightInInches

            or
    weightInKilograms
            BMI = -------------------------------------
            heightInMetres x heightInMetres

    Create a BMI calculator that reads the user’s weight in pounds and height in inches
            (or, if you prefer, the user’s weight in kilograms and height in meters),
    then calculates and displays the user’s body mass index.
    Also, display the following information from the Department of Health and Human Services/National Institutes of Health
    so the user can evaluate his/her BMI:

    BMI VALUES
    Underweight: less than 18.5
    Normal:      between 18.5 and 24.9
    Overweight:  between 25 and 29.9
    Obese:       30 or greater

[Note: In this chapter, you learned to use the int type to represent whole numbers.
    The BMI calculations when done with int values will both produce whole-number results.
    In Chapter 3 you’ll learn to use the double type to represent numbers with decimal points.
    When the BMI calculations are performed with doubles,
    they’ll both produce numbers with decimal points—these are called “floating-point” numbers.]
*/

public class BodyMassIndex {

        public static void main(String[]args){

            Scanner input = new Scanner(System.in);

            System.out.println("Enter your height in cm:");
            int height = input.nextInt();

            System.out.println("Enter your weight in kg");
            int weight = input.nextInt();

            double bmi = weight / (height*height);

            System.out.println("Your BMI is "+bmi);

            if(bmi < 18.5){
                System.out.println("You are UNDERWEIGHT");
                }

            if (bmi >= 18.5 && bmi <=24.9){
                    System.out.println("You are NORMAL weight");
                }

            if (bmi >= 25 && bmi <=29.9){
                    System.out.println("You are OVERWEIGHT");
                }

            if (bmi > 30){
                System.out.println("You are OBESE");
                }

        }
    }



