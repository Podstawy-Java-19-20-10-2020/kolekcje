import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> lista = new LinkedList<>();

        System.out.println();
        System.out.println(lista.size());

        lista.add("ABC");

        System.out.println(lista.size());

        lista.add("XYZ");
        lista.add("asdfg");

        System.out.println(lista.size());

        //lista.remove(1);

        System.out.println(lista.size());

        System.out.println(lista);

        lista.remove("asdfg");

        System.out.println(lista);

        System.out.println(lista.get(0));

        jakasMetoda(lista);
        jakasMetoda(lista);
        jakasMetoda(lista);
        jakasMetoda(lista);
        jakasMetoda(lista);
        jakasMetoda2(lista);
        jakasMetoda3(lista);
    }

    public static void jakasMetoda(List list) {
        list.get(0);
        list.add("jsahdgf");
    }

    public static void jakasMetoda2(List linkedList) {
        //
    }

    public static void jakasMetoda3(List linkedList) {
        //
    }
}
