import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class WriteStringDemo
{
	public static void main(String[] args)
	{
		Path path = Path.of("employee.txt");

		String data =

			"Employee Name: Hariom\n" +
			"Department: Java Development\n" +
			"Technology: Spring Boot";

		try
		{
			Files.writeString(path, data);

			System.out.println("Data written successfully.");
		}

		catch(IOException e)
		{
			System.out.println("Error while writing file.");
			System.out.println("Error: " + e.getMessage());
		}
	}
}