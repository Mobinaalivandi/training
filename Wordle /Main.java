import java.io.IOException;
import java.nio.file.*;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        Wordle m = new Wordle();
        ArrayList<String> word = m.readWords();
        Random ran = new Random();
        int in = ran.nextInt(word.size());
        String randomword = word.get(in);
        int count = 0 ;
        while (count < 6) {
            String attempt = input.nextLine();
            attempt = attempt.toLowerCase();
            int length = attempt.length();
            if (length != 5) {
                System.out.println("This name is not acceptable , enter new one");
            } else {
                ++count;
                if (attempt.equals(randomword)) {
                    System.out.println("congrats ! you won");
                    break;
                }
                ArrayList<Character> check = new ArrayList<>();
                for (int i = 0; i < randomword.length(); ++i) {
                    char repeat = randomword.charAt(i);
                    check.add(repeat);
                }
                String guess = "";
                for (int i = 0; i < 5; ++i) {
                    boolean find = false;
                    char att = attempt.charAt(i);
                    for (int k = 0; k < check.size(); ++k) {
                        if ( att == check.get(k)) {
                            if ( k==i) {
                                guess = guess + "o";
                            } else {
                                guess = guess + "w";
                            }
                            check.remove(k);
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
                if (!(attempt.equals(randomword))) {
                    System.out.println("Sorry , you lost :(( . Better luck next time ! The word was :" + " " + randomword);
                }
            }
        }
    }
}



