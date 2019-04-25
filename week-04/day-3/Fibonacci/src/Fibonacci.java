import java.util.ArrayList;
import java.util.List;

class Fibonacci {

  int result;

  int fibonacci(int n) {
    List<Integer> fibonacci = new ArrayList<>();

    if (n == 1 || n == 0) {
      return n;
    }
    return fibonacci(n - 1) + fibonacci(n - 2);
  }

}

