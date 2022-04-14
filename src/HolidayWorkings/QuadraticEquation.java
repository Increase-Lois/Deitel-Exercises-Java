package HolidayWorkings;

import java.util.Scanner;
public class QuadraticEquation{

    public static void main(String[] args){
    Scanner myScanner = new Scanner(System.in);
        
    System.out.println("Enter the value a");
        int a;
       a = myScanner.nextInt();
        
        System.out.println("Enter the value b");
        int b;
    b = myScanner.nextInt();

        System.out.println("Enter the value c");
        int c;
    c = myScanner.nextInt();

    double root1 = (-(b) + Math.sqrt((b * b) - (4 * a * c)))/ (2 * a);
    double root2 = (-(b) - Math.sqrt((b * b) - (4 * a * c)))/ (2 * a);
        
    System.out.println(root1);
    System.out.println(root2);

    }


}
