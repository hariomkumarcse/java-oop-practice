import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedStreamCopyDemo
{
	public static void main(String[] args)
	{
		try
		{
			BufferedInputStream input = new BufferedInputStream( new FileInputStream("data.txt"));

			BufferedOutputStream output = new BufferedOutputStream( new FileOutputStream("data-copy.txt"));

			byte[] buffer = new byte[1024];

			int bytesRead;

			while((bytesRead = input.read(buffer)) != -1)
			{
				output.write(buffer, 0, bytesRead);
			}

			input.close();
			output.close();

			System.out.println("File copied successfully using buffered streams.");
		}
		catch(IOException e)
		{
			System.out.println("Error while copying file.");
			System.out.println("Error: " + e.getMessage());
		}
	}
}