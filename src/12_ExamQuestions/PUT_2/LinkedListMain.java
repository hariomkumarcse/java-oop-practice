import java.util.LinkedList;
public class LinkedListMain
{
	public static void main(String[] args)
	{
		LinkedList<String> cities = new LinkedList<>();
		
		cities.add("Meerut");
		cities.add("Delhi");
		
		System.out.println(cities);
		
		cities.addFirst("Varanasi");
		cities.addLast("Delhi");
		
		System.out.println(cities);
		System.out.println(cities.get(0));
		System.out.println(cities.remove());
		System.out.println(cities);
	}
}