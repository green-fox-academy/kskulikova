import static java.util.stream.Collectors.toMap;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map.Entry;


public class Main {

  public static void main(String[] args) {
    String filename = "wiki.txt";
    find100MostCommonWords(filename);
  }

  static void find100MostCommonWords(String filename) {
    try {
      Files.lines(Paths.get("assets/" + filename)).
          map(line -> line.split("\\s")).
          flatMap(Arrays::stream)
          .collect(toMap(
              s -> s,
              s -> 1,
              Integer::sum)).entrySet().stream()
          .sorted(Collections.reverseOrder(Entry.comparingByValue()))
          .map(x -> String.format("%s %d", x.getKey(), x.getValue())).limit(100)
          .forEach(System.out::println);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
