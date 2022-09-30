// Q3)Create a thread using lambda function

public class Q3 {
    public static void main(String[] args) {
        Runnable runnable=()->System.out.print("hello");
        new Thread(runnable).start();

    }
}
