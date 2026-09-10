import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CSVToObjectDemo
{
	static class Student
	{
		int id;
		String name;
		String course;
		double marks;

		Student(int id, String name, String course, double marks)
		{
			this.id = id;
			this.name = name;
			this.course = course;
			this.marks = marks;
		}

		void display()
		{
			System.out.println(
				id + " | " +
				name + " | " +
				course + " | " +
				marks
			);
		}
	}

	public static void main(String[] args)
	{
		try
		{
			BufferedReader reader = new BufferedReader(
				new FileReader("students.csv")
			);

			String line;
			boolean firstLine = true;

			while((line = reader.readLine()) != null)
			{
				if(firstLine)
				{
					firstLine = false;
					continue;
				}

				String[] data = line.split(",");

				int id = Integer.parseInt(data[0]);
				String name = data[1];
				String course = data[2];
				double marks = Double.parseDouble(data[3]);

				Student student = new Student(
					id,
					name,
					course,
					marks
				);

				student.display();
			}

			reader.close();
		}
		catch(IOException e)
		{
			System.out.println("Error while reading CSV file.");
			System.out.println("Error: " + e.getMessage());
		}
		catch(NumberFormatException e)
		{
			System.out.println("Invalid number format in CSV data.");
			System.out.println("Error: " + e.getMessage());
		}
	}
}