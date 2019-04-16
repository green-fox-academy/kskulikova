import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReversedLines {

    public static void main(String[] args) {
        // Create a method that decrypts reversed-lines.txt
        // Create a method that decrypts the duplicated-chars.txt
        String filename = "reversed-lines.txt";
        String copyTo = "decrypted.txt";
        duplicatedChars(filename, copyTo);
    }

    private static void duplicatedChars(String copyFrom, String decrypted) {
        List<String> list = new ArrayList<>();
        StringBuilder s = new StringBuilder();
        StringBuilder word = new StringBuilder();
        try {
            Path src = Paths.get("assets/" + copyFrom);
            List<String> content = Files.readAllLines(src);
            for (String line : content) {
                String[] words = line.split(" ");
                for (int i = words.length - 1; i >= 0; i--) {
                    for (int j = words[i].length() - 1; j >= 0; j--) {
                        s.append(words[i].charAt(j));
                    }
                    word.append(" ").append(s);
                    s = new StringBuilder();
                }
                word.append("\n");
            }
            list.add(word.toString());

            Files.write(Paths.get(decrypted), list);

        } catch (IOException e) {
            System.out.println("Could not open file: duplicated-chats.txt");
        }
    }
}