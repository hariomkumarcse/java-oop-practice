import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIteration
{
	public static void main(String[] args)
	{
		ArrayList<String> list = new ArrayList<>();

		list.add("Java");
		list.add("Spring");
		list.add("SQL");

		System.out.println("Using For Loop");

		for(int i = 0; i < list.size(); i++)
		{
			System.out.println(list.get(i));
		}

		System.out.println("\nUsing Enhanced For Loop");

		for(String value : list)
		{
			System.out.println(value);
		}
		System.out.println("\nUsing Iterator");

		Iterator<String> iterator = list.iterator();

		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
	}
}