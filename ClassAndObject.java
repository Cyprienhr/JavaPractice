

// Main.java
public class ClassAndObject {

    public static void main(String[] args) {
        // Create first student
        Student student1 = new Student();
        student1.name = "Alice";
        student1.age = 20;
        student1.gpa = 3.7;

        // Create second student
        Student student2 = new Student();
        student2.name = "Bob";
        student2.age = 22;
        student2.gpa = 3.9;

        // Display info
        student1.displayInfo();
        student2.displayInfo();
    }
}

// Student.java (you can save it separately or place above Main)
class Student {
    // Fields
    String name;
    int age;
    double gpa;

    // Method to display student info
    void displayInfo() {
        System.out.println("Student Profile:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("GPA: " + gpa);
        System.out.println(); // blank line for spacing
    }
}


