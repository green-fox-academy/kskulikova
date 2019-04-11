//Given a string, compute recursively a new string where all the adjacent chars are now separated by a *

public class Strings2 {
    public static void main(String[] args) {
        String s = "ballpark figure";
        System.out.println(separateChars(s, s.length()));
    }

    public static String separateChars(String s, int i) {
        if (i == 1) {
            return s;
        }
        if (s.charAt(i - 1) != ' ' && s.charAt(i - 2) != ' ') {
            s = s.substring(0, i - 1) + "*" + s.substring(i - 1);
        }
        s = separateChars(s, i - 1);

        return s;
    }

}
