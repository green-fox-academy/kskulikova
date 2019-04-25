import static org.junit.Assert.*;

import org.junit.Test;

public class FibonacciTest {

  private Fibonacci fibonacci = new Fibonacci();
  private int answer;

  @Test
  public void fibonacciFifth() {

    answer = 5;
    assertEquals(answer, fibonacci.fibonacci(5));

  }

  @Test
  public void fibonacciZero() {

    answer = 0;
    assertEquals(answer, fibonacci.fibonacci(0));

  }

  @Test
  public void fibonacciOne() {

    answer = 1;
    assertEquals(answer, fibonacci.fibonacci(1));

  }

  @Test
  public void fibonacciOneSecond() {

    answer = 1;
    assertEquals(answer, fibonacci.fibonacci(2));

  }

  @Test
  public void fibonacciTwentieth() {

    answer = 6765;
    assertEquals(answer, fibonacci.fibonacci(20));

  }
}