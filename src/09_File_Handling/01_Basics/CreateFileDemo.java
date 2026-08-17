import java.io.File;
import java.io.IOException;

public class CreateFileDemo
{
	public static void main(String[] args)
	{
		File file = new File("student.text");

		try
		{
			if(file.createNewFile())
			{
				System.out.println("File created successfully.");
			}

			else
			{
				System.out.println("File already exists.");
			}
		}
		catch(IOException e)
		{
			System.out.println("Unable to create file.");
			System.out.println("Error: " + e.getMessage());
		}
	}
}