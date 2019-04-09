//Create a list ('List A') which contains the following values
//        Apple, Avocado, Blueberries, Durian, Lychee
//        Create a new list ('List B') with the values of List A
//        Print out whether List A contains Durian or not
//        Remove Durian from List B
//        Add Kiwifruit to List A after the 4th element
//        Compare the size of List A and List B
//        Get the index of Avocado from List A
//        Get the index of Durian from List B
//        Add Passion Fruit and Pummelo to List B in a single statement
//        Print out the 3rd element from List A

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lists2 {
    public static void main(String[] args) {
        List<String> listA = new ArrayList<>();
        listA.add("Apple");
        listA.add("Avocado");
        listA.add("Blueberries");
        listA.add("Durian");
        listA.add("Lychee");

        List<String> listB = new ArrayList<>(listA);

        System.out.println(listA.contains("Durian"));
        listB.remove("Durian");

        listA.add(4, "Kiwifruit");

        System.out.println(listA.size() == listB.size());

        System.out.println(listA.indexOf("Avocado"));

        System.out.println(listB.indexOf("Durian"));

        List<String> toAdd = new ArrayList<>(Arrays.asList("Passion Fruit", "Pummelo"));
        listB.addAll(toAdd); // add Passion Fruit and Pummelo to List B in a single statement

        System.out.println(listA.get(2)); // print out the 3rd element from List A

    }
}
