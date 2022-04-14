package ChapterFour;
/*
    4.18 (Credit Limit Calculator) Develop a Java application that determines whether any of several department-store
     customers has exceeded the credit limit on a charge account. For each customer, the following facts are available:
            a) account number
            b) balance at the beginning of the month
            c) total of all items charged by the customer this month
            d) total of all credits applied to the customer’s account this month
            e) allowed credit limit.
    The program should input all these facts as integers, calculate the new balance (= beginning balance+ charges – credits),
            display the new balance and determine whether the new balance exceeds the customer’s credit limit.
            For those customers whose credit limit is exceeded, the program should display the message "Credit limit exceeded" .
    */
public class CreditLimitCalculator {

        private int accountNumber;
        private int balance;
        private  int itemCharged;
        private int creditApplied;
        private int allowedCreditLimit;
        private int newBalance;

        public CreditLimitCalculator(int accountNumber,int balance, int itemCharged, int creditApplied, int creditLimit){
            this.accountNumber =  accountNumber;
            this.balance = balance;
            this.itemCharged = itemCharged;
            this.creditApplied = creditApplied;
            this.allowedCreditLimit = creditLimit;
        }
        public int getAccountNumber(){
            return accountNumber;
        }
        public void setAccountNumber(int accountNumber) {
            this.accountNumber = accountNumber;
        }

        public int getBalance() {
            return balance;
        }
        public void setBalance(int balance){
            this.balance = balance;
        }
        public int getItemCharged(){
            return itemCharged;
        }
        public void setItemCharged(int itemCharged){
            this.itemCharged = itemCharged;
        }

        public int getCreditApplied() {
            return creditApplied;
        }

        public void setCreditApplied(int creditApplied) {
            this.creditApplied = creditApplied;
        }

        public int getAllowedCreditLimit() {
            return allowedCreditLimit;
        }
        public void setAllowedCreditLimit(int creditLimit) {
            if (balance < creditLimit) {
                System.out.println("Credit limit exceeded");
            }
            this.allowedCreditLimit = creditLimit;
        }

        public void setNewBalance(){
            newBalance= balance + itemCharged -creditApplied;
        }
        public int getNewBalance(){
            return newBalance;
        }


        public static void main(String[] args) {

            CreditLimitCalculator calculator =  new CreditLimitCalculator(0,0,0,0,0);

            calculator.setAccountNumber(1235096613);
            System.out.println("AccountNumber is: " + calculator.getAccountNumber());

            calculator.setBalance(5000);
            System.out.println("Balance at the beginning of the month is: " + calculator.getBalance());

            calculator.setItemCharged(700);
            System.out.println("Total of all item charged by the customer this month is: " + calculator.getItemCharged());

            calculator.setCreditApplied(2500);
            System.out.println("Total of all credit applied to the customer's account this month is: " + calculator.getCreditApplied());

            calculator.setAllowedCreditLimit(200000);
            System.out.println("Allowed credit limit is: " + calculator.getAllowedCreditLimit());

            calculator.setNewBalance();
            System.out.println("New accountBalance is: " + calculator.getNewBalance());
        }

    }


