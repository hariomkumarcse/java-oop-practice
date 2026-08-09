public class ExceptionChainingDemo
{
	static void divide(int a, int b) throws Exception
	{
		try
		{
			int result = a/b;

			System.out.println("Result: " + result);
		}

		catch(ArithmeticException e)
		{
			throw new Exception("Division Failed.", e);
		}
	}
	public static void main(String[] args)
	{
		try
		{
			divide(10,0);
		}
		catch(Exception e)
		{
			System.out.println("Message: " + e.getMessage());

			System.out.println("\nOriginal Cause: ");
			System.out.println(e.getCause());

			System.out.println("\nStack Trace: ");
			e.printStackTrace();
		}
	}	
}