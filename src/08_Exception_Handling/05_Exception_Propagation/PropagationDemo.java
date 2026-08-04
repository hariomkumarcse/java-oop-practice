public class PropagationDemo
{
	static void methodThree()
	{
		int result = 10/0;

		System.out.println(result);
	}

	static void methodTwo()
	{
		methodThree();
	}

	static void methodOne()
	{
		methodTwo();
	}

	public static void main(String[] args)
	{
		try
		{
			methodOne();
		}

		catch(ArithmeticException e)
		{
			System.out.println("Exception Caught in Main Method");
			System.out.println(e);
		}

		System.out.println("Program Continues....");
	}
}