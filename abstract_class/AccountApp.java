public class AccountApp {
    public static void main(String[] args) {
        Savings account0 = new Savings("1111", 100);
        double bal = account0.getBalance();
        bal = account0.payinterestRate(bal);
        System.out.println(account0.toString());
    }
}