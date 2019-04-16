import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.Collections;

// Write a function that is able to manipulate a file
// By writing your name into it as a single line
// The file should be named "my-file.txt"
// In case the program is unable to write the file,
// It should print the following error message: "Unable to write file: my-file.txt"

public class WriteSingleLine {
    public static void main(String[] args) {
        String file = "my-file.txt";
        String name = "Ksenia";
        writeName(file, name);
    }

    private static void writeName(String file, String name) {
        try {
            Path src = Paths.get("assets/" + file);
            Files.write(src, Collections.singleton(name));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Unable to write file: my-file.txt");
        }

    }
}
