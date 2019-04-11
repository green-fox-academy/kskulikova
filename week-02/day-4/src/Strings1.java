public class Strings1 {
    public static void main(String[] args) {
        String s = "Hexadecimals are exciting";
        System.out.println(stringNoX(s, s.length()));
    }

    public static String stringNoX(String s, int i) {
        if (i == 0) {
            return s;
        }
        if (s.charAt(i - 1) == 'x') {
            s = s.substring(0, i - 1) + s.substring(i);
        }
        s = stringNoX(s, i - 1);
        return s;
    }

}
