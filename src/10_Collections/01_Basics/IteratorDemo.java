import java.util.*;
public class IteratorDemo
{
	public static void main(String[] args)
	{
		Collection<String> collection = new ArrayList<>();
		
		collection.add("First");
		collection.add("Second");
		collection.add("Third");
		collection.add("Fourth");
	
		Iterator<String> itr = collection.iterator();
		String element = null;
		while(itr.hasNext())
		{
			element = itr.next();
			System.out.println(element);
			if(element.equals("Third"))
			{
				itr.remove();
				System.out.println(" (Removed) ");
			}
			System.out.println(" ");
		}
		System.out.println(collection);
	}
}