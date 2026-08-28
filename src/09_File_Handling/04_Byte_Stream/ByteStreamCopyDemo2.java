import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamCopyDemo2
{
	public static void main(String[] args)
	{
		String source = "source.txt";
		String destination = "copy.txt";

		try
		{
			FileInputStream input = new FileInputStream(source);

			FileOutputStream output = new FileOutputStream(destination);

			byte[] buffer = new byte[1024];

			int bytesRead;

			while((bytesRead = input.read(buffer)) != -1)
			{
				output.write(buffer, 0, bytesRead);
			}

			input.close();
			output.close();

			System.out.println("File copied successfully.");
		}
		catch(IOException e)
		{
			System.out.println("Error while copying file.");
			System.out.println("Error: " + e.getMessage());
		}
	}
}