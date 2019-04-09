//  - How much does Bob pay?
//  - How much does Alice pay?
//  - Who buys more Rice?
//  - Who buys more Potato?
//  - Who buys more different products?
//  - Who buys more products? (piece)


import java.util.HashMap;

public class ShoppingList2 {
    public static void main(String[] args) {
        HashMap<String, Double> prices = new HashMap<>();

        prices.put("Milk", 1.07);
        prices.put("Rice", 1.59);
        prices.put("Eggs", 3.14);
        prices.put("Cheese", 12.60);
        prices.put("Chicken Breasts", 9.40);
        prices.put("Apples", 2.31);
        prices.put("Tomato", 2.58);
        prices.put("Potato", 1.75);
        prices.put("Onion", 1.10);

        HashMap<String, Integer> bob = new HashMap<>();

        bob.put("Milk", 3);
        bob.put("Rice", 2);
        bob.put("Eggs", 2);
        bob.put("Cheese", 1);
        bob.put("Chicken Breasts", 4);
        bob.put("Apples", 1);
        bob.put("Tomato", 2);
        bob.put("Potato", 1);

        HashMap<String, Integer> alice = new HashMap<>();

        alice.put("Rice", 1);
        alice.put("Eggs", 5);
        alice.put("Chicken Breasts", 2);
        alice.put("Apples", 1);
        alice.put("Tomato", 10);

        //how much Bob pays
        int bobAmount = 0;
        double bobPays = 0;
        for (String key : bob.keySet()) {
            bobPays += bob.get(key) * prices.get(key);
            bobAmount += bob.get(key);
        }
        System.out.println("Bob pays " + bobPays);

        //how much Alice pays
        int aliceAmount = 0;
        double alicePays = 0;
        for (String key : alice.keySet()) {
            alicePays += alice.get(key) * prices.get(key);
            aliceAmount += alice.get(key);
        }
        System.out.println("Alice pays " + alicePays);

        if (bob.get("Rice") > alice.get("Rice")) {
            System.out.println("Bob buys more rice");
        } else {
            System.out.println("Alice buys more rice");
        }

        if (!alice.containsKey("Potato") || (bob.get("Potato") > alice.get("Potato"))) {
            System.out.println("Bob buys more potatoes");
        } else {
            System.out.println("Alice buys more potatoes");
        }

        if (bob.size() > alice.size()) {
            System.out.println("Bob buys more different products");
        } else {
            System.out.println("Alice buys more different products");
        }

        if (bobAmount > aliceAmount) {
            System.out.println("Bob buys more products (pieces)");
        } else {
            System.out.println("Alice buys more products (pieces)");
        }

    }
}