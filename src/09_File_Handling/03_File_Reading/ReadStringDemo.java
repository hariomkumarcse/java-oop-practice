import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ReadStringDemo
{
	public static void main(String[] args)
	{
		Path path = Path.of("students.txt");

		try
		{
			String content = Files.readString(path);

			System.out.println("File Content: ");
			System.out.println(content);
		}

		catch(IOException e)
		{
			System.out.println("Error while reading file.");
			System.out.println("Error: " + e.getMessage());
		}
	}
}