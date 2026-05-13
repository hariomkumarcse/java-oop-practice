import java.util.TreeSet;
public class TreeSetDemo
{
	public static void main(String[] args)
	{
		TreeSet<String> names = new TreeSet<>();
		
		names.add("Hariom");
		names.add("Ram Kumar");
		names.add("Ankush Bhai");
	
		System.out.println("TreeSet: " + names);
	}
}