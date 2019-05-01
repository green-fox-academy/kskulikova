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

  public static String findMostCommonNumbers(int howMany, String filename) {
    List<String> list = new ArrayList<>();

    try {

      Path src = Paths.get("assets/" + filename);
      List<String> content = Files.readAllLines(src);
      List<String> numbers = new ArrayList<>();

      for (String line : content) {
        String[] components = line.split(";");
        for (int i = 11; i < 16; i++) {
          numbers.add(components[i]);
        }
      }

      HashMap<String, Integer> numbersMap = new HashMap<>();

      for (String number : numbers) {

        if (numbersMap.containsKey(number)) {
          numbersMap.put(number, (numbersMap.get(number)) + 1);
        } else {
          numbersMap.put(number, 1);
        }
      }

      System.out.println(numbersMap.get("1"));

      List<Map.Entry<String, Integer>> sorted = new ArrayList<>(numbersMap.entrySet());
      sorted.sort(Map.Entry.comparingByValue());

      int i;
      int j = sorted.size() - 1;

      for (i = sorted.size() - 1; i > sorted.size() - howMany; i--) {
        while (sorted.get(i).getValue().equals(sorted.get(j).getValue())) {
          list.add(sorted.get(j).getKey());
          j--;
        }
      }
      

    } catch (IOException e) {
      e.printStackTrace();
    }

    StringBuilder finalList = new StringBuilder();
    for (String s : list) {
      finalList.append(s).append(" ");
    }
    return finalList.toString();

  }

}
