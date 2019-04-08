// - Create an array variable named `r`
//   with the following content: `[54, 23, 66, 12]`
// - Print the sum of the second and the third element

public class SumElements {
    public static void main(String[] args) {

        int[] r;
        r = new int[]{54, 23, 66, 12};

        System.out.println(sumOfElements(r));
    }

    public static int sumOfElements(int[] arr) {

        return arr[2] + arr[3];
    }
}
