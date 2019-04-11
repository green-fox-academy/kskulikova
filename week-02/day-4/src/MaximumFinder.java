//Write a function that finds the largest element of an array using recursion.


public class MaximumFinder {
    public static void main(String[] args) {
        int[] arr = {1, 2000, 3, 4987, 5, 6, 119, 66, 345, 20};
        System.out.println(maximumFinder(arr, arr.length));

    }

    private static int maximumFinder(int[] arr, int length) {
        if (length == 1) {
            return arr[length - 1];
        }
        if (arr[length - 1] > arr[length - 2]) {
            arr[length - 2] = arr[length - 1];
        }
        return maximumFinder(arr, length - 1);
    }


}
