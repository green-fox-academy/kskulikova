//How much is the fish?
//What is the most expensive product?
//What is the average price?
//How many products' price is below 300?
//Is there anything we can buy for exactly 125?
//What is the cheapest product?
//
//
//

import java.util.HashMap;
import java.util.Map;

public class ProductDatabase {
    public static void main(String[] args) {
        HashMap<String, Integer> database = new ProductDatabaseFactory().getProductDatabase();

        System.out.println("The fish is " + database.get("Fish"));

        Map.Entry<String, Integer> expensive = null;
        Map.Entry<String, Integer> cheap = null;

        for (Map.Entry<String, Integer> entry : database.entrySet()) {
            if (expensive == null || entry.getValue() > expensive.getValue()) {
                expensive = entry;
            }
        }

        for (Map.Entry<String, Integer> entry : database.entrySet()) {
            if (cheap == null || entry.getValue() < cheap.getValue()) {
                cheap = entry;
            }
        }

        System.out.println(expensive.getKey() + " is the most expensive product");

        int sum = 0;
        int i = 0;
        boolean yes = false;
        String answer = "can't";

        for (String key : database.keySet()) {
            sum += database.get(key);
            if (database.get(key) < 300) {
                i++;
            }
            if (database.get(key) == 125) {
                yes = true;
                answer = "can";
            }
        }
        System.out.println("The average price is " + sum / database.size());
        System.out.println("There are " + i + " products with the price below 300");
        System.out.println("We " + answer + " buy " + (yes ? "something" : "anything") + " for exactly 125");
        System.out.println(cheap.getKey() + " is the cheapest product");
    }

}


