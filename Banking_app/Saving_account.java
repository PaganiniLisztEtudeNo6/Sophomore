public class Saving_account extends Banking_Account {
    private double InterestRate;

    public Saving_account(String anAccountNum, double aBalance) {
        super(anAccountNum, aBalance);
        setInterestRate(aBalance);
    }

    public void setInterestRate(double SavingBalance) {
        if (SavingBalance >= 100)
            InterestRate = 0.05;
        else
            InterestRate = 0;
    }

    public double getInterestRate() {
        return InterestRate;
    }

    public void payinterest() {
        double currentBalance, newBalance = 0;
        currentBalance = getBalance();
        if (currentBalance >= 100)
            newBalance = currentBalance * (1 + InterestRate);
        setBalance(newBalance);
    }

}