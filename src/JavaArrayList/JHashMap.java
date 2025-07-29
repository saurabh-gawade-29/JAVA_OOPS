package JavaArrayList;
import  java.util.HashMap;

public class JHashMap {
    public static void main(String[] args) {
        HashMap<String, String> cars = new HashMap<String, String>();
        //! key should be unique
        //! duplicate values ares allowed
        cars.put("Tata", "punch"); // last
        cars.put("hero", "tigao"); // second last --> hero check
        cars.put("honda", "tigao"); // third last
        cars.put("hero", "check"); // this key already exist
        System.out.println(cars);
    }
}
