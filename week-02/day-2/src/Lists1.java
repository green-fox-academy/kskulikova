
import java.util.ArrayList;
import java.util.List;

public class Lists1 {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList(); //creates an empty list
        System.out.println(stringList.size()); // prints the size of an empty list

        stringList.add("William"); // adds an element to a list
        System.out.println(stringList.isEmpty()); // prints out whether list is empty

        stringList.add("John"); // adds an element to a list
        stringList.add("Amanda"); // adds an element to a list

        System.out.println(stringList.size()); // prints the size of the list
        System.out.println(stringList.get(2)); // prints the 3rd element of the list

        for(int i = 0; i < stringList.size(); i++){ // prints all elements of the list
            System.out.println(stringList.get(i));
        }

        for(int i = 0; i < stringList.size(); i++){ // prints all elements of the list with their numbers
            System.out.println(i + 1 + ". " + stringList.get(i));
        }
        stringList.remove(1);// removes the 2nd element of the list

        for(int i = stringList.size() - 1; i >= 0; i--){ // prints all elements of the list in a reversed order
            System.out.println(stringList.get(i));
        }

        stringList.clear();// removes all elements
        System.out.println(stringList); // prints an empty list
    }
}
