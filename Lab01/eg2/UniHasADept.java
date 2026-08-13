// Department Class:
class Department{
    private String departName;

    public Department(String departName){
        this.departName = departName;
    }

    public void displayDepartment(){
        System.out.println("Deparment Name: " + departName);
    }
}


// University Class (Has-A relationship with Department)
class University{
    private String uniName;
    private Department department;

    public University(String uniName,Department department){
        this.uniName = uniName;
        this.department = department;
    }

    public void displayUniversity(){
        System.out.println("University Name: " + uniName);
        department.displayDepartment();
    }

}

// Main Class:
public class UniHasADept {
    public static void main(String[] args) {
        Department department = new Department("Computer Science");
        University university = new University("ABC University", department);

        university.displayUniversity();
    }
}
