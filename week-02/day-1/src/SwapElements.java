// - Create an array variable named `abc`
//   with the following content: `["first", "second", "third"]`
// - Swap the first and the third element of `abc`

public class SwapElements {
    public static void main(String[] args) {
        String[] abc;
        abc = new String[]{"first", "second", "third"};

        swap(abc, 0, 2);

        for (String s : abc) {
            System.out.println(s);
        }
    }

    public static String[] swap(String[] s, int i, int j) {
        String temp = s[i];
        s[i] = s[j];
        s[j] = temp;
        return s;
    }

}
