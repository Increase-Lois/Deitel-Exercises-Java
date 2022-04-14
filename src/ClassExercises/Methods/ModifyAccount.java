package ClassExercises.Methods;

public class ModifyAccount {
    private int balance;

    private int withdrawal;

    public int checkBalance() {
        return balance;
    }
    public void deposit(int amount){
        balance =balance + amount;
    }
    public void setWithdrawal(int amount){
        balance = balance - amount;
    }

    public int getWithdrawal() {
        return balance;
    }
}
