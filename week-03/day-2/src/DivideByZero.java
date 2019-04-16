// Create a function that takes a number
// divides ten with it,
// and prints the result.
// It should print "fail" if the parameter is 0

public class DivideByZero {
    public static void main(String[] args) {
        divideBy(4.0);
    }

    private static void divideBy(double i) {
        double result;
        try {
            result = 10 / i;
            if (result == Double.POSITIVE_INFINITY ||
                    result == Double.NEGATIVE_INFINITY)
                throw new ArithmeticException();
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Division by zero!");
        }
    }
}

