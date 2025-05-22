public class MainDemo {
    public static void main(String[] args) {
        // Calling a static method (no object needed)
        greet();

        // Calling a static method with parameter
        greetByName("Cyprien");

        // Call a method that returns a value
        int year = getCurrentYear();
        System.out.println("Current Year: " + year);

        // Call overloaded methods
        showDetails();
        showDetails("Kigali");

        // Call method with parameters and return value
        int result = add(5, 10);
        System.out.println("Sum: " + result);

        // Using non-static method (requires an object)
        Helper helper = new Helper();
        helper.sayHi();

        // Using recursion
        int fact = factorial(5);
        System.out.println("Factorial of 5: " + fact);
    }

    // Static method (no return, no parameter)
    public static void greet() {
        System.out.println("Hello from Java!");
    }

    // Static method with parameter
    public static void greetByName(String name) {
        System.out.println("Hello, " + name + "!");
    }

    // Static method with return type
    public static int getCurrentYear() {
        return 2025;
    }

    // Overloaded method 1
    public static void showDetails() {
        System.out.println("Location not provided.");
    }

    // Overloaded method 2
    public static void showDetails(String city) {
        System.out.println("City: " + city);
    }

    // Method with parameters and return
    public static int add(int a, int b) {
        return a + b;
    }

    // Recursive method (calls itself)
    public static int factorial(int n) {
        if (n == 1)
            return 1;
        return n * factorial(n - 1);
    }
}
