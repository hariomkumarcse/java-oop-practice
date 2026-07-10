import java.util.ArrayList;
import java.util.Iterator;

public class IteratorTest
{
	public static void main(String[] args)
	{
		ArrayList<String> languages = new ArrayList<>();

		languages.add("Java");
		languages.add("Python");
		languages.add("SQL");

		Iterator<String> iterator = languages.iterator();

		while(iterator.hasNext())
		{
			String language = iterator.next();

			System.out.println(language);
		}
	}
}