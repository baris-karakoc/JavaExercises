import java.util.ArrayList;
import java.util.List;

public class ArrayList1 {
    public static void main(String[] args) {
        List<String> listString = new ArrayList<String>();
        listString.add("Red");
        listString.add("Green");
        listString.add("Orange");
        listString.add("White");
        listString.add("Black");
        for (String element : listString) {
            System.out.println(element);
        }

        listString.remove(2);
        System.out.println("After removing third element from the list: " + listString);
    }
}
