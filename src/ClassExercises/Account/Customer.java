package ClassExercises.Account;

public class Customer {
    private String name;
    private Account myAccount;

    Customer(String name, Account myAccount){
        this.name = name;
        this.myAccount = myAccount;
    }
    public String getName(){
        return name;
    }
    public Account myAccount(){
        return myAccount;
    }

}
