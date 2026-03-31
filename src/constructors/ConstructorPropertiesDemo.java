package constructors;  
class Student
{
	int id;
	String name;
	
	Student()
	{
		id = 21;
		name = "Hariom";
		System.out.println("Default Constructor Called");
	}
	Student(int i, String n)
	{
		id = i;
		name = n;
		System.out.println("Parameterized Constructor Called");
	
	}
	Student(int i)
	{
		id = i;
		name = "Not Assigned";
		System.out.println("Single Parameter Constructor Called");
	}
	void display()
	{
		System.out.println("ID: " +id + " " + "Name: " + name);
	}
}
public class ConstructorPropertiesDemo
{
	public static void main(String [] args)
	{
		Student s1 = new Student();
		Student s2 = new Student(103,"Hariom");
		Student s3 = new Student(102);

		s1.display();
		s2.display();
		s3.display();
	}

}