import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo
{
	public static void main(String[] args)
	{
		try
		{
			FileReader reader = new FileReader("message.txt");

			char[] buffer = new char[100];

			int charactersRead;

			while((charactersRead = reader.read(buffer)) != -1)
			{
				System.out.println( 
					new String(buffer, 0, charactersRead)
				);
			}

			reader.close();
		}
		catch(IOException e)
		{
			System.out.println("Error while reading text file.");
			System.out.println("Error: " + e.getMessage());
		}
	}
}