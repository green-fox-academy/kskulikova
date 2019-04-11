//Define a recursive fibonacci(n) method that returns the nth fibonacci number,
// with n=0 representing the start of the sequence.

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibonacci(5));
    }

    public static int fibonacci(int n) {

        if (n == 1 || n == 0) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

}

