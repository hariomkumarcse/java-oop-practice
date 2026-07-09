import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.HashMap;
import java.util.TreeMap;

public class HierarchyDemo {

    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();

        HashSet<Integer> hashSet = new HashSet<>();
        TreeSet<Integer> treeSet = new TreeSet<>();

        HashMap<Integer, String> hashMap = new HashMap<>();
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        System.out.println("List Implementations:");
        System.out.println(arrayList.getClass().getSimpleName());
        System.out.println(linkedList.getClass().getSimpleName());

        System.out.println("\nSet Implementations:");
        System.out.println(hashSet.getClass().getSimpleName());
        System.out.println(treeSet.getClass().getSimpleName());

        System.out.println("\nMap Implementations:");
        System.out.println(hashMap.getClass().getSimpleName());
        System.out.println(treeMap.getClass().getSimpleName());
    }
}