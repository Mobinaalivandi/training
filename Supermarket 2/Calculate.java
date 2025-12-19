public class Calculate {
    public void maximumprice(Shop[] lists) {
        String max = "";
        double maxx = 0;
        for (int i = 0; i < lists.length; ++i) {
            if (maxx < lists[i].getprice()) {
                maxx = lists[i].getprice();
                max = lists[i].name;
            }
        }
        System.out.println(maxx + " " + max);
    }

    public void worth(Shop[] lists) {
        double sum = 0;
        double worth = 0;
        for (int i = 0; i < lists.length; ++i) {
            sum = lists[i].getprice() * lists[i].getquantity();
            worth = worth + sum;
        }
        System.out.println(worth);
    }

    public void minimumprice(Shop[] lists) {
        String minn = lists[0].getname();
        double min = lists[0].getprice();
        for (int i = 0; i < lists.length; ++i) {
            if (min > lists[i].getprice()) {
                min = lists[i].getprice();
                minn = lists[i].getname();
            }
        }
        System.out.println(minn + " " + min);

    }

    public void sort(Shop[] lists) {
        for (int i = 0; i < lists.length; ++i) {
            for (int j = i + 1; j < lists.length; ++j) {
                if (lists[i].getprice() < lists[j].getprice()) {
                    Shop temp = lists[i];
                    lists[i] = lists[j];
                    lists[j] = temp;
                }
            }
        }
        for (int i = 0; i < lists.length; ++i) {
            System.out.println(lists[i].getname() + " " + lists[i].getprice());
        }
    }
}
