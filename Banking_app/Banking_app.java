import java.util.*;

import javax.swing.JOptionPane;

public class Banking_app {
    public static void main(String[] args) {
        String ssnStr, nameStr, checkingAcctNumStr, begCheckingBalStr, savingsAcctNumStr, begSavingsBalStr;
        double beCheckingBal = 0, begSavingsbal = 0;
        Customer aCustomer;
        ssnStr = JOptionPane.showInputDialog("Enter SSN : ");
        nameStr = JOptionPane.showInputDialog("Enter name : ");
        checkingAcctNumStr = JOptionPane.showInputDialog("Enter checking account number or pass enter for name : ");
        if (!checkingAcctNumStr.equals("")) {
            begCheckingBalStr = JOptionPane.showInputDialog("Enter begining checking account balance : ");
            beCheckingBal = Double.parseDouble(begCheckingBalStr);
        }
        savingsAcctNumStr = JOptionPane.showInputDialog("Enter saving account number or pass enter for nine : ");
        if (!savingsAcctNumStr.equals("")) {
            begSavingsBalStr = JOptionPane.showInputDialog("Enter begining saving account account balance : ");
            begSavingsbal = Double.parseDouble(begSavingsBalStr);
        }
        aCustomer = new Customer(ssnStr, nameStr, checkingAcctNumStr, beCheckingBal, savingsAcctNumStr, begSavingsbal);
        if (aCustomer.getChecking_account() != null) {
            aCustomer.getChecking_account().assessServiceCharge();
        }
        if (aCustomer.getSaving_account() != null) {
            aCustomer.getSaving_account().payinterest();
        }
        System.out.print(aCustomer.toString());

    }
}