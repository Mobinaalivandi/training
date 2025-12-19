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
        for (int i = 0; i < 2; ++i) {
            for (int j = 0; j < 2; ++j) {
                for (int p = i + 1; p < 2; ++p) {
                    for (int k = j + 1; k < 2; ++k) {
                        if (sud[i][j] == sud[p][k]) {
                            find = false;
                        } else if (sud[i][j] == sud[i][k]) {
                            find = false;
                        } else if (sud[i][j] == sud[p][j]) {
                            find = false;
                                }
                            }
                        }
                    }
                }
        for (int i = 0; i < 2; ++i) {
            for (int j = 2; j < 4; ++j) {
                for (int p = i + 1; p < 2; ++p) {
                    for (int k = j + 1; k < 4; ++k) {
                        if (sud[i][j] == sud[p][k]) {
                            find = false;
                        } else if (sud[i][j] == sud[i][k]) {
                            find = false;
                        } else if (sud[i][j] == sud[p][j]) {
                            find = false;
                                }
                            }
                        }
                    }
                }
        for (int i = 2; i < 4; ++i) {
            for (int j = 0; j < 2; ++j) {
                for (int p = i + 1; p < 4; ++p) {
                    for (int k = j + 1; k < 2; ++k) {
                        if (sud[i][j] == sud[p][k]) {
                            find = false;
                        } else if (sud[i][j] == sud[i][k]) {
                            find = false;
                        } else if (sud[i][j] == sud[p][j]) {
                            find = false;
                                }
                            }
                        }
                    }
                }
        for (int i = 2; i < 4; ++i) {
            for (int j = 2; j < 4; ++j) {
                for (int p = i + 1; p < 4; ++p) {
                    for (int k = j + 1; k < 4; ++k) {
                        if (sud[i][j] == sud[p][k]) {
                            find = false;
                        } else if (sud[i][j] == sud[i][k]) {
                            find = false;
                        } else if (sud[i][j] == sud[p][j]) {
                            find = false;
                                }
                            }
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


