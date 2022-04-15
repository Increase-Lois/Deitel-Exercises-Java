package ClassExercises;

import ClassExercises.Methods.Native;

import java.util.Scanner;

public class Semicolon {
    public static void main(String[] args) {
        System.out.println("Enter name");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("Enter scv number");
        int scvNUmber = scanner.nextInt();

        Native aNative = new Native(name, scvNUmber);
        System.out.println(aNative.getName());
        System.out.println(aNative.getScvId());
    }
}
