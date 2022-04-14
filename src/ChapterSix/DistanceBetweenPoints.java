package src.ChapterSix;

import java.util.Scanner;

/*
(Distance Between Points) Write method distance to calculate the distance between two
points (x1, y1) and (x2, y2). All numbers and return values should be of type double . Incorporate
this method into an application that enables the user to enter the coordinates of the points.
 */
public class DistanceBetweenPoints {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int count=1;count<=3; count++){
            System.out.println("Enter a value for x1: ");
            double x1= scanner.nextDouble();
            System.out.println("Enter a value for x2: ");
            double x2= scanner.nextDouble();
            System.out.println("Enter a value for y1: ");
            double y1= scanner.nextDouble();
            System.out.println("Enter a value for y2: ");
            double y2= scanner.nextDouble();
            isDistance(x1,y1,x2,y2);
        }

    }
    static double isDistance(double x1,double y1,double x2, double y2){
        //distance between two points formula is x2-x1 ^2 +y2-y1^2;
        double distance;
       distance= Math.sqrt(Math.pow(x2-x1,2.0) + Math.pow(y2-y1,2.0));
        System.out.println("Distance between two points is: " + distance);
       return distance;

    }
}
