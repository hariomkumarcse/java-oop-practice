public class MultipleCatchDemo
{
	public static void main(String[] args)
	{
		try
		{
			String text = null;

			System.out.println(text.length());
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic Exception");
		}
		catch(NullPointerException e)
		{
			System.out.println("Null Pointer Exception");
		}
		catch(Exception e)
		{
			System.out.println("General Exception");
		}
	}
}