import java.io.File;

public class FilePathDemo
{
	public static void main(String[] args)
	{
		File file = new File("data/student.text");

		System.out.println("Path: " + file.getPath());
		System.out.println("Absolute Path: " + file.getAbsolutePath());
		System.out.println("Canonical Path:");

		try
		{
			System.out.println(file.getCanonicalPath());
		}
		catch(Exception e)
		{
			System.out.println("Unable to get canonical path.");
			System.out.println("Error: " + e.getMessage());
		}
	}
}