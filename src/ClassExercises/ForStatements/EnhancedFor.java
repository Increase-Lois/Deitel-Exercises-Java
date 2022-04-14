package ClassExercises.ForStatements;

import java.util.Scanner;

public class EnhancedFor {
    public static void main(String[] args) {

       // int ARRAY_LENGTH =5;
        int[]ages = new int[5];

        Scanner scanner= new Scanner(System.in);

        for (int i= 0; i < ages.length; i++){
            System.out.println("Enter a number");
          ages[i] = scanner.nextInt();
        }
        System.out.println();

        for (int age : ages) {
            System.out.println(age);
        }
    }
}
