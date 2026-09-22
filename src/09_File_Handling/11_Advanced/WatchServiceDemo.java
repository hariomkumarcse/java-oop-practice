import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;

import static java.nio.file.StandardWatchEventKinds.*;

public class WatchServiceDemo
{
	public static void main(String[] args)
	{
		Path directory = Paths.get("WatchFolder");

		try
		{
			if(!Files.exists(directory))
			{
				Files.createDirectory(directory);

				System.out.println(
					"WatchFolder created."
				);
			}

			WatchService watchService =
				FileSystems.getDefault().newWatchService();

			directory.register(
				watchService,
				ENTRY_CREATE,
				ENTRY_MODIFY,
				ENTRY_DELETE
			);

			System.out.println(
				"Watching directory: " +
				directory.toAbsolutePath()
			);

			System.out.println(
				"Create, modify, or delete a file in this folder."
			);

			while(true)
			{
				WatchKey key = watchService.take();

				for(WatchEvent<?> event : key.pollEvents())
				{
					WatchEvent.Kind<?> kind =
						event.kind();

					Path fileName =
						(Path) event.context();

					System.out.println(
						"Event: " +
						kind.name() +
						" -> " +
						fileName
					);
				}

				boolean valid = key.reset();

				if(!valid)
				{
					break;
				}
			}

			watchService.close();
		}
		catch(IOException e)
		{
			System.out.println("WatchService error.");
			System.out.println("Error: " + e.getMessage());
		}
		catch(InterruptedException e)
		{
			System.out.println("WatchService interrupted.");
			Thread.currentThread().interrupt();
		}
	}
}