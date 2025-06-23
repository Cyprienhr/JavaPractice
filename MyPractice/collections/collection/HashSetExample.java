package collections.collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> fruits = new HashSet<>();

        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Apple"); // duplicate, will be ignored

        System.out.println("Fruits: " + fruits);  // Order not guaranteed

         LinkedHashSet<String> countries = new LinkedHashSet<>();

        countries.add("Rwanda");
        countries.add("Kenya");
        countries.add("Tanzania");
        countries.add("Rwanda");  // ignored

        System.out.println("Countries: " + countries); // Preserves insertion order

        TreeSet<Integer> numbers = new TreeSet<>();

        numbers.add(4);
        numbers.add(2);
        numbers.add(1);
        numbers.add(5);  // ignored

        System.out.println("Numbers: " + numbers);  // Sorted: [1, 3, 5]

        for (String item : fruits) {
            System.out.println(item);
        }
        System.out.println("Total fruits: " + fruits.size());
        for (String item : countries) {
            System.out.println(item);
        }
        System.out.println("Total countries: " + countries.size());
        for (int item : numbers) {
            System.out.println(item);
        }
        System.out.println("Total numbers: " + numbers.size());

    }
}
