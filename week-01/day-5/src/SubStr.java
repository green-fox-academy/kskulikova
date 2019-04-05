import java.util.Scanner;

public class SubStr {
    public static void main(String[] args) {
        //  Create a function that takes two strings as a parameter
        //  Returns the starting index where the second one is starting in the first one
        //  Returns `-1` if the second string is not in the first one

        //  Example:

        //  should print: `17`
        System.out.println(subStr("this is what I'm searching in", "searching"));

        //  should print: `-1`
        System.out.println(subStr("this is what I'm searching in", "not"));
    }

    public static int subStr(String input, String q) {

        int lenInput = input.length();
        int lenSearch = q.length();

        for (int i = 0; i < lenInput - (lenSearch - 1); i++) { //go through the characters in search string
            for (int j = 0; j < lenSearch; j++) { //for every i-th char of input, search forall chars of q
                if (input.charAt(i + j) == q.charAt(j)){
                    if (j == lenSearch - 1) { // if the whole q string is found, return i
                        return i;
                    }
                } else {
                    break;
                }
            }
        }
        return -1;
    }
}