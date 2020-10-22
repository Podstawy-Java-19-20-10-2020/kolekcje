import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App2 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("Key", "Value");

        System.out.println(map.size());

        System.out.println(map.get("Key"));

        map.remove("Key");

        System.out.println(map.size());

        map.put("serwer1", "http://ashkgf");
        map.put("serwer2", "http://ashkgf");
        map.put("timeout", "3000");

        System.out.println(map);

        System.out.println(map.get("serwer1"));

        for(String s : map.values()) {
            App2.map(s);
        }
    }

    public static void map(String val) {
        System.out.println(val);
    }
}
