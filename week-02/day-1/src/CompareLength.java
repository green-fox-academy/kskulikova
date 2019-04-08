// - Create an array variable named `p1`
//   with the following content: `[1, 2, 3]`
// - Create an array variable named `p2`
//   with the following content: `[4, 5]`
// - Print if `p2` has more elements than `p1`

public class CompareLength {
    public static void main(String[] args) {
        int[] p1;
        int[] p2;

        p1 = new int[]{1, 2, 3};
        p2 = new int[]{4, 5};

        System.out.println(isBigger(p1, p2));
    }

    public static boolean isBigger(int[] first, int[] second) {
        if (second.length > first.length) {
            return true;
        }
        return false;
    }


}


