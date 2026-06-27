import java.util.ArrayList;
import java.util.List;

public class ListInterfaceDemo
{
	public static void main(String[] args)
	{
		List<String> languages = new ArrayList<>();

		languages.add("Java");
		languages.add("Python");
		languages.add("SQL");

		System.out.println("List: " + languages);

		System.out.println("First Element: " + languages.get(0));

		System.out.println("List Size: " + languages.size());

		System.out.println("Contains Java: " + languages.contains("Java"));
	}
}