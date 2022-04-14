package ChapterFive;
/*
(Modified Compound-Interest Program) Modify the compound-interest application of
Fig. 5.6 to repeat its steps for interest rates of 5%, 6%, 7%, 8%, 9% and 10%. Use a for loop to
vary the interest rate.nth year.
// */
public class ModifiedCompoundInterest {
    public static void main(String[] args) {
        double principal = 1000;

        System.out.printf("%-6s%12s%20s%n", "Year", "Interest Rate","Amount on Deposit");

        for (int year = 1; year <= 10; year++) {
        for (int interestRate = 5; interestRate <= 10; interestRate++){
                 double amount = principal * Math.pow(1.0 + (interestRate * 0.01), year);
                System.out.printf("%2d%10d%,20.2f%n", year,interestRate, amount);
            }
        }
    }
}
