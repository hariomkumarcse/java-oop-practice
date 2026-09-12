import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationDemo
{
	public static void main(String[] args)
	{
		try
		{
			Student student = new Student(
						101,
						"Hariom",
						85.5
						);

			FileOutputStream fileOutput = new FileOutputStream("student.ser");

			ObjectOutputStream objectOutput = new ObjectOutputStream(fileOutput);

			objectOutput.writeObject(student);

			objectOutput.close();
			fileOutput.close();

			System.out.println("Object serialized successfully.");
		}
		catch(IOException e)
		{
			System.out.println("Error during serialization.");
			System.out.println("Error: " + e.getMessage());
		}
	}
}
class Student implements Serializable 
{
	private static final long serialVersionUID = 1L;

	int id;
	String name;
	double marks;

	Student(int id, String name, double marks)
	{
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
}