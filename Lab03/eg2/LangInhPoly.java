// Parent Class: Language
class Language{

    public void displayInfo(){
        System.out.println("Common English Language");
    }
}

// Child Class: Java
class Java extends Language{

    @Override
    public void displayInfo(){
        System.out.println("Java Programming Language");
    }
}


public class LangInhPoly {
    public static void main(String[] args) {
        Language l1 = new Language();
        l1.displayInfo();

        Language j1 = new Java();
        j1.displayInfo();
        
    }
}
