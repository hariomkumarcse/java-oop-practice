import java.util.HashMap;
import java.util.Map;
	
public class MapMain
{
	public static void main(String[] args)
	{
		HashMap<Integer, String> mapStudents = new HashMap<>();

		mapStudents.put(0074, "Happy Tiwari");
		mapStudents.put(0075, "Hariom Kumar");
		mapStudents.put(0031, "Ankush Raj");
		mapStudents.put(0150, "Ram Kumar");
		
		//Iterating using entrySet()
		for(Map.Entry<Integer,String> entry : mapStudents.entrySet())
		{
			System.out.println("Key (Roll No): " + entry.getKey() + ", Value (Name): " + entry.getValue());
		}
	}
}