import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo
{
	public static void main(String[] args)
	{
		try
		{
			FileWriter writer = new FileWriter("message.txt");

			writer.write("Hello from Java Character Stream.\n");
			writer.write("FileWriter writes character data.\n");
			writer.write("This is text data.");

			writer.close();

			System.out.println("Text written successfully.");
		}
		catch(IOException e)
		{
			System.out.println("Error while writing text.");
			System.out.println("Error: " + e.getMessage());
		}
	}
}