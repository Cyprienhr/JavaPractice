package Exeptional;

public class ExceptionExample {
    public static void main(String[] args) {
        try {
            int a = 10;
            char b = 0;
            int result = a / b;  
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } finally {
            System.out.println("This block runs no matter what.");
        }
    }
}

