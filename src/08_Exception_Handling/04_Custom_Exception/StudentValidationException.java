class InvalidMarksException extends Exception
{
	InvalidMarksException(String message)
	{
		super(message);
	}
}
class Student
{
	private String name;
	private int marks;

	Student(String name, int marks)
	{
		this.name = name;
		this.marks = marks;
	}

	void validateMarks() throws InvalidMarksException
	{
		if(marks < 0 || marks > 100)
		{
			throw new InvalidMarksException("Marks must be between 0 and 100");
		}

		System.out.println("Student: " + name);
		System.out.println("Marks: " + marks);
	}
}
public class StudentValidationException
{
	public static void main(String[] args)
	{
		Student student = new Student("Hariom", 120);

		try
		{
			student.validateMarks();
		}
		catch(InvalidMarksException e)
		{
			System.out.println(e.getMessage());
		}
	}
}