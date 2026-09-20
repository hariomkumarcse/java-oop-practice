import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FileLockDemo
{
	public static void main(String[] args)
	{
		Path path = Paths.get("locked-file.txt");

		try
		(
			FileChannel channel = FileChannel.open(path, StandardOpenOption.CREATE, StandardOpenOption.WRITE)
		)
		{
			try(FileLock lock = channel.lock())
			{
				System.out.println("File lock acquired.");

				String message = "File is locked while this program is running.\n";

				channel.write( java.nio.ByteBuffer.wrap( message.getBytes()));

				System.out.println("Data written successfully.");
				System.out.println("Holding lock for 5 seconds...");

				Thread.sleep(5000);
			}
			System.out.println("File Lock Released.");
		}
		catch(IOException e)
		{
			System.out.println("File locking error.");
			System.out.println("Error: " + e.getMessage());
		}
		catch(InterruptedException e)
		{
			System.out.println("Thread was interrupted.");
			Thread.currentThread().interrupt();
		}
	}
}