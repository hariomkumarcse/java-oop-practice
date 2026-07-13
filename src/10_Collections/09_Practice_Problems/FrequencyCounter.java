import java.util.HashMap;

public class FrequencyCounter
{
	public static void main(String[] args)
	{
		String[] fruits = {
			"Apple",
			"Banana",
			"Apple",
			"Orange",
			"Banana",
			"Apple"
		};

		HashMap<String, Integer> frequency = new HashMap<>();

		for(String fruit : fruits)
		{
			if(frequency.containsKey(fruit))
			{
				frequency.put(fruit, frequency.get(fruit) + 1);
			} 
			else 
			{
				frequency.put(fruit, 1);
			}
		}
		System.out.println("Frequency Count: " );

		for(String key : frequency.keySet())
		{
			System.out.println(key + " -> " + frequency.get(key));
		}
	}
}