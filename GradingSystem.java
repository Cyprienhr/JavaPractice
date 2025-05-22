import java.util.Scanner;

public class GradingSystem {

    // Method with no parameters or return value
    public static void showWelcomeMessage() {
        System.out.println("Welcome to the Student Grading System!");
    }

    // Method with parameters and return value
    public static double calculateAverage(int mark1, int mark2, int mark3) {
        return (mark1 + mark2 + mark3) / 3.0;
    }

    // Method with parameter and return value
    public static String determineGrade(double average) {
        if (average >= 90) {
            return "A";
        } else if (average >= 80) {
            return "B";
        } else if (average >= 70) {
            return "C";
        } else if (average >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        showWelcomeMessage(); // no parameter method

        System.out.println("Enter marks for 3 subjects:");

        System.out.print("Math: ");
        int math = scanner.nextInt();

        System.out.print("English: ");
        int english = scanner.nextInt();

        System.out.print("Science: ");
        int science = scanner.nextInt();

        double average = calculateAverage(math, english, science); // method with params and return
        String grade = determineGrade(average); // method with param and return

        System.out.println("Average score: " + average);
        System.out.println("Grade: " + grade);
        
        scanner.close();
    }
    
}
