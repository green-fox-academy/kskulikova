
import java.util.HashMap;

class ProductDatabaseFactory {


    HashMap<String, Integer> getProductDatabase() {
        HashMap<String, Integer> database = new HashMap<>();

        database.put("Eggs", 200);
        database.put("Milk", 200);
        database.put("Fish", 400);
        database.put("Apples", 150);
        database.put("Bread", 50);
        database.put("Chicken", 550);

        return database;
    }
}
