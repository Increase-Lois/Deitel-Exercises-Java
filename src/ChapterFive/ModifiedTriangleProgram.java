package ChapterFive;
/*
    (Modified Triangle-Printing Program) Modify Exercise 5.15 to combine your code from
    the four separate triangles of asterisks such that all four patterns print side by side. [Hint: Make clev-
    er use of nested for loops.]
     */
public class ModifiedTriangleProgram {

        public static void main(String[] args) {
            int rowLength = 10;

            for (int row = 1; row <= rowLength; row++) {
                for (int column = 1; column <= row; column++) {
                    System.out.print("* ");
                }
                System.out.print(" ");
                System.out.print("  ");

                for (int column = row; column <= rowLength; column++) {
                    System.out.print("* ");
                }
                System.out.print("  ");
                System.out.print("  ");
                for (int column = row; column <= rowLength; column++) {
                    System.out.print("* ");
                }
                System.out.print("  ");
                System.out.print("  ");
                for (int column = 1; column <= row; column++) {
                    System.out.print("* ");
                }
                System.out.print("  ");
                System.out.println();
            }
            System.out.println();
        }

    }



