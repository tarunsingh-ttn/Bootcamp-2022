import java.util.Arrays;
import java.util.List;

// Convert an Optional type into Stream
public class Question6 {
    public static void main(String[] args) {
        List<Integer> integerList= Arrays.asList(5,6,7,8,9,4,5,6,1,2,3);
        integerList.stream().filter(num -> num > 1).findFirst().stream().forEach(System.out::println);
    }
}
