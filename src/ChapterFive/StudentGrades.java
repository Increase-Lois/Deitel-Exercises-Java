package ChapterFive;

import java.util.Scanner;
/*
(Student Grades) A group of five students earned the following grades: Student 1, ‘A’; stu-
dent 2, C’; student 3, ‘B’; student 4, ‘A’ and student 5, ‘B’. Write an application that reads a series
of pairs of numbers as follows:
a) student name
b) student letter grade
Your program should use a switch statement to determine how many students got a grade of ‘A’,
how many got a grade of ‘B’, how many got a grade of ‘C’, and how many got a grade of ‘D’. Use a
loop as needed to input the five student grades, and then finally display the results.
 */
public class StudentGrades {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

            int aCount= 0;
            int bCount= 0;
            int cCount= 0;
            int dCount= 0;

        for (int i= 1; i <= 5; i++){

            System.out.println("Enter your full name: ");
            String studentName = scanner.nextLine();

            System.out.println("Enter your Grade in letter:");
            String grade = scanner.nextLine();

            switch (grade){
                case "A" -> aCount++;
                case "B" -> bCount++;
                case "C" -> cCount++;
                case "D" -> dCount++;

            }
        }
        System.out.printf("%n%s%n%s%d%n%s%d%n%s%d%n%s%d%n",
                "Number of students who received each grade:",
                "A: ", aCount, // display number of A grades
                "B: ", bCount, // display number of B grades
                "C: ", cCount, // display number of C grades
                "D: ", dCount); // display number of D grades

    }
    }

