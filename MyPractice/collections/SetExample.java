package collections;

import java.util.HashSet;

public class SetExample {
    public static void main(String[] args) {
        HashSet<String> names = new HashSet<>();

        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("Alice");  // Duplicate, will not be added

        for (String name : names) {
            System.out.println(name);
        }

        System.out.println("Size: " + names.size());
    }
}
