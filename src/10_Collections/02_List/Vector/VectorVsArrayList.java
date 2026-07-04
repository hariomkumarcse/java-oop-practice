import java.util.ArrayList;
import java.util.Vector;

public class VectorVsArrayList
{
	public static void main(String[] args)
	{
		ArrayList<Integer> arrayList = new ArrayList<>();
		Vector<Integer> vector = new Vector<>();

		arrayList.add(10);
		vector.add(10);

		System.out.println("ArrayList: " + arrayList);
		System.out.println("Vector: " + vector);

		System.out.println("\nArrayList:");
		System.out.println("- Not Synchronized");
		System.out.println("- Faster");

		System.out.println("\nVector:");
		System.out.println("- Synchronized");
		System.out.println("- Thread Safe");
	}
}