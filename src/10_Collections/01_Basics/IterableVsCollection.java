import java.util.ArrayList;

public class IterableVsCollection
{
	public static void main(String[] args)
	{
		ArrayList<String> courses = new ArrayList<>();

		courses.add("Java");
		courses.add("Spring");
		courses.add("Hibernate");

		System.out.println("Using Enhanced For Loop: ");

		for(String course : courses)
		{
			System.out.println(course);
		}

		System.out.println();

		System.out.println("ArrayList implements Collections.");
		System.out.println("Collection extends Iterable.");
		System.out.println("Because of Iterable, we can use the enhanced for-each loop.");
	}
}