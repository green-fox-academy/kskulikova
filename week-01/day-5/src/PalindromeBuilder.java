public class PalindromeBuilder {
    public static void main(String[] args) {
        palindrome("GreenFox");
    }

    static void palindrome(String s) {
        char[] arr = s.toCharArray();
        int n = arr.length;

        char [] b = new char[n];
        int j = n;
        for (int i = 0; i < n; i++) {
            b[j - 1] = arr[i];
            j = j - 1;
        }

        for (int k = 0; k < n; k++) {
            System.out.println(arr[k]);
        }
        for (int k = 0; k < n; k++) {
            System.out.println(b[k]);
        }

    }
}

