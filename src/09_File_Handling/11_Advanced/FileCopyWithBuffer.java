import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyWithBuffer
{
	public static void main(String[] args)
	{
		String source = "source.txt";
		String destination = "destination.txt";

		try
		(
			BufferedInputStream input = new BufferedInputStream( new FileInputStream(source));

			BufferedOutputStream output = new BufferedOutputStream( new FileOutputStream(destination))
		)
		{
			byte[] buffer = new byte[8192];

			int bytesRead;

			while((bytesRead = input.read(buffer)) != -1)
			{
				output.write(buffer, 0, bytesRead);
			}

			System.out.println("File copied successfully.");
		}
		catch(IOException e)
		{
			System.out.println("Error while copying file.");
			System.out.println("Error: " + e.getMessage());
		}
	}
}