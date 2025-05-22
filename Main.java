public class Main {
    public static void main(String[] args) {
        int age = 25;

        System.out.println(age > 18 && age < 30); // true (AND)
        System.out.println(age < 18 || age > 60); // false (OR)
        System.out.println(!(age == 25)); // false (NOT)
    }
}
