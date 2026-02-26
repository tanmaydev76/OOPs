class Vehicle {
    String brand;
    String fuel;
    int maxSpeed;
    int wheels;

    Vehicle(String brand, String fuel, int maxSpeed, int wheels) {
        this.brand = brand;
        this.fuel = fuel;
        this.maxSpeed = maxSpeed;
        this.wheels = wheels;
    }

    void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Fuel: " + fuel);
        System.out.println("Max Speed: " + maxSpeed);
        System.out.println("Wheels: " + wheels);
    }

    void start() {
        System.out.println("Vehicle Started");
    }

    void stop() {
        System.out.println("Vehicle Stopped");
    }
}

// Manual Vehicle
class ManualVehicle extends Vehicle {

    ManualVehicle(String brand, int maxSpeed, int wheels) {
        super(brand, "None", maxSpeed, wheels);
    }

    void displayInfo() {
        System.out.println("Manual Vehicle Details:");
        super.displayInfo();
    }
}

// Auto Vehicle
class AutoVehicle extends Vehicle {
    int mileage;

    AutoVehicle(String brand, String fuel, int maxSpeed, int wheels, int mileage) {
        super(brand, fuel, maxSpeed, wheels);
        this.mileage = mileage;
    }

    void displayInfo() {
        System.out.println("Auto Vehicle Details:");
        super.displayInfo();
        System.out.println("Mileage: " + mileage);
    }
}

// Bike class
class Bike extends AutoVehicle {

    Bike(String brand, String fuel, int maxSpeed, int mileage) {
        super(brand, fuel, maxSpeed, 2, mileage);
    }

    void displayInfo() {
        System.out.println("Bike Details:");
        super.displayInfo();
    }

    void ride() {
        System.out.println("Riding the bike...");
    }
}

// Car class
class Car extends AutoVehicle {

    Car(String brand, String fuel, int maxSpeed, int mileage) {
        super(brand, fuel, maxSpeed, 4, mileage);
    }

    void displayInfo() {
        System.out.println("Car Details:");
        super.displayInfo();
    }

    void honk() {
        System.out.println("Car is Honking");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        Vehicle v1 = new ManualVehicle("Bicycle", 40, 2);
        Vehicle v2 = new Bike("Yamaha", "Petrol", 180, 45);
        Vehicle v3 = new Car("Honda", "Diesel", 200, 20);

        // Polymorphism
        v1.displayInfo();
        v1.start();
        v1.stop();

        System.out.println();

        v2.displayInfo();
        v2.start();
        v2.stop();

        System.out.println();

        v3.displayInfo();
        v3.start();
        v3.stop();
    }
}
