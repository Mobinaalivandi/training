import java.util.Scanner;
import java.util.Random;
import java.util.HashSet;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random ran = new Random();
        BankAccount m = new BankAccount();
        HashSet<Integer> usedIds = new HashSet<>();
        ArrayList<BankAccount> list = new ArrayList<>();
        int n = input.nextInt();
        input.nextLine();
        for (int i = 0; i < n; ++i) {
            String ownerName = input.nextLine();
            int accountNumber = ran.nextInt(900000) + 100000;
            while (usedIds.contains(accountNumber)) {
                accountNumber = ran.nextInt(900000) + 100000;
            }
            usedIds.add(accountNumber);
            BankAccount account = new BankAccount(accountNumber, ownerName, 0);
            list.add(account);
            System.out.println(list.get(i).getownerName());
            System.out.println(list.get(i).getaccountNumber());
        }
        m.withdraw(list);
        m.deposit(list);
        }
    }




