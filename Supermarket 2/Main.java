import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Calculate cal = new Calculate();
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        Shop[] lists = new Shop[n];
        for (int i = 0; i < n; ++i) {
            double price = input.nextDouble();
            int quantity = input.nextInt();
            Shop list = new Shop(price, quantity);
            String name = input.next();
            list.name = name;
            lists[i] = list;
        }
        cal.maximumprice(lists);
        cal.minimumprice(lists);
        cal.worth(lists);
        cal.sort(lists);

    }
}

