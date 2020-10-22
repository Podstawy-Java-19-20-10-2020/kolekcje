import java.util.ArrayList;
import java.util.List;

public class App4 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        /*list.get(0);

        System.out.println("Dziala dalej !!");*/


        try{
            App4.metoda("abc");
        } catch (NullPointerException e) {
            System.out.println("Polecial blad !!");
        }

        try {
            App4.validate(500);
        } catch (CosSieZepsuloException e) {

        }
    }

    /*public static void metoda(String s) {
        try {
            String duzyString = s.toUpperCase();

            List<String> list = new ArrayList<>();
            list.get(0);

            System.out.println(duzyString);
        } catch (NullPointerException wyjatek) {
            System.out.println("Zepsulo sie !! NullPointerException");
        } catch (IndexOutOfBoundsException wyjatek) {
            System.out.println("Zepsulo sie !! IndexOutOfBoundsException");
        }
    }*/

    public static void metoda(String s) throws NullPointerException {
        String duzyString = s.toUpperCase();
        System.out.println(duzyString);
    }

    public static void validate(int a) throws CosSieZepsuloException {
        if(a < 10 || a > 100) {
            throw new CosSieZepsuloException();
        }
    }
}
