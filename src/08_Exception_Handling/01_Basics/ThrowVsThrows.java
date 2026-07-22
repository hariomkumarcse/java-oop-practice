public class ThrowVsThrows
{
	static void checkAge(int age) throws Exception
	{
		if(age<18)
		{
			throw new Exception("Not Eligible for Voting");
		}
		System.out.println("Eligible for Voting");
	}

	public static void main(String[] args)
	{
		try
		{
			checkAge(15);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}