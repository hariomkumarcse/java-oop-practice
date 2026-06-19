import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo
{
	public static void main(String[] args)
	{
		ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();

		map.put(101, "Java");
		map.put(102, "Sql");
		map.put(103, "Python");
		map.put(104, "Spring");

		System.out.println("Before Update: ");
		System.out.println(map);

		map.putIfAbsent(105, "Hibernate");
		map.replace(104, "Spring Boot");

		System.out.println("After Update: ");
		System.out.println(map);

		map.forEach((key, value) -> System.out.println(key + " -> " + value));

	}
}