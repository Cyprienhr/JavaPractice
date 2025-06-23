package collections.collection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, Integer> scores = new HashMap<>();

        scores.put("Alice", 90);
        scores.put("Bob", 85);
        scores.put("Charlie", 88);
        scores.put("Alice", 95);  // Replaces previous value

        System.out.println("Bob's score: " + scores.get("Bob"));
        System.out.println("All entries: " + scores);


        LinkedHashMap<String, String> countries = new LinkedHashMap<>();

        countries.put("KE", "Kenya");
        countries.put("UG", "Uganda");
        countries.put("TZ", "Tanzania");

        System.out.println("Countries: " + countries);

        TreeMap<Integer, String> employees = new TreeMap<>();

        employees.put(103, "John");
        employees.put(101, "Alice");
        employees.put(102, "Bob");

        System.out.println("Sorted Employees: " + employees);

        Hashtable<String, String> table = new Hashtable<>();

        table.put("username", "admin");
        table.put("password", "1234");

        System.out.println("Login Data: " + table);
    }
}
