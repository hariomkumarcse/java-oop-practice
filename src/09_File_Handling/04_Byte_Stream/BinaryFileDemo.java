import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BinaryFileDemo
{
	public static void main(String[] args)
	{
		String source = "input.jpg";
		String destination = "output.jpg";

		try
		{
			FileInputStream input = new FileInputStream(source);

			FileOutputStream output = new FileOutputStream(destination);

			byte[] buffer = new byte[4096];

			int bytesRead;

			while((bytesRead = input.read(buffer)) != -1)
			{
				output.write(buffer, 0, bytesRead);
			}

			input.close();
			output.close();

			System.out.println("Binary file copied successfully.");
		}

		catch(IOException e)
		{
			System.out.println("Error while processing binary file.");
			System.out.println("Error: " + e.getMessage());
		}
	}
}