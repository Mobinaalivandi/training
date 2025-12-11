import java.util.Scanner;
import java.util.Random;
import java.util.HashSet;
import java.util.Date;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random ran = new Random();
        int x = input.nextInt();
        BankAccount[] list = new BankAccount[x];
        ArrayList<String> history = new ArrayList<>();
        HashSet<Integer> usedIds = new HashSet<>();
        for (int i = 0; i < x; ++i) {
            double amount = input.nextDouble();
            input.nextLine();
            String ownerName = input.next();
            int accountNumber = ran.nextInt(900000) + 100000;
            while (usedIds.contains(accountNumber)) {
                accountNumber = ran.nextInt(900000) + 100000;
            }
            usedIds.add(accountNumber);
            BankAccount s = new BankAccount(accountNumber, ownerName, 0, amount);
            list[i] = s;
            list[i].deposit(amount);
            list[i].withdraw(amount);
            list[i].printBalance();
            Date date = new Date();
            String datee = String.format("%tD  %tT ", date, date);
            if ( amount > 0) {
                history.add("User's name :" + ownerName + " " + "User's id : " + accountNumber + " " + "Time and date of creation:" + datee + " " + "The amount that was deposited/withdrawn:" + amount);
            } else {
                System.out.println("amount is not valid");
            }
            System.out.println(list[i].getownerName());
            System.out.println(list[i].getaccountNumber());
        }
        for (int i = 0; i < history.size(); ++i) {
            Date date = new Date();
            System.out.println(history.get(i));
        }
        System.out.println("\n The number of created accounts" + " " + history.size());
    }
}









