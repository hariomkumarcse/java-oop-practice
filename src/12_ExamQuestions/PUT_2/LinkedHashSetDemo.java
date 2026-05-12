import java.util.LinkedHashSet;
public class LinkedHashSetDemo
{
	public static void main(String[] args)
	{
		LinkedHashSet<String> names = new LinkedHashSet<>();
	
		names.add("Hariom");
		names.add("Ram Kumar");
		names.add("Ankush Bhai");
		names.add("Sahil Bhai");
		
		System.out.println("LinkedHashSet: " + names);
	}
}