public class PalindromeBuilder {
    public static void main(String[] args) {
        palindrome("GreenFox");
    }

    private static void palindrome(String s) {
        char[] arr = s.toCharArray();
        int n = arr.length;

        char[] b = new char[n];
        int j = n;
        for (char c : arr) {
            b[j - 1] = c;
            j = j - 1;
        }

        for (char c : arr) {
            System.out.println(c);
        }
        for (int k = 0; k < n; k++) {
            System.out.println(b[k]);
        }

    }
}

