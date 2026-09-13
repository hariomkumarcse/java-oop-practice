import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.io.Serializable;

public class SerializableDemo
{
	static class Employee implements Serializable
	{
		private static final long serialVersionUID = 1L;

		int id;
		String name;
		String department;

		Employee(int id, String name, String department)
		{
			this.id = id;
			this.name = name;
			this.department = department;
		}

		void display()
		{
			System.out.println("ID: " + id);
			System.out.println("Name: " + name);
			System.out.println("Department: " + department);
		}
	}

	public static void main(String[] args)
	{
		try
		{
			Employee employee =
				new Employee(
					501,
					"Hariom",
					"Software Engineering"
				);

			ObjectOutputStream output =
				new ObjectOutputStream(
					new FileOutputStream("employee.ser")
				);

			output.writeObject(employee);
			output.close();

			System.out.println("Employee object saved.");

			ObjectInputStream input =
				new ObjectInputStream(
					new FileInputStream("employee.ser")
				);

			Employee savedEmployee =
				(Employee) input.readObject();

			input.close();

			System.out.println("\nEmployee object loaded:");

			savedEmployee.display();
		}
		catch(IOException e)
		{
			System.out.println("I/O error.");
			System.out.println("Error: " + e.getMessage());
		}
		catch(ClassNotFoundException e)
		{
			System.out.println("Class not found.");
			System.out.println("Error: " + e.getMessage());
		}
	}
}