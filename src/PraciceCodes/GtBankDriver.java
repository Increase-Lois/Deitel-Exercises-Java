package PraciceCodes;

import java.util.Scanner;

public class GtBankDriver {
    public static void main(String[] args) {
        GtBank bank = new GtBank("Lois",0.0);

        Scanner scanner = new Scanner(System.in);
        System.out.printf("%s balance on the account is : #%.2f%n" , bank.getName() , bank.getBalance());
        System.out.println();

        System.out.println("Enter your name");
        String userName = scanner.nextLine();

        bank.setName(userName);
        System.out.println("The name on your account is:" + bank.getName());

        bank.getBalance();
        System.out.println("Your current balance is: " + bank.getBalance());

        System.out.println("Enter the amount you want to deposit: ");
        double amountToDeposit = scanner.nextDouble();

        bank.deposit(amountToDeposit);
        System.out.println("Your new balance is: " + bank.getBalance());

        System.out.println("Enter the amount you want to withdraw: ");
        double withdraw = scanner.nextDouble();

        bank.withdrawMoney(withdraw);
        System.out.println("Your new balance is: " + bank.getBalance());

    }


}
