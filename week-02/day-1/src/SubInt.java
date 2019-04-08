import java.util.Arrays;

public class SubInt {
    public static void main(String[] args) {
        //  Create a function that takes a number and an array of integers as a parameter
        //  Returns the indices of the integers in the array of which the first number is a part of
        //  Or returns an empty array if the number is not part of any of the integers in the array

        //  Example:
        System.out.println(subInt(1, new int[]{1, 11, 34, 52, 61}));
        //  should print: `[0, 1, 4]`
        System.out.println(subInt(9, new int[]{1, 11, 34, 52, 61}));
        //  should print: '[]'
    }

    public static String subInt(int a, int[] arr) {
        int k = 0;
        int[] arrFound;
        boolean found = false;

        arrFound = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            found = false;
            while (arr[i] % 10 > 0) {
                if ((arr[i] % 10 == a) && (!found)) {
                    arrFound[k] = i;
                    found = true;
                    k++;
                }

                arr[i] = arr[i] / 10;
            }

        }

        if (k > 0) {
            int[] arrFoundClean = Arrays.copyOfRange(arrFound, 0, k);
            return Arrays.toString(arrFoundClean);
        } else {
            return Arrays.toString(new int[0]);
        }
    }
}
