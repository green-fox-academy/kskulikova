
class Fibonacci {

  int fibonacci(int n) {

    if (n == 1 || n == 0) {
      return n;
    }
    return fibonacci(n - 1) + fibonacci(n - 2);
  }

}

