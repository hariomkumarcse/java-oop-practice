import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;

public class DeleteFileNioDemo
{
	public static void main(String[] args)
	{
		try
		{
			Path path = Paths.get("moved-file.txt");

			if(Files.exists(path))
			{
				Files.delete(path);

				System.out.println("File deleted successfully.");
			}
			else
			{
				System.out.println("File does not exist.");
			}
		}
		catch(IOException e)
		{
			System.out.println("Error while deleting file.");
			System.out.println("Error: " + e.getMessage());
		}
	}
}