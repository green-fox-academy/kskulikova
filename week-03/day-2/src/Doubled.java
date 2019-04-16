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
        StringBuilder s = new StringBuilder();
        StringBuilder word = new StringBuilder();

        try {
            Path src = Paths.get("assets/" + copyFrom);
            List<String> content = Files.readAllLines(src);
            for (String line : content) {
                String[] words = line.split(" ");
                for (String value : words) {
                    for (int j = 0; j < value.length(); j = j + 2) {
                        s.append(value.charAt(j));
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
