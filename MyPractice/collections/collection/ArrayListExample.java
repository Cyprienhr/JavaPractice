package collections.collection;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Apple"); // allows duplicates

        System.out.println("Fruits: " + fruits);
        System.out.println("First fruit: " + fruits.get(0));  // Index-based access

        LinkedList<String> cities = new LinkedList<>();

        cities.add("Kigali");
        cities.add("Nairobi");
        cities.add("Kampala");

        cities.addFirst("Bujumbura");  // LinkedList-specific method

        System.out.println("Cities: " + cities);

        Vector<Integer> numbers = new Vector<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(10); // duplicates allowed

        System.out.println("Numbers: " + numbers);

        for (int i = 0; i < fruits.size(); i++) {
           System.out.println(fruits.get(i));
       }

        // Enhanced for-loop
        for (String fruit : fruits) {
           System.out.println(fruit);
        }

    }
    
}
