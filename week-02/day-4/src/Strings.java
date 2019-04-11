//Given a string, compute recursively (no loops) a new string where all the lowercase 'x' chars have been changed to 'y' chars.

public class Strings {
    public static void main(String[] args) {
        String s = "Hexadecimals are exciting";
        System.out.println(stringY(s, s.length()));
    }

    public static String stringY(String s, int i) {
        if (i == 0) {
            return s;
        }
        if (s.charAt(i - 1) == 'x') {
            s = s.replace('x', 'y');
        }
        s = stringY(s, i - 1);
        return s;
    }

}

