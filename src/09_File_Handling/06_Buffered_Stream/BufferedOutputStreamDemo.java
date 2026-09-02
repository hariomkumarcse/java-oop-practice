import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamDemo
{
	public static void main(String[] args)
	{
		try
		{
			BufferedOutputStream output = new BufferedOutputStream( new FileOutputStream("buffered-data.txt"));

		String data = "Hello from BufferedOutputStream.\n"
			+ "Buffered streams improve I/O performance.\n"
			+ "This is byte stream data.";

		output.write(data.getBytes());

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