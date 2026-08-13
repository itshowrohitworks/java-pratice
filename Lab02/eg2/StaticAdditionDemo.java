// class Addition:
class Addition{

    // Static Data Members:
    static int num1 = 20;
    static int num2 = 30;

    // Static Method:
    static void add(){
        int sum = num1 + num2;

        System.out.println("First Number: " + num1);
        System.out.println("Second Number: " + num2);
        System.out.println("Sum = " + sum);
    }
}


public class StaticAdditionDemo {
    
    public static void main(String[] args) {
        
        Addition.add();

    }

}
