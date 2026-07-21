public class FinallyDemo
{
	public static void main(String[] args)
	{
		try
		{
			int result = 10/2;

			System.out.println(result);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("Finally Block Always Executes");
		}
	}
}