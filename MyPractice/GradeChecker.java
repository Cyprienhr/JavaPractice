import java.util.Scanner;

public class GradeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Loop runs 3 times
        for (int i = 1; i <= 3; i++) {
            System.out.print("Enter marks for student " + i + ": ");
            int marks = scanner.nextInt();

            if (marks >= 90) {
                System.out.println("Grade: A");
            } else if (marks >= 80) {
                System.out.println("Grade: B");
            } else if (marks >= 70) {
                System.out.println("Grade: C");
            } else if (marks >= 60) {
                System.out.println("Grade: D");
            } else {
                System.out.println("Grade: F");
            }

            System.out.println(); // for spacing
        }

        scanner.close();
    }
}
