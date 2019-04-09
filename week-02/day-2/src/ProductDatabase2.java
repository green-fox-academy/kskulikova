//Which products cost less than 201? (just the name)
//Which products cost more than 150? (name + price)

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ProductDatabase2 {
    public static void main(String[] args) {
        HashMap<String, Integer> database = new ProductDatabaseFactory().getProductDatabase();

        List<String> items = new ArrayList<>();
        HashMap<String, Integer> itemsMap = new HashMap<>();

        for (String key : database.keySet()) {
            if (database.get(key) < 201) {
                items.add(key);
            }
            if (database.get(key) > 150) {
                itemsMap.put(key, database.get(key));
            }
        }
        System.out.println(items);
        System.out.println(itemsMap);
    }
}
