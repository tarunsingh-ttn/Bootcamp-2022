// Demonstrate the use of private methods in interfaces

interface exampleInterface{
    private static int increamentOperation(int a){
        return a+1;
    }

    static int makeItOdd(int num){
        if(num%2==0){
          return   increamentOperation(num);
        }
       return num;
    }

}
public class question1 implements exampleInterface {

    public static void main(String[] args) {
        System.out.println(exampleInterface.makeItOdd(6));
    }
}
