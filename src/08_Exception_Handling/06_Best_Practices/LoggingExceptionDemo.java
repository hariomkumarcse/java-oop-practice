import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggingExceptionDemo
{
	private static final Logger logger = Logger.getLogger(LoggingExceptionDemo.class.getName());

	public static void main(String[] args)
	{
		try
		{
			int result = 100/0;

			System.out.println(result);
		}
		catch(ArithmeticException e)
		{
			logger.log(Level.SEVERE, "Exception Occurred", e);
		}

		System.out.println("Program Continues..");
	}
}