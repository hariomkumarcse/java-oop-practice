import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;

public class CreateDirectoryDemo
{
	public static void main(String[] args)
	{
		try
		{
			Path directory = Paths.get("NIO_Directory");

			if(Files.exists(directory))
			{
				System.out.println("Directory already exists.");
			}

			else
			{
				Files.createDirectory(directory);

				System.out.println("Directory created successfully.");
			}
		}
		catch(IOException e)
		{
			System.out.println("Error while creating directory.");
			System.out.println("Error: " + e.getMessage());
		}
	}
}