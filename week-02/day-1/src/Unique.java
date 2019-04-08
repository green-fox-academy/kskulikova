import java.lang.reflect.Array;
import java.util.Arrays;

public class Unique {
    public static void main(String[] args) {
        //  Create a function that takes a list of numbers as a parameter
        //  Returns a list of numbers where every number in the list occurs only once

        //  Example
        System.out.println(unique(new int[]{1, 11, 34, 11, 52, 61, 1, 34}));
        //  should print: `[1, 11, 34, 52, 61]`
    }

    public static String unique(int[] arr) {

        Integer[] uniqueArr = new Integer[arr.length];
        int j = 0;

        for (int i = 0; i < arr.length; i++) {
            boolean test = Arrays.asList(uniqueArr).contains(arr[i]);
            if (!test) {
                uniqueArr[j] = arr[i];
                j++;
            }

        }
        Integer[] uniqueArrClean = Arrays.copyOfRange(uniqueArr, 0, j);
        return Arrays.toString(uniqueArrClean);
    }

}
