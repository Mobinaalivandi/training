import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random ran = new Random();
        double amount = input.nextDouble();
        BankAccount su = new BankAccount();
        int x = input.nextInt();
        int[] id = new int[x];
        BankAccount[] list = new BankAccount[x];
        for (int j = 0; j < x; ++j) {
            id[j] = ran.nextInt(899999) + 1000000;
        }
        for (int i = 0; i < x; ++i) {
            String ownerName = input.next();
            int accountNumber = ran.nextInt(899999) + 1000000;
            for (int k = 0; k < i; ++k) {
                if (accountNumber == id[k]) {
                    accountNumber = ran.nextInt(899999) + 1000000;
                }
            }
            id[i] = accountNumber;
            BankAccount s = new BankAccount(accountNumber, ownerName, 0);
            list[i] = s;
            System.out.println(list[i].getownerName());
            System.out.println(list[i].getaccountNumber());
            System.out.println(list[i].getbalance());
        }
        su.deposit(amount);
        su.withdraw(amount);
        su.printBalance();
    }
}

