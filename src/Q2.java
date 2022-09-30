//  Q2) Using (instance) Method reference create and apply add and subtract
//  method and using (Static) Method reference create and apply multiplication method for the functional interface created
class Person{
    void printInfo(int a ){
        System.out.println("Hello this is not static method from person class " + a );
    }
     static void printDetails(int a){
        System.out.println("hello this is a static method from person class  "+a);
    }
}

public class Q2 {
    interface  myReferenceInterface{
        void interfaceMethod(int b);
    }
    public static void main(String[] args) {
            myReferenceInterface ref=Person::printDetails;
            ref.interfaceMethod(5);
            myReferenceInterface ref2= new Person()::printInfo;
            ref2.interfaceMethod(10);
    }
}
