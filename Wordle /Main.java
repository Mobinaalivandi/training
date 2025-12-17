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
            attempt = attempt.trim().toLowerCase();
            if (!(attempt.matches("[a-zA-Z]{5}"))) {
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
                    char att = attempt.charAt(i);
                    if (att == check.get(i)) {
                            guess = guess + "o";
                            check.set(i , '$');
                        } else {
                            guess = guess + "*";
                        }
                    }
                    for (int k = check.size() - 1 ; k >= 0 ; --k) {
                        if (check.get(k) == '$') {
                            check.remove(k);
                        }
                    }
                    String fin = "";
                    for ( int i = 0 ; i < 5 ; ++i) {
                       char att = attempt.charAt(i);
                       if ( guess.charAt(i) == '*') {
                        boolean find = false;
                        for (int j = 0; j < check.size(); ++j) {
                            if (att == check.get(j)) {
                                fin = fin + 'w';
                                find = true;
                                check.remove(j);
                                break;
                            }
                        } 
                        if (!find)
                            fin = fin + 'x';
                        }
                       if (guess.charAt(i) == 'o') {
                           fin = fin + 'o';
                       }
                }
                System.out.println(fin);
            }
            if (count == 6) {
                if (!(attempt.equals(randomword))) {
                    System.out.println("Sorry , you lost :(( . Better luck next time ! The word was :" + " " + randomword);
                }
            }
        }
    }
}







