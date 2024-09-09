//base class
class Vehicle {
    public void start() {
        System.out.println("Vehicle is starting...");
    }
}
// derived class
class Car extends Vehicle {

    @Override
    public void start() {
        System.out.println("Car is starting with a key...");
    }
}

// Derived class
class Bike extends Vehicle {
    @Override
    public void start() {
        System.out.println("Bike is starting with a button...");
    }
}

public class Implementpolymorphism {
    public static void main(String[] args) {
        Vehicle myCar = new Car();
        Vehicle myBike = new Bike();

        myCar.start();
        myBike.start();
    }
}
