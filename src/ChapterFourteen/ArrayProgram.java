//package ChapterFourteen;
//
//import java.util.Scanner;
//
///*
//write a function that takes in a string and prints out the number of times the word can extract the word balloon;
// */
//public class ArrayProgram {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String[] array = {"kbajdhakjfdldsllnddgdshdsgooooonbbbbaahhdsudgddsfcshdscsnnooooddllllbbaa"};
//
//        System.out.println("Enter a word");
//        String userInput = scanner.nextLine();
//        stringMethod(userInput);
//
//    }
//
//
//    static String[] stringMethod(String word) {
//
//        int countB = 0;
//        int countA = 0;
//        int countL = 0;
//        int countO = 0;
//        int countN = 0;
//        for (int i = 0; i < word.length(); i++) {
//            if (word.contains("b") || word.contains("B")) {
//                countB += 1;
//            }
//            if (word.contains("a") || word.contains("A")) {
//                countA += 1;
//            }
//            if (word.contains("l") || word.contains("L")) {
//                countL += 1;
//            }
//            if (word.contains("o") || word.contains("O")) {
//                countO += 1;
//            }
//            if (word.contains("n") || word.contains("N")) {
//                countN += 1;
//            }
//        }
//       int minimum = Math.min(countB, Math.min(countA, Math.min(countL/2, Math.min(countO/2,countN))));
//
//        System.out.println("Your output is" + minimum);
//
//    }
//}
//
//
//
//
//
