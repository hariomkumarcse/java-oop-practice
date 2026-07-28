public class ArrayIndexOutOfBoundsDemo
{
	public static void main(String[] args)
	{
		try
		{
			int[] numbers = {10,20,30};

			System.out.println(numbers[5]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
		}

		System.out.println("Program Continues...");
	}
}