import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);
    //Exercise1
    //without a variable
    numbers.stream().filter(n -> n % 2 == 0).forEach(System.out::println);
    //storing in a variable
    List<Integer> evenNumbers = numbers.stream().filter(n -> n % 2 == 0)
        .collect(Collectors.toList());
    evenNumbers.forEach(System.out::println);

    //Exercise2
    //without a variable
    numbers.stream().filter(n -> n > 0).map(n -> n*n).forEach(System.out::println);
    //with a variable
    List<Integer> positiveSquares = numbers.stream().filter(n -> n > 0).map(n->n*n).collect(
        Collectors.toList());
    positiveSquares.forEach(System.out::println);

  }
}