import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;

public class CollectionFrameworkIntro {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");

        HashSet<String> set = new HashSet<>();
        set.add("Java");
        set.add("Java");   // Duplicate ignored

        HashMap<Integer, String> map = new HashMap<>();
        map.put(101, "Hariom");
        map.put(102, "Rahul");

        System.out.println("List: " + list);
        System.out.println("Set: " + set);
        System.out.println("Map: " + map);
    }
}