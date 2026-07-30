public class ClassCastExceptionDemo
{
	public static void main(String[] args)
	{
		try
		{
			Object object = "Java Programming";

			Integer number = (Integer) object;

			System.out.println(number);
		}
		catch(ClassCastException e)
		{
			System.out.println("ClassCastException: " + e.getMessage());
		}

		System.out.println("Program Continues...");
	}
}