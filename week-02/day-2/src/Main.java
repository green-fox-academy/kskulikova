import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        String suchWord = "WowWow";
        String suchOtherWord = "Yeay";

        if(suchWord.equals(suchOtherWord)) {
            System.out.println("the two strings are equal");
        }

        if(suchWord.endsWith("wow")) {
            System.out.println("it ends with wow");
        }

        System.out.println(suchOtherWord.compareTo(suchWord));

        ArrayList<String> listOfWords = new ArrayList<>();

        listOfWords.add("such");
        listOfWords.add("such");
        listOfWords.add("such");
        listOfWords.add("such");

        List<String> stringList = Arrays.asList("a", "b", "c", "d");
        HashMap<String, String> suchHashMap = new HashMap<>();

        suchHashMap.put("Mickey", "Mouse");
        suchHashMap.put("Donald", "Duck");
        suchHashMap.put("Dasey", "Duck");
        suchHashMap.put("Donald", "Trump");

        System.out.println(suchHashMap.get("Donald"));

    }


}
