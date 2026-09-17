import java.io.File;

public class FileExtensionChecker
{
	public static void main(String[] args)
	{
		File file = new File("students.csv");

		String fileName = file.getName();

		int dotIndex = fileName.lastIndexOf(".");

		if(dotIndex > 0 && dotIndex < fileName.length() - 1)
		{
			String extension = fileName.substring(dotIndex + 1);

			System.out.println("File Name: " + fileName);
			System.out.println("Extension: " + extension);
		}
		else
		{
			System.out.println("File does not have an extension.");
		}
	}
}