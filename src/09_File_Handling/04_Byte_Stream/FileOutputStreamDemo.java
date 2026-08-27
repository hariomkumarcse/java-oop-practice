import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo
{
	public static void main(String[] args)
	{
		String data = "Java Byte Stream Example";

		try
		{
			FileOutputStream output = new FileOutputStream("byte-output.txt");

			byte[] bytes = data.getBytes();

			output.write(bytes);

			output.close();

			System.out.println("Data written successfully.");
		}
		catch(IOException e)
		{
			System.out.println("Error while writing file.");
			System.out.println("Error: " + e.getMessage());
		}
	}
}