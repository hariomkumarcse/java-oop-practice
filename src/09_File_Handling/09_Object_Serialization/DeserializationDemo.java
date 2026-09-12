import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class DeserializationDemo
{
	public static void main(String[] args)
	{
		try
		{
			FileInputStream fileInput = new FileInputStream("student.ser");

			ObjectInputStream objectInput = new ObjectInputStream(fileInput);

			Student student = (Student) objectInput.readObject();

			objectInput.close();
			fileInput.close();

			System.out.println("Object deserialized successfully.");

			System.out.println("ID: " + student.id);
			System.out.println("Name: " + student.name);
			System.out.println("Marks: " + student.marks);
		}
		catch(IOException e)
		{
			System.out.println("Error during deserialisation.");
			System.out.println("Error: " + e.getMessage());
		}
		catch(ClassNotFoundException e)
		{
			System.out.println("Student class not found.");
			System.out.println("Error: " + e.getMessage());
		}
	}
}