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
        try {
            Path src = Paths.get("assets/" + copyFrom);
            List<String> content = Files.readAllLines(src);
            for(String line : content){
                for (int i = 0; i < line.length() - 1;i++){
                if (!(line.charAt(i+1) == line.charAt(i))){
                    list.add(String.valueOf(line.charAt(i)));
                }
                }
                Files.write(Paths.get(decrypted), list);
            }

        } catch (IOException e) {
            System.out.println("Could not open file: duplicated-chats.txt");
        }
    }
}
