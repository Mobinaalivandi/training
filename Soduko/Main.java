import java.io.IOException;
import java.nio.file.*;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        Words m = new Words();
        ArrayList<String> word = m.readWords();
        int[][] sud = new int[4][4];
        int in = 0;
        for (int i = 0; i < 4; ++i) {
            for (int j = 0; j < 4; ++j) {
                sud[i][j] = Integer.parseInt(word.get(in));
                ++in;
            }
        }
        boolean find = true;
        for (int i = 0; i < 4; ++i) {
            for (int j = 0; j < 4; ++j) {
                if (sud[i][j] <= 0 || sud[i][j] >= 5) {
                    find = false;
                }
            }
        }
        for (int i = 0; i < 4; ++i) {
            for (int j = 0; j < 4; ++j) {
                for (int k = j + 1; k < 4; ++k) {
                    if (sud[i][j] == sud[i][k]) {
                        find = false;
                    }
                }
            }
        }
        for (int i = 0; i < 4; ++i) {
            for (int j = 0; j < 4; ++j) {
                for (int k = j + 1; k < 4; ++k) {
                    if (sud[j][i] == sud[k][i]) {
                        find = false;
                    }
                }
            }
        }
        ArrayList<Integer> map = new ArrayList<>();
        for (int i = 0; i < 2; ++i) {
            for (int j = 0; j < 2; ++j) {
                if (map.contains(sud[i][j])) {
                    find = false;
                } else {
                    map.add(sud[i][j]);
                }
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 2; ++i) {
            for (int j = 2; j < 4; ++j) {
                if (list.contains(sud[i][j])) {
                    find = false;
                } else {
                    list.add(sud[i][j]);
                }
            }
        }
        ArrayList<Integer> k = new ArrayList<>();
        for (int i = 2; i < 4; ++i) {
            for (int j = 0; j < 2; ++j) {
                if (k.contains(sud[i][j])) {
                    find = false;
                } else {
                    k.add(sud[i][j]);
                }
            }
        }
        ArrayList<Integer> ma = new ArrayList<>();
        for (int i = 2; i < 4; ++i) {
            for (int j = 2; j < 4; ++j) {
                if (ma.contains(sud[i][j])) {
                    find = false;
                } else {
                    ma.add(sud[i][j]);
                }
            }
        }
        if (find) {
            System.out.println("This soduko is valid");
        } else {
            System.out.println("This soduko is invalid");
                }
            }
        }




