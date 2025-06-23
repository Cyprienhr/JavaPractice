
class Person {
    public String name;
    public int age;

    public void showPersonInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Student extends Person {
    public String school;

    public void showStudentInfo() {
        showPersonInfo();
        System.out.println("School: " + school);
    }
}

public class InheritanceClass {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Alice";
        s.age = 18;
        s.school = "Sunrise High School";
        s.showStudentInfo();
    }
}