public class NestedTryCatch
{
	public static void main(String[] args)
	{
		try
		{
			System.out.println("Outer Try Block");

			try
			{
				int result = 10/0;

				System.out.println(result);
			}

			catch(ArithmeticException e)
			{
				System.out.println("Inner Catch: " + e.getMessage());
			}

			String name = null;

			System.out.println(name.length());

		}

		catch(NullPointerException e)
		{
			System.out.println("Outer Catch: " + e.getMessage());
		}

		System.out.println("Program Finished.");
	}
}