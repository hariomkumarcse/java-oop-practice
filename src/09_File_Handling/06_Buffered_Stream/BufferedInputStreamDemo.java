import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedInputStreamDemo
{
	public static void main(String[] args)
	{
		try
		{
			BufferedInputStream input = new BufferedInputStream(
				new FileInputStream("data.txt")
			);

			int data;

			while((data = input.read()) != -1)
			{
				System.out.print((char) data);
			}

			input.close();
		}
		catch(IOException e)
		{
			System.out.println("Error while reading file.");
			System.out.println("Error: " + e.getMessage());
		}
	}
}