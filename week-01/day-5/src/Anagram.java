import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {

        System.out.println(subStr("dog", "god"));
    }

    private static boolean subStr(String s1, String s2) {
        boolean match;

        if (s1.length() != s2.length()) {
            match = false;
        } else {

            char[] s1Array = s1.toLowerCase().toCharArray(); // create an s1 array
            char[] s2Array = s2.toLowerCase().toCharArray(); // create an s2 array

            Arrays.sort(s1Array);
            Arrays.sort(s2Array);

            //Check if arrays are equal
            match = Arrays.equals(s1Array, s2Array);
        }
        return match;
    }
}
