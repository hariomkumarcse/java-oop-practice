public class MultiCatchDemo
{
	public static void main(String[] args)
	{
		try
		{
			String number = null;

			int value = Integer.parseInt(number);

			System.out.println(value);
		}
		catch(NumberFormatException | NullPointerException e)
		{
			System.out.println("Exception Occurred: " + e.getClass().getSimpleName());
			System.out.println("Message: " + e.getMessage());
		}

		System.out.println("Program Finished.");
	}
}