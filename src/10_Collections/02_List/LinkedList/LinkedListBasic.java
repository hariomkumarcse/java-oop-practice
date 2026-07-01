import java.util.LinkedList;

public class LinkedListBasic
{
	public static void main(String[] args)
	{
		LinkedList<String> cities = new LinkedList<>();

		cities.add("Delhi");
		cities.add("Mumbai");
		cities.add("Pune");

		cities.addFirst("Noida");

		cities.addLast("Bangalore");

		System.out.println(cities);
	}
}