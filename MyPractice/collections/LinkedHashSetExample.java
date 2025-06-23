package collections;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        LinkedHashSet<String> names = new LinkedHashSet<>();

        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("Alice");  // Duplicate, ignored

        for (String name : names) {
            System.out.println(name);
        }
    }
}
