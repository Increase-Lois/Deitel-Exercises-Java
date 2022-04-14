package ChapterFive;
/*
5.15 (Triangle Printing Program) Write an application that displays the following patterns separately,
one below the other. Use for loops to generate the patterns. All asterisks ( * ) should be print-
ed by a single statement of the form System.out.print('*' ) ; which causes the asterisks to print side
by side. A statement of the form System.out.println(); can be used to move to the next line. A
statement of the form System.out.print(' ' ) ; can be used to display a space for the last two pat-
terns. There should be no other output statements in the program. [Hint: The last two patterns re-
quire that each line begin with an appropriate number of blank spaces.]
 */
public class TrianglePrintingProgram {
    public static void main(String[] args) {
        int rowLength = 10;
        for (int row = 1; row <= rowLength; row++) {
            for (int column = 1; column <= row; column++) { //Increasing
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        for (int row = 1; row <= rowLength; row++) {
            for (int column = row; column <= rowLength; column++) { //Decreasing
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();


        for (int row = 1; row <= rowLength; row++) {
            for (int column = 1; column <= row; column++) {
                System.out.print("  ");
            }
            for (int column = row; column <= rowLength; column++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        for (int row = 1; row <= rowLength; row++) {
            for (int column = row; column <= rowLength; column++) {
                System.out.print("  ");
            }

            for (int column = 1; column <= row; column++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        }
    }

