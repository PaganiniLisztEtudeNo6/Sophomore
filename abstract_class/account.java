public abstract class account {
    private String accountnum;
    private double balance;

    public account(String anAccountnum, double abalance) {
        setAccountNum(anAccountnum);
        setBalance(abalance);
    }

    public abstract double payinterest(double abalance);

    public void setAccountNum(String anAccountnum) {
        accountnum = anAccountnum;
    }

    public void setBalance(double abalance) {
        balance = abalance;
    }

    public String getAccountNum() {
        return accountnum;
    }

    public double getBalance() {
        return balance;
    }

}