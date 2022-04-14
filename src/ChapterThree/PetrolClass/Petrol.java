package ChapterThree.PetrolClass;

import ChapterThree.PetrolClass.PetrolPurchase;

import java.util.Scanner;

/*
(Class PetrolPurchase ) Create a class called PetrolPurchase to represent information
about the petrol you purchase. The class should include five pieces of information in the form of instance
variables—the station’s location (type String ), the type of petrol (type String ), the quantity (type int ) of the purchase in liters,
 the price per liter ( double ), and the percentage discount
( double ). Your class should have a constructor that initializes the five instance variables. Provide a
set and a get method for each instance variable. In addition, provide a method named getPurchase-
Amount that calculates the net purchase amount (i.e., multiplies the quantity by the price per liter)
minus the discount, then returns the net amount you had to pay as a double value. Write an appli-
cation class named Petrol that demonstrates the capabilities of class PetrolPurchase .
 */
public class Petrol {
    public static void main(String[] args) {
        PetrolPurchase petrol = new PetrolPurchase("Nigeria","Fuel",0,0.0,0.0);


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your preferred Station location: ");
        String userChoice = scanner.nextLine();

        System.out.println("Enter your preferred petrol type: ");
        String userType = scanner.nextLine();

        System.out.println("Enter the quantity you want to purchase: ");
        int userQty = scanner.nextInt();

        System.out.println("Enter a price that's within your budget: ");
        double userInput = scanner.nextDouble();

        System.out.println("Enter a fair percentage discount for all purchases: ");
        double userEntry = scanner.nextDouble();



        petrol.setStationLocation(userChoice);
        System.out.println("Your new stationLocation is: " + petrol.getStationLocation());

        petrol.setPetrolType(userType);
        System.out.println("Your preferred type is: " + petrol.getPetrolType());

        petrol.setQuantity(userQty);
        System.out.println("Your new quantity is: " + petrol.getQuantity());

        petrol.setPricePerLitre(userInput);
        System.out.println("Your new price is: " + petrol.getPricePerLitre());

        petrol.setPercentageDiscount(userEntry);
        System.out.println("You have a discount of: " + petrol.getPercentageDiscount());

        petrol.getPurchaseAmount();
        System.out.println("Your total is " + petrol.getPurchaseAmount());

    }

}