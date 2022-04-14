package ChapterFive;
/*
   (Diamond-Printing Program) Write an application that prints the following diamond
   shape. You may use output statements that print a single asterisk ( * ), a single space or a single new-
   line character. Maximize your use of iteration (with nested for statements), and minimize the num-
   ber of output statements.
    */
public class DiamondPrintProgram {
        public static void main(String[] args) {

            int rowLength = 5;
            for (int row = 1; row <= rowLength-1; row++) {
                for (int column = row; column <= rowLength; column++) {
                    System.out.print("  ");
                }
                for (int column = 1; column <= row -1; column++){
                    System.out.print("* ");
                }
                for (int column = 1; column <= row; column++){
                    System.out.print("* ");
                }
                System.out.println();
            }
            for (int row = 1; row <= rowLength; row++) {
                for (int column = 1; column <= row ; column++) {
                    System.out.print("  ");
                }
                for (int column = row; column <= rowLength-1; column++) {
                    System.out.print("* ");
                }
                for (int column = row; column <= rowLength; column++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }



