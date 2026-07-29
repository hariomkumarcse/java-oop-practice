public class NumberFormatExceptionDemo
{
	public static void main(String[] args)
	{
		try
		{
			String number = "ABC";

			int value = Integer.parseInt(number);

			System.out.println(value);
		}
		catch(NumberFormatException e)
		{
			System.out.println("NumberFormatException: " + e.getMessage());
		}
		System.out.println("Program Continues...");
	}
}