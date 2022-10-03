// Q5)Implement multiple inheritance with default method inside interface.

interface parentA{
    default  void printInfoA(){
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
public class Q5 implements parentB,parentA,parentC{
//    @Override
//    public void printInfoA() {
//        parentA.super.printInfoA();
//    }
//
//    @Override
//    public void printInfoB() {
//        parentB.super.printInfoB();
//    }
//
//    @Override
//    public void printInfoC() {
//        parentC.super.printInfoC();
//    }

    public static void main(String[] args) {
               Q5 obj =new Q5();
               obj.printInfoA();
               obj.printInfoB();
               obj.printInfoC();

    }
}

