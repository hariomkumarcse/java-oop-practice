public class CheckedExceptionDemo
{
	static void validateAge(int age) throws Exception
	{
		if(age<18)
		{
			throw new Exception("Age must be 18 or above.");
		}

		System.out.println("Age is valid.");
	}

	public static void main(String[] args)
	{
		try
		{
			validateAge(16);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}

		System.out.println("Program Finised.");
	}
}