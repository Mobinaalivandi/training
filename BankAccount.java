public class BankAccount {
    private int accountNumber;
    private  String ownerName;
    private int balance;
    BankAccount(int accountNumber, String ownerName, int balance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = 0 ;
    }
    public BankAccount() {

    }
    public String getownerName() {
        return ownerName;
    }

    public int getaccountNumber() {

        return accountNumber;
    }

    public int getbalance() {

        return balance;
    }

    public void setownerName(String ownerName) {

        this.ownerName = ownerName;
    }
    double sum = 0;
    public void deposit(double amount) {
        if (amount > 0) {
            sum = balance + amount;
            System.out.println(" deposit amount is : " + sum);
        } else {
            System.out.println("this amount is not acceptable");
        }
    }
    double subtract = 0;
    public void withdraw(double amount) {
        if (balance >= amount && amount > 0) {
            subtract = balance - amount;
            System.out.println("withdrawal amount is : " + subtract);
        } else {
            System.out.println("balance is not enough");
        }
    }
    public void printBalance() {

        System.out.println("current balance is : " + balance);
    }
}







