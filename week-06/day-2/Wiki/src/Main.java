import static java.util.stream.Collectors.toMap;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Map.Entry;


public class Main {

  public static void main(String[] args) {

    String filename = "wiki.txt";
    find100MostCommonWords(filename);

  }

  static void find100MostCommonWords(String filename) {
    Path src = Paths.get("assets/" + filename);

    try {
      System.out.println(Files.lines(Paths.get("assets/" + filename)).
          map(line -> line.split("\\s")).
          flatMap(Arrays::stream)
          .collect(toMap(
              s -> s,
              s -> 1,
              Integer::sum)).entrySet().stream().max(Entry.comparingByValue()).map(Entry::getKey)
          .orElse(null));


    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
