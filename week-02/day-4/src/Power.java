//Given base and n that are both 1 or more,
// compute recursively (no loops) the value of base to the n power, so powerN(3, 2) is 9 (3 squared).

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {

        System.out.println(powerN(2, 4));

    }

    public static int powerN(int n, int power) {

        if (power == 1) {
            return n;
        }
        n = n * powerN(n, power - 1);
        return n;
    }

}
