//Use ifPresentOrElse, or, orElseThrow Operations with Optional

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

public class Question5 {

    public static void main(String[] args) {
        IntStream oddStream=IntStream.of(3,5,7,9,11,13,17,19);
        oddStream.filter(num->num%2==0).findFirst().ifPresentOrElse(System.out::println,()->System.out.println("no even number in list"));
        List<Integer> integerList= Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        System.out.println(integerList.stream().filter(num -> num > 50).findFirst().or(() -> Optional.of(-1)));
        integerList.stream().filter((num->num>60)).findFirst().orElseThrow();
    }
}
