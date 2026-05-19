import java.util.ArrayList;

public class EvenSumMain
{
	public static void main(String[] args)
	{
		ArrayList<Integer> list = new ArrayList<>();

		for(int i = 1; i <= 10; i ++)
		{
			list.add(i);
		}
		int sum = list.stream()
				.filter(n-> n % 2 == 0 )
				.reduce(0, (a,b) -> a+b);

		System.out.println("Sum of even number: " + sum);
	}
}