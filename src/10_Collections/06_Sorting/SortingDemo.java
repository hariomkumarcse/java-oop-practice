import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingDemo
{
	public static void main(String[] args)
	{
		List<String> names = new ArryList<>();
		names.add("Ravi");
		names.add("Suresh");
		names.add("Mahesh");

		System.out.println("Unsorted: " +names);
		Collections.sort(names);
		System.out.println("Sorted: " + names);
	}
}