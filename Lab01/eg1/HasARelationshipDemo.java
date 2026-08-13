// Engine class
class Engine {

    // Instance variable
    private String engineType;

    // Constructor
    public Engine(String engineType) {
        this.engineType = engineType;
    }

    // Method to display engine details
    public void displayEngine() {
        System.out.println("Engine Type: " + engineType);
    }

}

// Car class (Has-A relationship with Engine)
class Car {

    // Instance variable
    private String carName;

    // Car contains an Engine object
    private Engine engine;

    // Constructor
    public Car(String carName, Engine engine) {
        this.carName = carName;
        this.engine = engine;
    }

    // Method to display car details
    public void displayCarDetails() {
        System.out.println("Car Name: " + carName);
        engine.displayEngine();
    }

}

// Main class
public class HasARelationshipDemo {

    public static void main(String[] args) {

        Engine engine = new Engine("Petrol Engine");

        Car car = new Car("Toyota Camry", engine);

        car.displayCarDetails();

    }

}