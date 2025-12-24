package Animals;
import java.util.ArrayList;
public class Zoo {
    private String name;
    private int age;
    private double weight;
    private String type;

    public Zoo(String name, int age, double weight , String type) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.type = type;
    }

    public String getname() {
        return name;
    }

    public int getage() {
        return age;
    }

    public double getweight() {
        return weight;
    }

    public void showallinfo(ArrayList<Zoo> animals) {
        for (int i = 0; i < animals.size(); ++i) {
            System.out.println(animals.get(i).name + " " + animals.get(i).age + " " + animals.get(i).weight);
        }
    }

    public void averageage(ArrayList<Zoo> animals) {
        double sum = 0;
        for (int i = 0; i < animals.size(); ++i) {
            sum = sum + animals.get(i).age;
        }
        double average = sum/animals.size();
        System.out.println(average);
    }

    public void heaviest(ArrayList<Zoo> animals) {
        String maxx = " ";
        double max = 0;
        for (int i = 0; i < animals.size(); ++i) {
            if (animals.get(i).weight > max) {
                max = animals.get(i).weight;
                maxx = animals.get(i).name;
            }
        }
        System.out.println(max + maxx);
    }
    public void sort(ArrayList<Zoo> animals) {
        for (int i = 0; i < animals.size(); ++i) {
            for (int j = i + 1 ; j < animals.size(); ++j) {
                if ( animals.get(i).weight > animals.get(j).weight ) {
                    Zoo temp = animals.get(i);
                    animals.set(i , animals.get(j));
                    animals.set( j , temp);
                }
            }
        }
        for (int i = 0; i < animals.size(); ++i) {
            System.out.println(animals.get(i).weight + animals.get(i).name);
        }

    }
    public void sound() {

        System.out.println("This animal make's this sound");
    }

    public double food() {
        double dailyfood = 0;
        System.out.println(dailyfood);
        return dailyfood;
    }

    public void movement() {
        System.out.println("This animal's special movement is : ");
    }

    public void sleep() {
        System.out.println("All animals sleeo");
    }

    public void move() {
        System.out.println("All animals move");
    }

    public void allfood(ArrayList<Zoo> animals) {
        double total = 0 ;
        for (int i = 0; i < animals.size(); ++i) {
            total = total + animals.get(i).food();
        }
        System.out.println(total);

        }
    }

