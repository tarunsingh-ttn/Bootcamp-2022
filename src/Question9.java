import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Create Unmodifiable List from a Steam
public class Question9 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6);
        list.stream().filter(e->e>1).collect(Collectors.toUnmodifiableList()).add(4);
    }
}
