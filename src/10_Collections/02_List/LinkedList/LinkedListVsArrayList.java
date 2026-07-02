import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListVsArrayList
{
	public static void main(String[] args)
	{
		ArrayList<String> arrayList = new ArrayList<>();

		arrayList.add("Java");
		arrayList.add("Spring");

		LinkedList<String> linkedList = new LinkedList<>();

		linkedList.add("Java");
		linkedList.add("Spring");

		System.out.println("ArrayList: " + arrayList);
		System.out.println("LinkedList: " + linkedList);

		System.out.println("\nArrayList:");
		System.out.println("- Fast Random Access");
		System.out.println("- Slow Insertion/Deletion");

		System.out.println("\nLinkedList:");
		System.out.println("- Fast Insertion/Deletion");
		System.out.println("- Slow Random Access");
	}
}