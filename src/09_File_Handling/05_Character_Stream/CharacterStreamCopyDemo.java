import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStreamCopyDemo
{
	public static void main(String[] args)
	{
		try
		{
			FileReader reader = new FileReader("message.txt");
			FileWriter writer = new FileWriter("message-copy.txt");

			char[] buffer = new char[100];

			int charactersRead;

			while((charactersRead = reader.read(buffer)) != -1)
			{
				writer.write(buffer, 0, charactersRead);
			}

			reader.close();
			writer.close();

			System.out.println("File copied successfully.");
		}
		catch(IOException e)
		{
			System.out.println("Error while copying file.");
			System.out.println("Error: " + e.getMessage());
		}
	}
}