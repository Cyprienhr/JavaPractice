// This is the main public class — must match file name
public class ManyClass {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.drive();

        Bike myBike = new Bike();
        myBike.ride();
    }
}

// Another class in same file (not public)
class Car {
    void drive() {
        System.out.println("Car is driving...");
    }
}

// Yet another class in the same file (not public)
class Bike {
    void ride() {
        System.out.println("Bike is riding...");
    }
}
