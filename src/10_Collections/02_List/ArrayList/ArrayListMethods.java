import java.util.ArrayList;

public class ArrayListMethods
{
	public static void main(String[] args)
	{
		ArrayList<String> courses = new ArrayList<>();

		courses.add("Java");
		courses.add("Spring");
		courses.add("SQL");

		System.out.println("Original: " +courses);

		courses.add(1, "Hibernate");

		System.out.println("After Insert: " + courses);

		courses.set(0, "Core Java");

		System.out.println("After Update: " + courses);

		System.out.println("Contains Spring: " + courses.contains("Spring"));

		System.out.println("Size: " + courses.size());

		System.out.println("Is Empty: " + courses.isEmpty());

		courses.clear();

		System.out.println("After Clear: " + courses);
	}
}