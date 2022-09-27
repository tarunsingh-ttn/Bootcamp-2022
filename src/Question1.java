/*Write a class with FirstName, LastName & age field.
Print Firstname, LastName & age using static block, static method & static variable respectively.
 */
class Person{
    static String FirstName = "Tarun";
    static String LastName="Singh";
    static int age=23;

    static{
        System.out.println("static block :"+FirstName+" "+LastName+age);
    }

    static void printInfo(){
        System.out.println("static method :"+FirstName+""+LastName+age);

    }
}

public class Question1{
    public static void main(String[] args){
        Person obj=new Person();
        Person.printInfo();
    }
}
