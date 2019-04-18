import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;


public class Lottery {
    public static void main(String[] args) {
        String filename = "lottery.csv";
        findMostCommonNumbers(5, filename);

    }

    public static void findMostCommonNumbers(int howMany, String filename) {

        try {

            Path src = Paths.get("assets/" + filename);
            List<String> content = Files.readAllLines(src);
            List<String> numbers = new ArrayList<>();

            for (String line : content) {
                String[] components = line.split(";");
                for (String component : components) {
                    if (!component.trim().equals("0") && !component.trim().equals("")) {
                        if (component.trim().length() <= 2) {
                            numbers.add(component.trim());
                        }
                    }
                }
            }

            HashMap<String, Integer> numbersMap = new HashMap();

            for (String number : numbers) {

                if (numbersMap.containsKey(number)) {
                    numbersMap.put(number, (numbersMap.get(number)) + 1);
                } else {
                    numbersMap.put(number, 1);
                }
            }

            List<Map.Entry<String, Integer>> sorted = new ArrayList<>(numbersMap.entrySet());
            sorted.sort(Map.Entry.comparingByValue());

            System.out.println("map after sorting by values: " + sorted);


        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
