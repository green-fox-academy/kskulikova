import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;


public class Lottery {
    public static void main(String[] args) {
        String filename = "lottery.csv";
        System.out.println("5 most common lottery numbers: " + findMostCommonNumbers(5, filename));

    }

    public static String[] findMostCommonNumbers(int howMany, String filename) {
        String [] list = new String[5];

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

            int i = 0;
            for (int mapIndex = sorted.size() - 1; mapIndex == sorted.size() - 5; mapIndex--){
                list[i] = sorted.get(mapIndex).getKey();
            }



        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;

    }

}
