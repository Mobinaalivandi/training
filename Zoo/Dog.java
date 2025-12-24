package Animals;

import java.util.ArrayList;

public class Dog extends Zoo {
    public Dog(String name, int age, double weight , String type) {

        super(name , age , weight , type);
    }
    @Override
    public void sound() {
        System.out.println("Woof!");
    }
    @Override
    public double food() {
        double dailyfood = 0;
        if (getage() < 2) {
            dailyfood = 400;
        } else {
            dailyfood = 600;
        }
        System.out.println(dailyfood);
        return dailyfood;
    }
    @Override
    public void movement() {
        System.out.println("Fetch Ball");



}
}
