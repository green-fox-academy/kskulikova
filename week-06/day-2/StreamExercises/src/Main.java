import static java.util.stream.Collectors.toMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);
//    //Exercise1
//    //without a variable
    numbers.stream().filter(n -> n % 2 == 0).forEach(System.out::println);
//    //storing in a variable
    List<Integer> evenNumbers = numbers.stream().filter(n -> n % 2 == 0)
        .collect(Collectors.toList());
    evenNumbers.forEach(System.out::println);

//    //Exercise2
    //without a variable
    numbers.stream().filter(n -> n > 0).map(n -> n * n).forEach(System.out::println);
    //with a variable
    List<Integer> positiveSquares = numbers.stream().filter(n -> n > 0).map(n -> n * n).collect(
        Collectors.toList());
    positiveSquares.forEach(System.out::println);

//    //Exercise3
    List<Integer> numbers3 = Arrays.asList(3, 9, 2, 8, 6, 5);
    numbers3.stream().filter(n -> n * n > 20).forEach(System.out::println);

    //Exercise4
    List<Integer> numbers4 = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);
    System.out.println(
        numbers4.stream().filter(n -> n % 2 != 0).mapToDouble(n -> n).average().orElse(0.0));

    //Exercise5
    List<Integer> numbers5 = Arrays.asList(5, 9, 1, 2, 3, 7, 5, 6, 7, 3, 7, 6, 8, 5, 4, 9, 6, 2);
    System.out.println(
        (Integer) numbers5.stream().filter(n -> n % 2 != 0).mapToInt(Integer::intValue).sum());

    //Exercise6
    String str = "Hello, Friends";
    System.out.println(str.chars().filter(s -> s > 65 && s < 91).mapToObj(i -> (char) i)
        .collect(Collectors.toList()));

    //Exercise7
    List<String> cities = Arrays.asList("ROME", "LONDON", "NAIROBI", "CALIFORNIA", "ZURICH",
        "NEW DELHI", "AMSTERDAM", "ABU DHABI", "PARIS");
    System.out.println(cities.stream().filter(s -> s.startsWith("A")).collect(Collectors.toList()));

    //Exercise8
    List<Character> characters = new ArrayList<>();
    characters.add('l');
    characters.add('u');
    characters.add('n');
    characters.add('c');
    characters.add('h');
    characters.add('t');
    characters.add('i');
    characters.add('m');
    characters.add('e');

    System.out.println(characters);
//
    System.out.println(characters.stream().collect(StringBuilder::new,
        StringBuilder::appendCodePoint, StringBuilder::append)
        .toString());

    //Exercise9
    //Write a Stream Expression to find the frequency of characters in a given string!
    String str1 = "diversion";
    Map<String, Integer> frequencies = str1.chars().boxed()
        .collect(toMap(
            k -> Character.valueOf((char) k.intValue()).toString(),
            v -> 1,
            Integer::sum));
    System.out.println(frequencies);
  }
}