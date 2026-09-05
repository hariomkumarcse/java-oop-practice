import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;

public class FilesDemo
{
	public static void main(String[] args)
	{
		try
		{
			Path path = Paths.get("nio-demo.txt");

			Files.writeString(path, "Hello from Java NIO.");

			System.out.println("File exists: " + Files.exists(path));
			System.out.println("Is regular file: " + Files.isRegularFile(path));
			System.out.println("File size: " + Files.size(path) + "bytes");

			String content = Files.readString(path);

			System.out.println("File content: " + content);
		}

		catch(IOException e)
		{
			System.out.println("Error while working with file.");
			System.out.println("Error: " + e.getMessage());
		}
	}
}