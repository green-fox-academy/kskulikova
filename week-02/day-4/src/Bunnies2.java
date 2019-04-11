//We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies (1, 3, ..) have the normal 2 ears.
// The even bunnies (2, 4, ..) we'll say have 3 ears, because they each have a raised foot.
// Recursively return the number of "ears" in the bunny line 1, 2, ... n (without loops or multiplication).

public class Bunnies2 {
    public static void main(String[] args) {
        System.out.println(bunnyEars(10));
    }

    public static int bunnyEars(int n) {
        if (n == 0) {
            return n;
        }

        if (n % 2 == 0) {
            n = 2 + bunnyEars(n - 1);
        } else {
            n = 3 + bunnyEars(n - 1);
        }

        return n;
    }

}
