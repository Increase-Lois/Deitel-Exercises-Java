package PraciceCodes;

public class GtBank {
    private String name;
    private double balance;

    public GtBank(String name, double balance){
        this.name = name;
        this.balance = balance;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setBalance(double balance){
        if (balance > 0.0){
            this.balance = balance;
        }
    }
    public double getBalance(){
        return balance;
    }
    public void deposit(double depositAmount){
        if (depositAmount > 0.0){
            balance = balance + depositAmount;
        }
    }
    public void withdrawMoney(double withdrawalAmount){
        if (balance != 0.0 && withdrawalAmount != 0 ){
            balance = balance - withdrawalAmount;
        }
    }
}
