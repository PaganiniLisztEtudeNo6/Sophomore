public class Banking_Account {

    private String AccountNumber;
    private double balance;

    public Banking_Account(String anAccount, double aBalance) {
        AccountNumber = anAccount;
        balance = aBalance;
    }

    public void setBalance(double aBalance) {
        balance = aBalance;
    }

    public String getAccountNum() {
        return AccountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String toString() {
        String typeOfAccount = "";
        if (this instanceof CheckingAccount) {
            typeOfAccount = "Checking";
        } else {
            typeOfAccount = "Savings";
        }
        String formatStr = "%s Acct No: %s\nBalance: $%.2f";
        String AccountInfo = String.format(formatStr, typeOfAccount, AccountNumber, balance);
        return AccountInfo;
    }
}