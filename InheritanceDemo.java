public class InheritanceDemo {

    // Parent class
    static class Person {
        String name;
        int age;

        void displayInfo() {
            System.out.println("Name: " + name + ", Age: " + age);
        }
    }

    // Child class
    static class Student extends Person {
        String school;

        void displayStudentInfo() {
            displayInfo(); // inherited method
            System.out.println("School: " + school);
        }
    }

    // Main method
    public static void main(String[] args) {
        Student student = new Student();

        // Set values
        student.name = "Alice";
        student.age = 20;
        student.school = "Greenwood High";

        // Display info
        student.displayStudentInfo();
    }
}
