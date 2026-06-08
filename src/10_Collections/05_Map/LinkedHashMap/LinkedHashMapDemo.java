import java.util.*;
public class LinkedHashMapDemo
{
	public static void main(String[] args)
	{
		LinkedHashMap<String, Integer> marks = new LinkedHashMap<>();
	
		marks.put("Vikas",78);
		marks.put("Surbhi",75);
		marks.put("Vinay",81);
		marks.put("Arpit",71);

		marks.put(null,58);
		marks.put("Samar",null);
		marks.put(null,63);
		marks.put("Durgesh",null);

		Set<Map.Entry<String,Integer>> entrySet = marks.entrySet();
		for(Map.Entry<String,Integer> entry : entrySet)
		{
			System.out.println("Name: " + entry.getKey());
			System.out.println(" -- Marks: " + entry.getValue());
		}
	}
}