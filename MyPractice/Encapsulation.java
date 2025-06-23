class Person {
    // Private field (hidden from outside)
    private String name;

    // Public getter (read access)
    public String getName() {
        return name;
    }

    // Public setter (write access)
    public void setName(String newName) {
        if (newName.length() > 2) {
            name = newName;
        } else {
            System.out.println("Name too short!");
        }
    }
}


public class Encapsulation {
     public static void main(String[] args) {
        Person p = new Person();

        p.setName("Al");
        System.out.println(p.getName());
        p.setName("Alice");
        System.out.println(p.getName());
    }
}
