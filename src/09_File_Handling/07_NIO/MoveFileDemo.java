import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;
import java.nio.file.StandardCopyOption;

public class MoveFileDemo
{
	public static void main(String[] args)
	{
		try
		{
			Path source = Paths.get("source-copy.txt");
			Path destination = Paths.get("moved-file.txt");

			Files.move(
				source,
				destination,
				StandardCopyOption.REPLACE_EXISTING
				);

			System.out.println("File moved successfully.");
		}
		catch(IOException e)
		{
			System.out.println("Error while moving file.");
			System.out.println("Error: " + e.getMessage());
		}
	}
}