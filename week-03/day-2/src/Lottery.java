import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Lottery {
    public static void main(String[] args) {
        String filename = "lottery.csv";
        findMostCommonNumbers(5, filename);

    }

    public static void findMostCommonNumbers(int howMany, String filename) {

        try {

            Path src = Paths.get("assets/" + filename);
            List<String> content = Files.readAllLines(src);
            List<String > numbers = new ArrayList<>();

            for (String line : content) {
                String[] components = line.split(";");
                for (String component : components) {
                    if(component.length() <= 2){
                        numbers.add(component);
                    }
                }
            }

            List<String> uniqueNumbers = new ArrayList<String>(new HashSet<String>(numbers));
            System.out.println(uniqueNumbers);


        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
