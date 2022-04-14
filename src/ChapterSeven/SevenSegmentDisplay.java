package ChapterSeven;

import java.util.Scanner;

public class SevenSegmentDisplay {
    private static final int [][] arr = new int[5][4];
    public static void setLedA(){
        for (int row = 0; row < 1; row++){
            for (int column = 0; column< arr[row].length; column++){
                arr[row][column] = 1;
            }
        }
//       arr [0] [0] = 1;
//       arr [0] [1] = 1;
//       arr [0] [2] = 1;
//       arr [0] [3] = 1;

    }
    public static void setLedB() {
        for (int row = 0; row < 3; row++){
            for (int column = 3; column < 4; column++){
                arr[row][column] = 1;
            }
        }
//        arr [0] [3] = 1;
//        arr [1] [3] = 1;
//        arr [2] [3] = 1;

    }
    public static void setLedC() {
        for (int row = 2; row < 5; row++){
            for (int column =3; column < 4; column++ ){
                arr[row][column] = 1;
            }
        }
//        arr [2] [3] = 1;
//        arr [3] [3] = 1;
//        arr [4] [3] = 1;

    }
    public static void setLedD() {
        for (int row = 4; row < 5; row++) {
            for (int column = 0; column < arr.length - 1; column++) {
                arr[row][column] = 1;
            }
//        arr [4] [0] = 1;
//        arr [4] [1] = 1;
//        arr [4] [2] = 1;
//        arr [4] [3] = 1;

        }
    }
    public static void setLedE() {
            for (int row = 2; row < 5; row++) {
                for (int column = 0; column < 1; column++) {
                    arr[row][column] = 1;
                }
            }

//        arr [2] [0] = 1;
//        arr [3] [0] = 1;
//        arr [4] [0] = 1;

    }
    public static void setLedF() {
        for (int row = 0; row < 3; row++){
            for (int column = 0; column < 1; column++ ){
                arr[row][column] = 1;
            }
        }
//        arr [0] [0] = 1;
//        arr [1] [0] = 1;
//        arr [2] [0] = 1;

    }
    public static void setLedG() {
        for (int row = 2; row < 3; row++){
            for (int column = 0; column < 4; column++){
                arr[row][column] = 1;
            }
        }
//        arr [2] [0] = 1;
//        arr [2] [1] = 1;
//        arr [2] [2] = 1;
//        arr [2] [3] = 1;
    }

    public static void setDisplay() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 8 digits between 0s and 1s: ");
        String userInput = scanner.next();
        if (userInput.charAt(7) == '1') {
            if (userInput.charAt(0) == '1') {
                setLedA();
            }
            if (userInput.charAt(1) == '1') {
                setLedB();
            }
            if (userInput.charAt(2) == '1') {
                setLedC();
            }
            if (userInput.charAt(3) == '1') {
                setLedD();
            }
            if (userInput.charAt(4) == '1') {
                setLedE();
            }
            if (userInput.charAt(5) == '1') {
                setLedF();
            }
            if (userInput.charAt(6) == '1') {
                setLedG();
            }
        } else {
            System.out.println("Nothing to see here");
        }

        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                if (arr[row][column] == 1)
                    System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }

    }
public static void main(String[] args) {
setDisplay();

    }
}
