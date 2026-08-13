// Parent Class: Employee
class Employee{
    public void work(){
        System.out.println("Employee is Working.");
    }
}

// Child Class 1: Manager
class Manager extends Employee{

    @Override
    public void work(){
        System.out.println("Manager is managing the team.");
    }
}

// Child Class 2: Developer
class Developer extends Employee{

    @Override
    public void work(){
        System.out.println("Developer is writing code.");
    }
}

// Parent Class: Vehicle
class Vehicle{
    public void start(){
        System.out.println("Vehicle is starting.");
    }
}

// Child Class 1: Car
class Car extends Vehicle{
    public void start(){
        System.out.println("Car starts with a key or push button.");
    }
}

// Chile Class 2: Bike
class Bike extends Vehicle{
    public void start(){
        System.out.println("Bike starts with a self-start or kick. ");
    }
}


// Main Class: Testing

public class InhPoly {
    public static void main(String[] args) {
        System.out.println("---- Employee Hierarchy -----");

        Employee eA = new Employee();
        Employee eB = new Manager();
        Employee eC = new Developer();

        eA.work();
        eB.work();
        eC.work();

        System.out.println("\n---- Vehicle Hierarchy ----");

        Vehicle vA = new Vehicle();
        Vehicle vB = new Car();
        Vehicle vC = new Bike();

        vA.start();
        vB.start();
        vC.start();
    }
}