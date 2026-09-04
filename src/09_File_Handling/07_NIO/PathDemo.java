import java.nio.file.Path;
import java.nio.file.Paths;

public class PathDemo
{
	public static void main(String[] args)
	{
		Path path = Paths.get("data", "students.txt");

		System.out.println("Path: " + path);
		System.out.println("File Name: " + path.getFileName());
		System.out.println("Parent: " + path.getParent());
		System.out.println("Absolute Path: " + path.toAbsolutePath());
		System.out.println("Root: " + path.getRoot());
		System.out.println("Name Count: " + path.getNameCount());
	}
}