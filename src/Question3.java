import java.util.stream.IntStream;

// Use rangeClosed to create a  Stream
public class Question3 {
    public static void main(String[] args) {
        IntStream.rangeClosed(10,90).filter(num->num%2==0).forEach(System.out::println);
    }
}
