package Animals;

public class Bird extends Zoo {
    public Bird(String name, int age, double weight , String type) {
        super(name, age, weight , type);
    }

    @Override
    public void sound() {
        System.out.println("Chirp!");
    }

    @Override
    public double food() {
        double dailyfood = 100;
        System.out.println(dailyfood);
        return dailyfood;
    }

    @Override
    public void movement() {
        System.out.println("Fly");

    }
}
