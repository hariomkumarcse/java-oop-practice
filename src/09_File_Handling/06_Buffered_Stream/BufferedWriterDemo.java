import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo
{
	public static void main(String[] args)
	{
		try
		{
			BufferedWriter writer = new BufferedWriter( new FileWriter("students.txt"));

			writer.write("101, Hariom, Java");
			writer.newLine();

			writer.write("102, Rahul, Spring Boot");
			writer.newLine();

			writer.write("103, Aman, SQL");
			writer.newLine();

			writer.close();

			System.out.println("Data written successfully.");
		}
		catch(IOException e)
		{
			System.out.println("Error while writing data.");
			System.out.println("Error: " + e.getMessage());
		}
	}
}