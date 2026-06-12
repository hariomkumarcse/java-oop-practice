import java.util.*;

public class SortingDemo02
{
	public static void main(String[] args)
	{
		List<String> names = new ArrayList<>();

		names.add("Ravi");
		names.add("Sai");
		names.add("Samarth");

		System.out.println("Unsorted:" + names);
		Collections.sort(names, new Comparator<String>()
		{
			@Override
			public int compare(String str1, String str2)
			{
				return str1.length() - str2.length();
			}
		});
		System.out.println("Sorted: " + names);
	}
}