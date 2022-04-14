package ChapterFour;
/*
(Checkerboard Pattern of Asterisks) Write an application that uses only the output statements
1.System.out.print("* ");
2.System.out.print(" ");
3.System.out.println();
to display the checkerboard pattern that follows. A System.out.println method call with no
arguments causes the program to output a single newline character. [Hint: Iteration statements are
required.]
 */

public class CheckerboardPattern {
    public static void main(String[] args) {

        int row = 1;
        int rowLength= 8;
        while (row <= rowLength) {
            if (row % 2 == 0) {
                System.out.print(" ");
                System.out.print("* ");
            } else {
                System.out.print("* ");
            }

            int column = 1;
            while (column <= rowLength) {

                System.out.print("* ");
                column++;
            }
            System.out.println();
            row++;
        }

    }
}
