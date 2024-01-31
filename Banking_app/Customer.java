import javax.swing.text.StyleConstants;

public class Customer {
    private String ssn, name;
    private Checking_account checking_account;
    private Saving_account saving_account;

    public Customer(String aSSN, String aName,
            String aChackingAcctNum, double begCheckingBal,
            String aSavingsAcctNum, double begSavingsbal) {
        ssn = aSSN;
        name = aName;
        setCheckingAccount(aChackingAcctNum, begCheckingBal);
        setSavingAccount(aSavingsAcctNum, begSavingsbal);
    }

    public void setCheckingAccount(String checkingAcctNum, double checkingAcctbal) {
        if (!checkingAcctNum.equals(""))
            checking_account = new Checking_account(checkingAcctNum, checkingAcctbal);
    }

    public void setSavingAccount(String SavingsAcctNum, double savingsAcctbal) {
        if (!SavingsAcctNum.equals(""))
            saving_account = new Saving_account(SavingsAcctNum, savingsAcctbal);
    }

    public Checking_account getChecking_account() {
        return checking_account;
    }

    public Saving_account getSaving_account() {
        return saving_account;
    }

    public String toString() {
        String fornatStr = "SSN: %s\n\n%s\n\n%s\n\n";
        String customerStr = String.format(fornatStr, ssn, name, checking_account, saving_account);
        return customerStr;
    }

}