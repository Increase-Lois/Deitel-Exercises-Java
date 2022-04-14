package ChapterSix;

import java.util.Scanner;

/*
(Test for Leap Year) Write an application that prompts the user to enter an year and uses a
method called isLeapYear to check whether it is a leap year.
 */
public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year = scanner.nextInt();
        System.out.println(calculateIsLeapYear(year));
    }
    public static boolean calculateIsLeapYear(int leapYear) {
        boolean year;
        if (leapYear % 4 == 0 && leapYear % 100 != 0 || leapYear % 400 == 0) {
            System.out.println("This is a leap year");
            return true;
        }
        else {
           System.out.println("This is a leap year");
            return false;
        }
    }

}


