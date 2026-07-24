import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class IOExceptionDemo
{
	public static void main(String[] args)
	{
		try
		{
			BufferedReader reader = new BufferedReader(new FileReader("sample.text"));

			String line;

			while((line = reader.readLine()) != null)
			{
				System.out.println(line);
			}

			reader.close();
		}
		catch(IOException e)
		{
			System.out.println("IOException Occurred: " + e.getMessage());
		}
	}
}