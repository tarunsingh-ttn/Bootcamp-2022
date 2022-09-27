/*Create a class named Employee with fields firstname,lastname,age and designation.
The class should:

    have all types of constructors to initialize the object
    class should also have setter methods to update a particular field
    Override its toString method to display a meaningful message using all these fields.
*/
class Employee {
    private String firstName;
    private String lastName;
    private int age;
    private String designation;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public Employee(){
        this.firstName="tarun";
        this.lastName="singh";
        this.age=23;
        this.designation="software engineer";
        System.out.println("initialised with no-args constructor");
    }
    public Employee(String firstName, String lastName, int age, String designation) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.designation = designation;
        System.out.println("initialised with paramaterized constructor");
    }

    @Override
    public String toString() {
        return "Employee " + firstName +" is " + age + " years old "+ " and works as a "+designation;
    }
}
public class Question5 {
 public static void main(String[] args){
     Employee emp1=new Employee("tarun","singh",23,"software engineer");
 System.out.println(emp1.toString());
 }
}
