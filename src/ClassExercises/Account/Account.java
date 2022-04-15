package ClassExercises.Account;

public class Account {
    private String name;
    private String number;
    private Type type;

    Account(String accountName, String accountNumber, Type accountType){
        this.name = accountName;
        this.number = accountNumber;
        this.type = accountType;
    }

    public String getName(){
        return name;
    }
    public String getNumber(){
        return number;
    }
    public Type getType(){
        return  type;
    }

}
