import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;

public class DirectoryListingDemo
{
	public static void main(String[] args)
	{
		Path directory = Paths.get(".");

		try
		{
			DirectoryStream<Path> stream = Files.newDirectoryStream(directory);

			System.out.println("Files and directories:");

			for(Path path : stream)
			{
				System.out.println(path);
			}
			stream.close();
		}
		catch(IOException e)
		{
			System.out.println("Error while listing directory.");
			System.out.println("Error: " + e.getMessage());
		}
	}
}