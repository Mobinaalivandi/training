package Animals;

public class Cat extends Zoo {
    public Cat(String name, int age, double weight, String type) {
        super(name, age, weight, type);
    }

    @Override
    public void sound() {
        System.out.println("Meow!");
    }

    @Override
    public double food() {
        double dailyfood = 0;
        if (getage() < 2) {
            dailyfood = 200;
        } else {
            dailyfood = 350;
        }
        System.out.println(dailyfood);
        return dailyfood;
    }

    @Override
    public void movement() {
        System.out.println("Scratch");

    }
}
