public class Savings extends account implements bankinterface {
    private double interestRate;

    public Savings(String anAccountNum, double abalance) {
        super(anAccountNum, abalance);
        setInterestRate(abalance);
    }

    public void setInterestRate(double savingsBalance) {
        if (savingsBalance >= 100) {
            interestRate = 0.05;
        } else {
            interestRate = 0;
        }
    }

    public double payinterestRate(double abalance) {
        double currentBalance, newBalance = 0;
        currentBalance = abalance;
        if (currentBalance >= 100) {
            newBalance = currentBalance * (1 + interestRate);
        }

        setBalance(newBalance);
        return newBalance;

    }

    public String toString() {
        String formatstr = "This a saving Account No: %s\nBalance:$%.2f\n\nFor Bank %s\nlocated at %s\n";
        String accountInfo = String.format(formatstr, this.getAccountNum(), this.getBalance(), BANK_NAME, BANK_ADDRESS);
        return accountInfo;
    }
}