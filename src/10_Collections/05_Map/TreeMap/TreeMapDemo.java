import java.util.*;

public class TreeMapDemo
{
	public static void main(String[] args)
	{
		TreeMap<String, Integer> marks = new TreeMap<>();

		marks.put("Vikas", 78);
		marks.put("Surbhi",75);
		marks.put("Vinay",81);
		marks.put("Arpit",71);

		marks.put("Samar",null);
		
		Set<Map.Entry<String,Integer>> entrySet = marks.entrySet();
		for(Map.Entry<String,Integer> entry : entrySet)
		{
			System.out.println("Name: " + entry.getKey());
			System.out.println(" --Marks: " + entry.getValue());
		}
	}
}