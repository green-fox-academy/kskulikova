//We are going to represent a shopping list in a list containing strings.
//
//Create a list with the following items.
//Eggs, milk, fish, apples, bread and chicken
//Create an application which solves the following problems.
//Do we have milk on the list?
//Do we have bananas on the list?

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShoppingList {
    public static void main(String[] args) {
        List<String> shoppingList = new ArrayList<>();
        List<String> items = new ArrayList<>(Arrays.asList("eggs", "milk", "fish", "apples", "bread", "chicken"));
        shoppingList.addAll(items);

        if (shoppingList.contains("milk")){
            System.out.println("Milk is on the list");
        } else{
            System.out.println("Milk is not on the list");
        }

        if (shoppingList.contains("bananas")){
            System.out.println("Bananas are on the list");
        } else{
            System.out.println("Bananas are not on the list");
        }


    }
}
