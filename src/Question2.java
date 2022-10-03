//Perform takeWhile and dropWhile operations on stream

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Question2 {

    public static void main(String[] args) {
        Stream<Integer> takeWhileStream=Stream.of(1,2,3,4,5,6,7,8,9,10);
        takeWhileStream.takeWhile(num->num<5).forEach(System.out::println);
        System.out.println("============================");
        List<Integer> dropWhileListExample= Arrays.asList(10,20,30,40,50,60);
        dropWhileListExample.stream().dropWhile(num->num%10!=0).forEach(System.out::println);

    }
}
