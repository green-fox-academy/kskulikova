// - Create an array variable named `aj`
//   with the following content: `[3, 4, 5, 6, 7]`
// - Reverse the order of the elements in `aj`
// - Print the elements of the reversed `aj`

import java.util.Arrays;
import java.util.Collections;

public class ReverseList {

    public static void main(String[] args) {
        Integer[] aj = {3, 4, 5, 6, 7};
        Collections.reverse(Arrays.asList(aj));
        System.out.println(Arrays.asList(aj));
    }
}

