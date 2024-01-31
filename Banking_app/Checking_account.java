public class Checking_account extends Banking_Account {

    private double serviceCharge;

    public Checking_account(String anAccount, double aBalance) {
        super(anAccount, aBalance);
        setserviceCharge(aBalance);
        // TODO Auto-generated constructor stub
    }

    public void setserviceCharge(double CheckingBalance) {
        if (CheckingBalance < 100)
            serviceCharge = 10;
        else
            serviceCharge = 0;
    }

    public double getServiceCharge() {
        return serviceCharge;
    }

    public void assessServiceCharge() {
        double newBalance = getBalance() - serviceCharge;
        setBalance(newBalance);
    }

}