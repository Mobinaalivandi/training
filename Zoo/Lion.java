package Animals;

public class Lion extends Zoo {
    public Lion(String name, int age, double weight , String type) {
        super(name, age, weight , type);
    }

    @Override
    public void sound() {
        System.out.println("Roar");
    }

    @Override
    public double food() {
        double dailyfood = getweight() * 0.08;
        System.out.println(dailyfood);
        return dailyfood;
    }

    @Override
    public void movement() {
        System.out.println("Hunt");

    }
}
