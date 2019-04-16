// Write a function that copies the contents of a file into another
// It should take the filenames as parameters
// It should return a boolean that shows if the copy was successful

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CopyFile {
    public static void main(String[] args) {
        String file1 = "copy-from.txt";
        String file2 = "copy-to.txt";
        System.out.println(copyFile(file1, file2));
    }
    private static boolean copyFile(String s1, String s2) {
        boolean success = true;
        try {
            Path src = Paths.get("assets/" + s1);
            Path dest = Paths.get("assets/" + s2);

            List<String> content = Files.readAllLines(src);
            Files.write(dest, content);
        } catch (IOException e) {
            success = false;
        }
        return success;
    }
}
