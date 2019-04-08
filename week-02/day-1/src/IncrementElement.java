//- Create an array variable named `t`
//        with the following content: `[1, 2, 3, 4, 5]`
//        - Increment the third element
//        - Print the third element

public class IncrementElement {
    public static void main(String[] args) {
        int[] t;
        t = new int[]{1, 2, 3, 4, 5};

        t[2] += 1;
        System.out.println(t[2]);
    }
}
