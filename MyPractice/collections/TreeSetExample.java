package collections;

import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<String> names = new TreeSet<>();

        names.add("Charlie");
        names.add("Alice");
        names.add("Bob");
        names.add("Alice");  // Duplicate, ignored

        for (String name : names) {
            System.out.println(name);
        }
    }
}

