
import java.util.HashMap;
import java.util.Map;

public class Map2 {
    public static void main(String[] args) {
        Map<String, String> myHashMap = Map.of("978-1-60309-452-8", "A Letter to Jo",
                "978-1-60309-459-7", "Lupus",
                "978-1-60309-444-3", "Red Panda and Moon Bear",
                "978-1-60309-461-0", "The Lab");


        for (String key : myHashMap.keySet()) {
            String value = myHashMap.get(key);
            System.out.println(value + " (ISBN: " + key + ")");
        }

        myHashMap = new HashMap<>(myHashMap);
        myHashMap.remove("978-1-60309-444-3"); // Remove the key-value pair with key 978-1-60309-444-3


        for (String key : myHashMap.keySet()) {
            String value = myHashMap.get(key);
            if (value == "The Lab") {
                myHashMap.remove(key);
            }
        }

        myHashMap.put("978-1-60309-450-4", "They Called Us Enemy");
        myHashMap.put("978-1-60309-453-5", "Why Did We Trust Him?");

        System.out.println(myHashMap.containsKey("478-0-61159-424-8"));
        System.out.println(myHashMap.containsKey("978-1-60309-453-5"));

    }
}
