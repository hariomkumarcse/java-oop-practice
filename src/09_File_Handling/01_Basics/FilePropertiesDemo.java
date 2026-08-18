import java.io.File;

public class FilePropertiesDemo
{
	public static void main(String[] args)
	{
		File file = new File("student.txt");

		System.out.println("File Name: " + file.getName());
		System.out.println("File Path: " + file.getPath());
		System.out.println("Absolute Path: " + file.getAbsolutePath());
		
		System.out.println("Exists: " + file.exists());
		System.out.println("Is File: " + file.isFile());
		System.out.println("Is Directory: " + file.isDirectory());

		System.out.println("Readable: " + file.canRead());
		System.out.println("Writable: " + file.canWrite());

		System.out.println("File Size: " + file.length() + "bytes");
	}
}