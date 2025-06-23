package collections;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> phoneBook = new HashMap<>();

        // Adding key-value pairs
        phoneBook.put("Alice", 12345);
        phoneBook.put("Bob", 67890);
        phoneBook.put("Charlie", 24680);

        // Retrieving value by key
        System.out.println("Bob's number: " + phoneBook.get("Bob"));

        // Iterating over entries
        for (Map.Entry<String, Integer> entry : phoneBook.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Checking if a key exists
        if (phoneBook.containsKey("Alice")) {
            System.out.println("Alice is in the phone book.");
        }
    }
}

