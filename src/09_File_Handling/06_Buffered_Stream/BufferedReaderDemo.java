import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo
{
	public static void main(String[] args)
	{
		try
		{
			BufferedReader reader = new BufferedReader(new FileReader("students.txt"));

			String line;

			while((line = reader.readLine()) != null)
			{
				System.out.println(line);
			}

			reader.close();
		}
		catch(IOException e)
		{
			System.out.println("Error while reading file.");
			System.out.println("Error: " + e.getMessage());
		}
	}
}