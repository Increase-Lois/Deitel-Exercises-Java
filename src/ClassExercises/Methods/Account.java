package ClassExercises.Methods;

public class Account {
    private String accountName;
    private int balance;
    //public static int balance;
    //public final int balance = 50;
    //private static int balance;
    //static variables are shared... instance variables are not... Static does not mean constant.... A static method cannot play with an instance variable.

    public Account(String accountName) {
        this.accountName = accountName;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String newName) {
        accountName = newName;
    }

    public void deposit(int amount) {
        balance = balance + amount;
        setAccountName("Moji");
    }

        //1.static methods + instance variables =Cannot work.
        //4.instance variable + static methods = will not work.
        //public static void deposit(int amount){
//        balance = balance + amount;
//        setAccountName("Moji");

//        2.static method + static variables = will work
//        public static void staticMethodAndStaticVariable(){
//                bankName = "Diamond Access"}
//    }
        //3. instance methods + static variables = will work
//        public void instance MethodAndStaticVariable(String newName){
//            accountName=newName;
//        bankName ="GT CO";
//        }


//        //instance variable + instance methods = work.
//    public String getAccountName(){
//        return accountName;





    public void withdraw(int amount) {
        balance= balance - amount;
    }

    public int checkBalance() {
        return balance;
    }
}

