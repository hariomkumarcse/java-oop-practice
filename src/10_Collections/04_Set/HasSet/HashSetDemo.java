import java.util.HashSet;

public class HashSetDemo
{
	public static void main(String[] args)
	{
		HashSet<String> names = new HashSet<>();
	
		names.add("Hariom");
		names.add("Ram");
		names.add("Chunuu");
		names.add("Aman");

		System.out.println("HashSet: " + names);
	}
}