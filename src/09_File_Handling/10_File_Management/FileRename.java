import java.io.File;

public class FileRename
{
	public static void main(String[] args)
	{
		File oldFile = new File("old-name.txt");

		File newFile = new File("new-name.txt");

		if(!oldFile.exists())
		{
			System.out.println("Original file does not exist.");
			return;
		}

		boolean renamed = oldFile.renameTo(newFile);

		if(renamed)
		{
			System.out.println("File renamed successfully.");
		}

		else
		{
			System.out.println("File could not be renamed.");
		}
	}
}