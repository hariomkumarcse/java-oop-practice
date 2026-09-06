import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;
import java.nio.file.StandardCopyOption;

public class CopyFileDemo
{
	public static void main(String[] args)
	{
		try
		{
			Path source = Paths.get("source.txt");
			Path destination = Paths.get("source-copy.txt");

			Files.copy(
				source,
				destination,
				StandardCopyOption.REPLACE_EXISTING
				);

			System.out.println("File copied successfully.");
		}
		catch(IOException e)
		{
			System.out.println("Error while copying file.");
			System.out.println("Error: " + e.getMessage());
		}
	}
}