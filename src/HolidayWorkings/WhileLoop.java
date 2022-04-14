package HolidayWorkings;

import java.util.Scanner;

public class WhileLoop {

public static void main(String[] args){

	Scanner input = new Scanner(System.in);
	int product=7;

	System.out.println("Enter an integer");
	product = input.nextInt();

	while(product <= 7){
		product= 7 * product;

	}

	System.out.printf("The total sum is %d%n", product);
}
}

