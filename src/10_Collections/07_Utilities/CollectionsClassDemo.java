import java.util.ArrayList;
import java.util.Collections;

public class CollectionsClassDemo {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(50);
        numbers.add(10);
        numbers.add(30);
        numbers.add(20);
        numbers.add(40);

        System.out.println("Original List: " + numbers);

        Collections.sort(numbers);
        System.out.println("Sorted List: " + numbers);

        Collections.reverse(numbers);
        System.out.println("Reversed List: " + numbers);

        Collections.shuffle(numbers);
        System.out.println("Shuffled List: " + numbers);

        int max = Collections.max(numbers);
        int min = Collections.min(numbers);

        System.out.println("Maximum Element: " + max);
        System.out.println("Minimum Element: " + min);

        Collections.swap(numbers, 0, 1);
        System.out.println("After Swapping Index 0 and 1: " + numbers);

        Collections.fill(numbers, 100);
        System.out.println("After Fill: " + numbers);
    }
}