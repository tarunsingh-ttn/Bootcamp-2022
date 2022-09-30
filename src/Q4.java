/*
Q4) WAP using java 8:

    Collect all  even numbers from a list using stream
    Given a list of objects of following class:

           class Employee{
           String fullName;
           Long salary;
           String city;
           }

          Get list of all unique firstNames of employees where their salary is less than 5000 and who live in delhi.
          Note: Full name is concatenation of first name, middle name and last name with single space in between
 */

import java.util.Arrays;
import java.util.stream.Stream;

class Employee{
    String fullName;
    Long salary;
    String city;

    public Employee(String fullName, Long salary, String city) {
        this.fullName = fullName;
        this.salary = salary;
        this.city = city;
    }
}


public class Q4 {
    public static void main(String[] args) {
        Stream<Integer> integerStream = Arrays.asList(1,2,3,4,5,6,7,8,10).stream().filter(e->{return e%2==0;});
        Employee emp1=new Employee("Monkey D Luffy",5000l,"Dressrosa");
        Employee emp2=new Employee("Lelouch D Britania",4500l,"delhi");
        Employee emp3=new Employee("Ragnar thor lothrbrok",3000l,"delhi");
        Employee emp4=new Employee("Steven peter Duckling",7000l,"Dressrosa");
        Employee emp5=new Employee("Monkey D Dragon",400l,"delhi");
        Employee emp7=new Employee("Ace D Dragon",400l,"delhi");
        Employee emp6=new Employee("Gojou david Satoru",12000l,"Dressrosa");

        Stream<Employee> str= Stream.of(emp1,emp2,emp3,emp4,emp5,emp6,emp7);
        str.filter(value->value.)

    }
}
