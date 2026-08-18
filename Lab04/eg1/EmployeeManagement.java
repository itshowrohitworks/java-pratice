// Interface
interface Printable{

    void printDetails();
}

// Abstract Class
abstract class Employee implements Printable{
    protected int id;
    protected String name;

    //  Constructor
    public Employee(int id,String name){
        this.id = id;
        this.name = name;
    }

    // Abstract Method
    public abstract double calculateSalary();
}

// Derived Class 1
class FullTimeEmployee extends Employee{
    
    private double monthlySalary;

    // Constructor
    public FullTimeEmployee(int id, String name,double monthlySalary){
        super(id,name);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateSalary(){
        return monthlySalary;
    }

    @Override
    public void printDetails(){
        System.out.println("Full-Time Employee");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: $" + calculateSalary());
        System.out.println(); 
    }
}

// Derived Class 2:
class PartTimeEmployee extends Employee{
    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(
        int id,
        String name,
        int hoursWorked,
        double hourlyRate
    ){
        super(id,name);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary(){
        return hoursWorked * hourlyRate;
    }

    @Override
    public void printDetails(){
        System.out.println("Part-Time Employee");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: $"+calculateSalary());
        System.out.println();
    }
}


// Main Class
public class EmployeeManagement{
    public static void main(String[] args) {
        Employee e1 = new FullTimeEmployee(101, "Rahul", 50000);
        Employee e2 = new PartTimeEmployee(102, "Priya", 80,500);
    
        e1.printDetails();
        e2.printDetails();
    }
    
}