package ChapterThree.Modified;

import java.util.Scanner;

/*
(Modified Account Class) Modify class Account (Fig. 3.8) to provide a method called with-
that withdraws money from an Account . Ensure that the withdrawal amount does not exceed
the Account ’s balance. If it does, the balance should be left unchanged and the method should print
a message indicating "Withdrawal amount exceeded account balance." Modify class AccountTest
(Fig. 3.9) to test method withdraw .
 */
public class ModifiedAccount{
    public static void main(String[] args) {
        Account bank = new Account("Joseph", 0.0);

        Scanner scan = new Scanner(System.in);
        System.out.printf("%s balance on the account is : #%.2f%n" , bank.getName() , bank.getBalance());
        System.out.println();

        System.out.println("Enter your name");
        String userName = scan.nextLine();

        bank.setName(userName);
        System.out.println("The name on your account is:" + bank.getName());

        bank.getBalance();
        System.out.println("Your current balance is: " + bank.getBalance());

        System.out.println("Enter the amount you want to deposit: ");
        double amountToDeposit = scan.nextDouble();

        bank.deposit(amountToDeposit);
        System.out.println("Your new balance is: " + bank.getBalance());

        System.out.println("Enter the amount you want to withdraw: ");
        double withdraw = scan.nextDouble();

        bank.withdrawMoney(withdraw);
        System.out.println("Your new balance is: " + bank.getBalance());

    }

    }
