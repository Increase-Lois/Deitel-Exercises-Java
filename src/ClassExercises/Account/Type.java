package ClassExercises.Account;

public enum Type {
    SAVINGS(0.50),
    CURRENT(0.25),
    TEENS(0.15);

    private double interestRate;

        Type(double interestRate) {
            this.interestRate = interestRate;
        }

    public double getInterestRate() {
        return interestRate;
    }
}



