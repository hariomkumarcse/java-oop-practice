import java.util.Hashtable;
import java.util.Set;

public class HashtableDemo
{
	public static void main(String[] args)
	{
		Hashtable<String, Integer> marks = new Hashtable<>();

		marks.put("Vikas", 78);
		marks.put("Surbhi", 75);
		marks.put("Vinay",81);
		marks.put("Arpit",71);

		Set<String> keys = marks.keySet();
		for(String key: keys)
		{
			System.out.println("Name: "+key);
			System.out.println(" -- Marks: "+marks.get(key));
		}
	}
}