import java.util.ArrayList;
import java.io.IOException;
import java.nio.file.*;
import java.nio.charset.StandardCharsets;
import java.util.List;
public class Words{
    public ArrayList<String> readWords() throws IOException {
        Path way = Path.of("soduko.txt");
        List<String> lines = Files.readAllLines(way, StandardCharsets.UTF_8);
        ArrayList<String> word = new ArrayList<>();
        for (String w : lines) {
            String[] part = w.split(" ");
            for (String num : part) {
                word.add(num);
            }
        }
        return word;
    }
}
