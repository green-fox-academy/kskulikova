import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

// Read all data from 'log.txt'.
// Each line represents a log message from a web server
// Write a function that returns an array with the unique IP adresses.
// Write a function that returns the GET / POST request ratio.
public class Logs {
    public static void main(String[] args) {
        String file = "assets/logs.txt";
        System.out.println(uniqueIp(file));
        System.out.printf("%.2f", postRequestRatio(file));
    }

    private static List uniqueIp(String file) {
        List<String> list = new ArrayList<>();
        try {
            Path src = Paths.get(file);
            List<String> content = Files.readAllLines(src);
            for (String line : content) {
                String[] parts = line.split(" ");
                if (!list.contains(parts[8])) {
                    list.add(parts[8].trim());
                }
            }

        } catch (IOException e) {
            System.out.println("Could not open file: logs.txt");
        }

        return list;
    }

    private static double postRequestRatio(String file) {
        double r = 0.0;
        double gets = 0.0;
        double posts = 0.0;

        try {
            Path src = Paths.get(file);
            List<String> content = Files.readAllLines(src);
            for (String line : content) {
                String[] parts = line.split(" ");
                if (parts[11].trim().equals("GET")) {
                    gets += 1;
                }
                if (parts[11].trim().equals("POST")) {
                    posts += 1;
                }
                r = gets / posts;
            }
        } catch (IOException e) {
            System.out.println("Could not open file: logs.txt");
        }
        return r;
    }
}
