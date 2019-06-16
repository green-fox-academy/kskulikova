import static java.util.stream.Collectors.toMap;

import java.security.cert.CollectionCertStoreParameters;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

  public static void main(String[] args) {
    List<Fox> foxes = new ArrayList<>();
    foxes.add(new Fox("Alexander", "green", 7));
    foxes.add(new Fox("Simon", "green", 3));
    foxes.add(new Fox("Yuna", "green", 7));
    foxes.add(new Fox("Ksenia", "red", 5));
    foxes.add(new Fox("Tolya", "black", 6));

    foxes.stream().filter(f -> f.getColor().equals("green")).map(Fox::getName)
        .forEach(System.out::println);

    foxes.stream().filter(f -> f.getColor().equals("green")).filter(f -> f.getAge() < 5)
        .map(Fox::getName)
        .forEach(System.out::println);

    Map<String, Integer> frequencies = foxes.stream()
        .collect(toMap(
            Fox::getColor,
            f -> 1,
            Integer::sum));
    System.out.println(frequencies);
  }
}
