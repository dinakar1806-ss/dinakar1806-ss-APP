class Vehicle {
    int vehicleNumber;
    String brand;
    double speed;

    Vehicle(int vehicleNumber, String brand, double speed) {
        this.vehicleNumber = vehicleNumber;
        this.brand = brand;
        this.speed = speed;
    }

    void displayDetails() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed);
    }
}

class Car extends Vehicle {
    int numberOfDoors;

    Car(int vehicleNumber, String brand, double speed, int numberOfDoors) {
        super(vehicleNumber, brand, speed);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Number of Doors: " + numberOfDoors);
    }
}

class Bike extends Vehicle {
    boolean hasGear;

    Bike(int vehicleNumber, String brand, double speed, boolean hasGear) {
        super(vehicleNumber, brand, speed);
        this.hasGear = hasGear;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Has Gear: " + hasGear);
    }
}

public class Main1 {
    public static void main(String[] args) {

        Vehicle v;

        v = new Car(101, "Toyota", 120, 4);
        v.displayDetails();

        System.out.println();

        v = new Bike(102, "Yamaha", 100, true);
        v.displayDetails();
    }
}