import java.util.HashMap;

public class Map1 {
    public static void main(String[] args) {
        HashMap<Integer, String> myHashMap = new HashMap<>(); // create an empty hm with integers as keys and strings as values
        System.out.println(myHashMap.isEmpty()); // print out if hm is empty or not

        myHashMap.put(97, "a");
        myHashMap.put(98, "b");
        myHashMap.put(99, "c");
        myHashMap.put(65, "A");
        myHashMap.put(66, "B");
        myHashMap.put(67, "C");

        for (int key : myHashMap.keySet()) {  // print out all the keys in a map
            System.out.println(key);
        }

        for (String value : myHashMap.values()) {  // print out all the values in a map
            System.out.println(value);
        }

        myHashMap.put(78, "D"); // add an element

        System.out.println(myHashMap.size()); //print how many key-value pairs are in a map
        System.out.println(myHashMap.get(99));

        myHashMap.remove(97); //remove an element with key value 97
        System.out.println(myHashMap.containsKey(100)); //print if the map contains any value associated with a key 100

        myHashMap.clear();// remove all the key-value pairs
        System.out.println(myHashMap);// print an empty hm
    }
}
