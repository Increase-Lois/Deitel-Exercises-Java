package ClassExercises.Methods;

public class Bank{
    public static void main(String[] args) {

        Account increaseAccount = new Account("Increase Lois");
        Account ajAccount = new Account("Ademiju Taiwo Joseph");

        increaseAccount.withdraw(45000);
        increaseAccount.deposit(2000);

        ajAccount.setAccountName("Ademiju Joseph");
        increaseAccount.setAccountName("Increase Lois");


            // Account.balance =500;
            //Math.PI;
            //The .PI is public... All CAPS say that is constant and final.

        //increaseAccount.balance =35_000_0000;
       // System.out.println("Our account balance is "+ Account.balance);
       // System.out.println("Increase balance is "+ increaseAccount.balance);

        //ajAccount.balance =5000;
        // System.out.println("Our account balance is "+ Account.balance);
       // System.out.println("Ademiju's balance is "+ ajAccount.balance);

        increaseAccount.setAccountName("Sucre");


      // System.out.println("Increase initial balance is "+increaseAccount.checkBalance());
        System.out.println("Increase Account name is "+ increaseAccount.getAccountName());

      //System.out.println("Ademiju's initial balance is "+ ajAccount.checkBalance());
        System.out.println("AJ Account name is "+ ajAccount.getAccountName());

        System.out.println("AJ's new Account name is "+ ajAccount.getAccountName());
        ajAccount.setAccountName("A.Miju ");
    }
}
