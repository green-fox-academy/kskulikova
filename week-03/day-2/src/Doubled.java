import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Doubled {

    public static void main(String[] args) {
        // Create a method that decrypts the duplicated-chars.txt
        String filename = "duplicated-chars.txt";
        String copyTo = "decrypted.txt";
        duplicatedChars(filename, copyTo);
    }

    private static void duplicatedChars(String copyFrom, String decrypted) {
        List<String> list = new ArrayList<>();
        String s = "";
        String word = "";
        try {
            Path src = Paths.get("assets/" + copyFrom);
            List<String> content = Files.readAllLines(src);
            for (String line : content) {
                String[] words = line.split(" ");
                for (int i = 0; i < words.length; i++) {
                    for (int j = 0; j < words[i].length(); j = j + 2) {
                        s = s + words[i].charAt(j);
                    }
                    word = word + " " + s;
                    s = "";
                }
                word += "\n";
            }
            list.add(word);

            Files.write(Paths.get(decrypted), list);

        } catch (IOException e) {
            System.out.println("Could not open file: duplicated-chats.txt");
        }
    }
}
