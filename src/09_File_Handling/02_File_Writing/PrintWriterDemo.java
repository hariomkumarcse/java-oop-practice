import java.io.PrintWriter;
import java.io.FileNotFoundException;

public class PrintWriterDemo
{
	public static void main(String[] args)
	{
		try
		{
			PrintWriter writer = new PrintWriter("employees.txt");

			writer.println("Employee ID: 101");
			writer.println("Name: Hariom");
			writer.println("Department: Software Development");
			writer.println("Experience: Fresher");

			writer.close();

			System.out.println("Data written successfully.");
		}

		catch(FileNotFoundException e)
		{
			System.out.println("Unable to create or open file.");
			System.out.println("Error: " + e.getMessage());
		}
	}
}