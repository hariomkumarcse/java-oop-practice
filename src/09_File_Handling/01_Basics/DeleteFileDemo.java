import java.io.File;

public class DeleteFileDemo
{
	public static void main(String[] args)
	{
		File file = new File("student.txt");

		if(file.exists())
		{
	
			if(file.delete())
			{
				System.out.println("File deleted successfully.");
			}

			else
			{
				System.out.println("Unable to delete file.");
			}
		}
		else
		{
			System.out.println("File does not exist.");
		}
	}
}