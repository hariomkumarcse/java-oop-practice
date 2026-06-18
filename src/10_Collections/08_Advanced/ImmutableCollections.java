import java.util.List;
import java.util.Set;
import java.util.Map;

public class ImmutableCollections
{
	public static void main(String[] args)
	{
		List<String> fruits = List.of("Apple", "Banana", "Mango");

		Set<Integer> numbers = Set.of(10,20,30);

		Map<Integer, String> students = Map.of(1, " Hariom", 2, " Ishika");

		System.out.println(fruits);
		System.out.println(numbers);
		System.out.println(students);

	}
}