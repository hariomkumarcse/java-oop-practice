import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CSVStudentManagement
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
				"ID: " + id +
				", Name: " + name +
				", Course: " + course +
				", Marks: " + marks
			);
		}
	}

	public static void main(String[] args)
	{
		ArrayList<Student> students = new ArrayList<>();

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

				students.add(student);
			}

			reader.close();

			System.out.println("===== STUDENT LIST =====");

			for(Student student : students)
			{
				student.display();
			}

			System.out.println("\n===== SEARCH STUDENT =====");

			int searchId = 102;

			boolean found = false;

			for(Student student : students)
			{
				if(student.id == searchId)
				{
					System.out.println("Student found:");
					student.display();

					found = true;
					break;
				}
			}

			if(!found)
			{
				System.out.println("Student not found.");
			}

			double totalMarks = 0;

			for(Student student : students)
			{
				totalMarks += student.marks;
			}

			double averageMarks = totalMarks / students.size();

			System.out.println("\nAverage Marks: " + averageMarks);
		}
		catch(IOException e)
		{
			System.out.println("Error while reading CSV file.");
			System.out.println("Error: " + e.getMessage());
		}
		catch(NumberFormatException e)
		{
			System.out.println("Invalid numeric data in CSV file.");
			System.out.println("Error: " + e.getMessage());
		}
	}
}