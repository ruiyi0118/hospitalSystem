import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        testFilter();
    }

//    @Test
    public static void testFilter() {
        List<Integer> nums = Arrays.asList(0,1,2,3,4,5,6);
        List<Integer> filters = nums.stream().filter(x -> x%2 == 0).collect(Collectors.toList());
        System.out.println(nums.size());
        System.out.println(filters.size());
    }
}
