import java.io.File;

public class FileClassDemo
{
	public static void main(String[] args)
	{
		File file = new File("sample.text");

		System.out.println("File Name: " + file.getName());
		System.out.println("File Path: " + file.getPath());
		System.out.println("Absolute Path: " + file.getAbsolutePath());
		System.out.println("Exists: " + file.exists());
		System.out.println("Is File: " + file.isFile());
		System.out.println("Is Directory: " + file.isDirectory());
	}
}