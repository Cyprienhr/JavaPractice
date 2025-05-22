import java.util.Scanner;

public class ScannerNewlineIssue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age (int): ");
        int age = scanner.nextInt(); // User enters: 25

        scanner.nextLine();

        // This line is skipped if we DON'T use scanner.nextLine()
        System.out.print("Enter your full name: ");
        String fullName = scanner.nextLine(); // This will be skipped!


        System.out.println("Age: " + age);
        System.out.println("Full Name: " + fullName);

        scanner.close();
    }
}
