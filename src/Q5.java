// Q5)Implement multiple inheritance with default method inside interface.

interface parentA{
    default void printInfoA(){
        System.out.println("Hi i am parent A");
    }
}

interface parentB {

    default void printInfoB(){
//        parentA.super.printInfo();s
        System.out.println("Hi i am parent B");
    }
}
interface parentC {
    default void printInfoC(){
//        parentB.super.printInfo();
        System.out.println("Hi i am parent C");
    }
}
public class Q5 implements parentC , parentA ,parentB {
    public static void main(String[] args) {

    }
}

