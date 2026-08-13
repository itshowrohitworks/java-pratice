// Class Student
class Student{

    // Static Data Member:
    static String college = "ABC College";

    // Instance Data Member:
    int rollNo;
    String name;

    // Constructor:
    Student(int rollNo,String name){
        this.rollNo = rollNo;
        this.name = name;
    }

    // Static Method:
    static void changeCollege(String newCollege){
        college = newCollege;
    }

    // Instance Method:
    void Display(){
        System.out.println("Roll No.: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("College: " + college);
        System.out.println();
    }

}

public class StaticDemo {

    public static void main(String[] args) {
        
        Student s1 = new Student(101, "Rahul");
        Student s2 = new Student(102, "Priya");

        System.out.println("Before Changing College: ");
        s1.Display();
        s2.Display();

        // Calling Static Method:
        Student.changeCollege("XYZ College");

        System.out.println("After Changing College: ");
        s1.Display();
        s2.Display();
    }
    
}
