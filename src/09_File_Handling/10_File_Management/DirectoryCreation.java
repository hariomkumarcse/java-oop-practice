import java.io.File;

public class DirectoryCreation
{
	public static void main(String[] args)
	{
		File directory = new File("ProjectFiles");

		if(directory.exists())
		{
			System.out.println("Directory already exists.");
		}

		else
		{
			boolean created = directory.mkdir();

			if(created)
			{
				System.out.println("Directory created successfully.");
			}

			else
			{
				System.out.println("Directory could not be created.");
			}
		}
	}
}