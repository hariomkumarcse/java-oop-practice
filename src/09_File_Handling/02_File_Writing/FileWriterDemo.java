import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo
{
	public static void main(String[] args)
	{
		try
		{
			FileWriter writer = new FileWriter("student.txt");

			writer.write("Name: Hariom\n");
			writer.write("Course: B.Tech CSE\n");
			writer.write("Language: Java\n");

			writer.close();

			System.out.println("Data written successfully.");
		}
		catch(IOException e)
		{
			System.out.println("Error while writing file.");
			System.out.println("Error: " + e.getMessage());
		}
	}
}