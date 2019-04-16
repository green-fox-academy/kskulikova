import java.util.Arrays;

public class PalindromeSearcher {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(palindromeSearcher("dog goat dad duck doodle never")));
        System.out.println(Arrays.toString(palindromeSearcher("1234567890987654321")));
    }

    private static String[] palindromeSearcher(String s) {
        boolean found;
        String[] palindromes = new String[1];
        int palindromesCount = 0;

        for (int i = 0; i < s.length() - 1; i++) {
            for (int j = s.length() - 1; j > i; j--) {

                int start = i;
                int end = j;
                found = true;

                while (start < end) {
                    if (s.charAt(start) != s.charAt(end)) {
                        found = false;
                        break;
                    } else {
                        start += 1;
                        end -= 1;
                    }
                }

                if (found) {
                    String palindrome = s.substring(i, j + 1);
                    palindromes[palindromesCount] = palindrome;
                    palindromesCount += 1;

                    if (palindromes.length == palindromesCount) {
                        palindromes = Arrays.copyOf(palindromes, palindromesCount * 2);
                    }
                }
            }
        }

        String[] clean = new String[palindromesCount];
        int longPalindromesCount = 0;
        for (int i = 0; i < palindromes.length; i++) {
            String palindrome = palindromes[i];
            if (palindrome != null && palindrome.length() > 2) {
                clean[longPalindromesCount] = palindrome;
                longPalindromesCount += 1;
            }
        }

        return Arrays.copyOfRange(clean, 0, longPalindromesCount);
    }
}
