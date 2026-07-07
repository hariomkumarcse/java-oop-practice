import java.util.ArrayList;
import java.util.Collection;

public class CollectionOverview
{
	public static void main(String[] args)
	{
		Collection<String> collection = new ArrayList<>();

		collection.add("Java");
		collection.add("Spring Boot");
		collection.add("SQL");

		System.out.println("Collection: " + collection);

		System.out.println("Size: " + collection.size());

		System.out.println("Contains Java: " + collection.contains("Java"));

		collection.remove("SQL");

		System.out.println("After Remove: " + collection);

		System.out.println("Is Empty: " + collection.isEmpty());
	}
}