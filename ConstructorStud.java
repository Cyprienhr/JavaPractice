class Student {
    String name;
    int age;

    // Default constructor
    Student() {
        System.out.println("Default constructor called.");
        name = "Unknown";
        age = 0;
    }

    // Parameterized constructor
    Student(String name, int age) {
        System.out.println("Parameterized constructor called.");
        this.name = name;
        this.age = age;
    }

    // Method to display student information
    void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class ConstructorStud {
    public static void main(String[] args) {
        // Creating a student using default constructor
        Student student1 = new Student();
        student1.displayInfo();

        System.out.println("--------------------------");

        // Creating a student using parameterized constructor
        Student student2 = new Student("Alice", 20);
        student2.displayInfo();
    }
}
