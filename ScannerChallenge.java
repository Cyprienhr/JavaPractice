import java.util.Scanner;

public class ScannerChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create Scanner object

        // nextLine() - reads full line
        System.out.print("Enter your full name: ");
        String fullName = scanner.nextLine(); // Important: use nextLine() for full name

        // nextInt() - reads an integer
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        scanner.nextLine();
        // 🔥 Important TIP:
        // Always consume the leftover newline after nextInt(), nextDouble(), etc.
        // Otherwise, nextLine() will read an empty string

        // next() - reads one word (stops at space)
        System.out.print("Enter your favorite word: ");
        String word = scanner.next(); // Only one word

        // nextDouble() - reads decimal number
        System.out.print("Enter your GPA: ");
        double gpa = scanner.nextDouble();

        // nextBoolean() - reads true or false
        System.out.print("Do you love Java? (true/false): ");
        boolean lovesJava = scanner.nextBoolean();

        // 🖨️ Output the result
        System.out.println("\n==== USER PROFILE ====");
        System.out.println("Full Name     : " + fullName);
        System.out.println("Age           : " + age);
        System.out.println("Favorite Word : " + word);
        System.out.println("GPA           : " + gpa);
        System.out.println("Loves Java?   : " + (lovesJava ? "Yes!" : "No 😢"));

        scanner.close(); // Always close the scanner when done
    }
}
