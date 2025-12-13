import java.util.Scanner;
import java.util.Random;
public class Wordle {
    private String[] words = {"blaze", "crumb", "flare", "snout", "drift", "plank", "chime", "grasp", "flick", "mound", "spice", "trove", "sweep", "brink", "slate", "choir", "proud", "vines", "torch", "glade"};
    private String randomword;
    private int count;
    Scanner input = new Scanner(System.in);

    Wordle() {
        count = 0;
        Random ran = new Random();
        int in = ran.nextInt(words.length);
        randomword = words[in];
    }
    public String getrandomword() {
        return randomword;
    }
    public void game() {
        while (count < 6) {
            String attempt = input.nextLine();
            int length = attempt.length();
            if (length != 5) {
                System.out.println("This name is not acceptable , enter new one");
            } else {
                ++count;
                if (attempt.equals(getrandomword())) {
                    System.out.println("congrats ! you won");
                    break;
                }
                String guess = "";
                for (int i = 0; i < 5; ++i) {
                    char att = attempt.charAt(i);
                    boolean find = false;
                    for (int j = 0; j < 5; ++j) {
                        char letter = getrandomword().charAt(j);
                        if (att == letter) {
                            if (i == j) {
                                guess = guess + "o";
                            } else {
                                guess = guess + "w";
                            }
                            find = true;
                            break;
                        }
                    }
                    if (!find) {
                        guess = guess + "x";
                    }
                }
                System.out.println(guess);
            }
            if (count == 6) {
                if (!(attempt.equals(getrandomword()))) {
                    System.out.println("Sorry , you lost :(( . Better luck next time ! The word was :" + " " + getrandomword());
                }
            }
        }
    }
}


