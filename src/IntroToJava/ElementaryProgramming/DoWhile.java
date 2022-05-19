package IntroToJava.ElementaryProgramming;

public class DoWhile {
    public static void main(String[] args) {
//        int i = 0;
//
//        do {
//
//            System.out.println(i + 4);
//
//            i++;
////            System.out.print(i);
//        }
//
//        while (i < 10);

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < i; j++) {
                System.out.println(i * j);
            }
        }
    }
}

