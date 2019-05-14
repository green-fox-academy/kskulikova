import static java.util.stream.Collectors.toMap;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;


public class Main {

  public static void main(String[] args) {

    String filename = "wiki.txt";
    find100MostCommonWords(filename);

  }

  static void find100MostCommonWords(String filename) {
    Path src = Paths.get("assets/" + filename);

    try {
//      System.out.println(Files.lines(Paths.get("assets/" + filename)).
//          map(line -> line.split("\\s")).
//          flatMap(Arrays::stream)
//          .collect(toMap(
//              s -> s,
//              s -> 1,
//              Integer::sum)).entrySet().stream().max(Entry.comparingByValue()).map(Entry::getKey)
//          .orElse(null));

      Files.lines(Paths.get("assets/" + filename)).
          map(line -> line.split("\\s")).
          flatMap(Arrays::stream)
          .collect(toMap(
              s -> s,
              s -> 1,
              Integer::sum)).entrySet().stream()
          .sorted(Collections.reverseOrder(Entry.comparingByValue()))
          .map(Entry::getKey).limit(100).forEach(System.out::println);

//      Files.lines(Paths.get("assets/" + filename)).
//          map(line -> line.split("\\s")).
//          flatMap(Arrays::stream)
//          .collect(toMap(
//              s -> s,
//              s -> 1,
//              Integer::sum)).entrySet().stream()
//          .sorted(Collections.reverseOrder(Entry.comparingByValue())).collect(
//          toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2,
//              LinkedHashMap::new));

    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
