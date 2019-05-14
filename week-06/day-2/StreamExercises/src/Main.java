import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class Main {

  public static void main(String[] args) {
//    List<Integer> numbers = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);
//    //Exercise1
//    //without a variable
//    numbers.stream().filter(n -> n % 2 == 0).forEach(System.out::println);
//    //storing in a variable
//    List<Integer> evenNumbers = numbers.stream().filter(n -> n % 2 == 0)
//        .collect(Collectors.toList());
//    evenNumbers.forEach(System.out::println);
//
//    //Exercise2
//    //without a variable
//    numbers.stream().filter(n -> n > 0).map(n -> n*n).forEach(System.out::println);
//    //with a variable
//    List<Integer> positiveSquares = numbers.stream().filter(n -> n > 0).map(n->n*n).collect(
//        Collectors.toList());
//    positiveSquares.forEach(System.out::println);

//    //Exercise3
//    List<Integer> numbers3 = Arrays.asList(3, 9, 2, 8, 6, 5);
//    numbers3.stream().filter(n -> n*n > 20).forEach(System.out::println);

    //Exercise4
    List<Integer> numbers4 = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);
    System.out.println(
        numbers4.stream().filter(n -> n % 2 != 0).mapToDouble(n -> n).average().orElse(0.0));
  }
}