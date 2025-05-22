import java.util.Scanner;

public class OperatorExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input from user
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        // Arithmetic operator
        int sum = num1 + num2;
        System.out.println("Sum = " + sum);

        // Comparison operator
        if (num1 > num2) {
            System.out.println("First number is greater.");
        } else if (num1 < num2) {
            System.out.println("Second number is greater.");
        } else {
            System.out.println("Both numbers are equal.");
        }

        // Logical + Arithmetic operator
        if (num1 % 2 == 0 && num2 % 2 == 0) {
            System.out.println("Both numbers are even.");
        } else {
            System.out.println("Both are not even.");
        }

        scanner.close();
    }
}
