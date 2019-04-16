import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReversedOrder {

    public static void main(String[] args) {
        // Create a method that decrypts reversed-order.txt
        String filename = "reversed-order.txt";
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
            for (int lines = content.size() - 1; lines >= 0; lines--) {
                list.add(content.get(lines));
            }

            Files.write(Paths.get(decrypted), list);

        } catch (IOException e) {
            System.out.println("Could not open file: duplicated-chats.txt");
        }
    }
}
