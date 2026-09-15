import java.io.File;

public class DirectoryListing
{
	public static void main(String[] args)
	{
		File directory = new File(".");

		File[] files = directory.listFiles();

		if(files == null)
		{
			System.out.println("Unable to access directory.");
			return;
		}

		System.out.println("Directory contents:");

		for(File file : files)
		{
			if(file.isDirectory())
			{
				System.out.println("[DIRECTORY] " + file.getName());
			}

			else
			{
				System.out.println(" [File] " + file.getName());
			}
		}
	}
}