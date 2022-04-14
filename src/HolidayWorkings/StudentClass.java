package HolidayWorkings;

import java.util.Scanner;

public class StudentClass{

	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter first integer : ");
	int grade=input.nextInt();
		if(grade >= 90){
			System.out.println("A");
		}

		if(grade < 90) {
			if(grade > 80) {
				System.out.println("B");
			}
		}

		if(grade < 80){
			if(grade > 70){
				System.out.println("C");
			}
		}

		if(grade < 70){
			if(grade > 60){
				System.out.println("D");
			}
		}

		if(grade <60) {
			System.out.println("F");
		}


	}

	}