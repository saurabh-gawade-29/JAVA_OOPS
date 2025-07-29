import java.lang.reflect.Array;
import java.util.Arrays;

public class Testing {
    public static void main(String[] args) {
        String[] cars1 = {"mustang", "bmw"};
        String[] cars2 = {"mustang", "bmw"};
        int[] num = {1,2,3,4,5};
        System.out.println(cars1 == cars2); // comparison - false
        System.out.println(cars1.getClass().isArray());
        System.out.println(Arrays.equals(cars1, cars2));
    }
}
