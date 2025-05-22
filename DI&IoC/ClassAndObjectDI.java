import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class ClassAndObjectDI {

    public static void main(String[] args) {
        SpringApplication.run(ClassAndObjectDI.class, args);
    }

    // CommandLineRunner to run after Spring Boot starts
    @Bean
    public CommandLineRunner run(ApplicationContext ctx) {
        return args -> {
            // Retrieve beans and display info
            Student student1 = ctx.getBean(Student.class, "Alice", 20, 3.7);
            student1.displayInfo();

            Student student2 = ctx.getBean(Student.class, "Bob", 22, 3.9);
            student2.displayInfo();
        };
    }
}

// Student class managed by Spring as a Bean
@Component
class Student {

    private String name;
    private int age;
    private double gpa;

    // Constructor to initialize Student
    public Student(String name, int age, double gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    // Method to display student info
    public void displayInfo() {
        System.out.println("Student Profile:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("GPA: " + gpa);
        System.out.println(); // blank line for spacing
    }
}
