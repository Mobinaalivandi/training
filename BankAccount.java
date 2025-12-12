import java.util.Scanner;
import java.util.ArrayList;
public class BankAccount {
    Scanner input = new Scanner(System.in);
    ArrayList<String> history = new ArrayList<>();
    private int accountNumber;
    private String ownerName;
    private double balance;

    BankAccount(int accountNumber, String ownerName, double balance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public BankAccount() {
    }

    public String getownerName() {
        return ownerName;
    }

    public int getaccountNumber() {
        return accountNumber;
    }

    public double getbalance() {
        return balance;
    }

    public void setownerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void deposit(ArrayList<BankAccount> list) {
        for (int i = 0; i < list.size(); ++i) {
            double amount = input.nextDouble();
            if (amount > 0) {
                list.get(i).balance = list.get(i).balance + amount;
                Date date = new Date();
                String datee = String.format("%tD  %tT ", date, date);
                history.add("Owners name : " + list.get(i).ownerName + " " + "Account's id : " + list.get(i).accountNumber + " " + " Time and date of creation : " + datee + " " + " The amount that was deposited : " + amount);
            } else {
                System.out.println("This amount is not acceptable for depositing");
            }
        }
        for (int i = 0; i < history.size(); ++i) {
            System.out.println(history.get(i)); }
        System.out.println("number of created accounts : " + history.size());
        }
    public void withdraw(ArrayList<BankAccount> list) {
        for (int i = 0; i < list.size(); ++i) {
            double amount = input.nextDouble();
            if (list.get(i).balance >= amount && amount > 0) {
                list.get(i).balance = list.get(i).balance - amount;
                Date date = new Date();
                String datee = String.format("%tD  %tT ", date, date);
                history.add("Owners name : " + list.get(i).ownerName + " " + "Account's id : " + list.get(i).accountNumber + " " + " Time and date of creation : " + datee + " " + " The amount that was withdrawn : " + amount);
            } else {
                System.out.println("This amount is not acceptable for withdrawing");
            }
        }
        for (int i = 0; i < history.size(); ++i) {
            System.out.println(history.get(i));
        }
        System.out.println("number of created accounts : " + history.size());
    }
}









