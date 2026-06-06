import java.util.LinkedHashSet;

public class LinkedHashSetDemo
{
	public static void main(String[] args)
	{
		LinkedHashSet<String> names = new LinkedHashSet<>();
		
		names.add("Hariom");
		names.add("Ram");
		names.add("Ankush");
		names.add("Aman");
		names.add("Shail");

		System.out.println("LinkedHashSet: " + names);
	}
}