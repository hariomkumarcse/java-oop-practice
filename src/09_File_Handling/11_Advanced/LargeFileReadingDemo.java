import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LargeFileReadingDemo
{
	public static void main(String[] args)
	{
		String fileName = "large-file.txt";

		long lineCount = 0;

		try( BufferedReader reader = new BufferedReader(new FileReader(fileName)))
		{
			String line;

			while((line = reader.readLine()) != null)
			{
				lineCount++;

				if(lineCount <= 5)
				{
					System.out.println(line);
				}
			}

			System.out.println("\nTotal lines: " + lineCount);
		}
		catch(IOException e)
		{
			System.out.println("Error while reading large file.");
			System.out.println("Error: " + e.getMessage());
		}
	}
}