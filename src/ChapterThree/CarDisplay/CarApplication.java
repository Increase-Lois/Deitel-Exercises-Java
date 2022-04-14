package ChapterThree.CarDisplay;

import java.util.Scanner;

public class CarApplication {
    public static void main(String[] args) {
        Car car1 = new Car("null","0",0.0);
        Car car2 = new Car("null","0",0.0);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your preferred Model type: ");
        String userChoice = scanner.nextLine();

        System.out.println("Enter a year of preference: ");
        String userType = scanner.nextLine();

        System.out.println("Enter a price within your budget : ");
        double budget = scanner.nextDouble();

        car1.setModel(userChoice);
        System.out.println("Your new Car model is: " + car1.getModel());

        car1.setYear(userType);
        System.out.println("Your preferred year type is: " + car1.getYear());

        car1.setPrice(budget);
        System.out.println("Your budget is: " + car1.getPrice());

        System.out.println();
        scanner.nextLine();
        System.out.println("Enter your preferred Model type: ");
        String userInput = scanner.next();
        scanner.nextLine();
        System.out.println("Enter a year of preference: ");
        String userPreference = scanner.nextLine();
        System.out.println("Enter a price within your budget : ");
        double cashAtHand = scanner.nextDouble();

        System.out.println();

        car2.setModel(userInput);
        System.out.println("Your new Car model is: " + car2.getModel());

        car2.setYear(userPreference);
        System.out.println("Your preferred year type is: " + car2.getYear());

        car2.setPrice(cashAtHand);
        System.out.println("Your budget is: " + car2.getPrice());
    }
}
