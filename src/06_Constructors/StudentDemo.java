class Student
{
	int id;
	String name;

	Student()
	{
		id = 0;
		name = "Default";
		System.out.println("Default Constructor Called");
	}
	Student(int i, String n)
	{
		id = i;
		name = n;
		System.out.println("Parameterized Constructor Called");
	}
	Student(Student s)
	{
		id = s.id;
		name = s.name;
		System.out.println("Copy Constructor Called");
	}
	void display()
	{
		System.out.println("ID: " +id+ ", Name: " +name);
	}
}
public class StudentDemo
{
	public static void main(String[] args)
	{
		Student s1 = new Student();
		s1.display();

		System.out.println();

		Student s2 = new Student(101,"Hariom");
		s2.display();

		System.out.println();

		Student s3 = new Student(s2);
		s3.display();
	}

}