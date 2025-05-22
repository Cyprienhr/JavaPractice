import java.util.Scanner;

public class NumberAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int evenCount = 0;
        int oddCount = 0;
        int positiveCount = 0;
        int negativeCount = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter number " + i + ": ");
            int number = scanner.nextInt();

            // Check even or odd
            if (number % 2 == 0) {
                evenCount++;
                System.out.print(number + " is even");
            } else {
                oddCount++;
                System.out.print(number + " is odd");
            }

            // Check positive or negative
            if (number > 0) {
                positiveCount++;
                System.out.println(" and positive");
            } else if (number < 0) {
                negativeCount++;
                System.out.println(" and negative");
            } else {
                System.out.println(" and neither positive nor negative");
            }
        }

        // Print summary
        System.out.println("\nSummary:");
        System.out.println("Even numbers: " + evenCount);
        System.out.println("Odd numbers: " + oddCount);
        System.out.println("Positive numbers: " + positiveCount);
        System.out.println("Negative numbers: " + negativeCount);

        scanner.close();
    }
}
