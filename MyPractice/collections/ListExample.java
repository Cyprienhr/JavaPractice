package collections;

import java.util.ArrayList;

public class ListExample {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();

        // Add items
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        // Access items
        System.out.println(fruits.get(1));  // Output: Banana

        // Change item
        fruits.set(1, "Mango");

        // Remove item
        fruits.remove("Orange");

        // Loop through list
        for (int fruit = 0; fruit < fruits.size(); fruit++) {
            System.out.println(fruits.get(fruit));
        }

        // Size of the list
        System.out.println("Total: " + fruits.size());
    }
}

