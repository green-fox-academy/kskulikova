public class GreatestCommonDivisor {
    public static void main(String[] args) {

        int c = 1;
        System.out.println(greatestCommonDivisor(1015, 231));

    }

    public static int greatestCommonDivisor(int a, int b) {

        {
            if (b != 0)
                return greatestCommonDivisor(b, a % b);
            else
                return a;
        }
    }
}



