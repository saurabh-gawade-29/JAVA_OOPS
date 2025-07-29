package JavaArrayList;
import java.util.HashSet;

public class JHashSet {
    public static void main(String[] args) {
        HashSet recipe = new HashSet<String>();
        recipe.add("Tomato");
        recipe.add("Bhindi");
        recipe.add("Tomato"); // duplicate value remove automatically
        System.out.println(recipe);
    }
}
