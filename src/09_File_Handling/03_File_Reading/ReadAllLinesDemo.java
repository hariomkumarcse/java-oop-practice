import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class ReadAllLinesDemo
{
	public static void main(String[] args)
	{
		Path path = Path.of("students.txt");

		try
		{
			List<String> lines = Files.readAllLines(path);

			for(String line : lines)
			{
				System.out.println(line);
			}
		}

		catch(IOException e)
		{
			System.out.println("Error while reading file.");
			System.out.println("Error: " + e.getMessage());
		}
	}
}