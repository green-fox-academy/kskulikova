// Create the usual class wrapper and main method on your own.

// Write a function called `sum` that returns the sum of numbers from zero to the given parameter
public class Sum {
    public static void main(String[] args) {
        System.out.println(sum(10));
    }

    public static int sum(int i) {
        int sum = 0;
        for (int j = 0; j < i + 1; j++) {
            sum += j;
        }
        return sum;
    }
}
