import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class App {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();

        set.add(1);
        set.add(10);
        set.add(15);
        set.add(6);
        set.add(0);
        set.add(1);

        System.out.println(set.size());

        System.out.println(set);

        for(Integer element : set) {
            if(element > 5) {
                System.out.println(element);
            }
        }
    }
}
