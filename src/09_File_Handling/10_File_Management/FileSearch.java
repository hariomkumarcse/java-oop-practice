import java.io.File;

public class FileSearch
{
	public static void main(String[] args)
	{
		File directory = new File(".");

		String searchFileName = "students.csv";

		File[] files = directory.listFiles();

		if(files == null)
		{
			System.out.println("Unable to access directory.");
			return;
		}

		boolean found = false;

		for(File file : files)
		{
			if(file.isFile() && 
				file.getName().equalsIgnoreCase(searchFileName))
			{
				System.out.println("File found.");
				System.out.println("Path: " + file.getAbsolutePath());

				found = true;
				break;
			}
		}

		if(!found)
		{
			System.out.println("File not found.");
		}
	}
}