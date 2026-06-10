import java.util.TreeSet;
import java.util.Collections;
import java.util.Comparator;

class Student
{
	int rollNo;
	String name;
	int marks;

	public Student(int rollNo, String name, int marks)
	{
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
	}
	public String toString()
	{
		return "{Roll No: " +rollNo+ " , Name: " +name+ ", Marks: " +marks+ "}";
	}
}
class NameComparator implements Comparator<Student>
{
	@Override
	public int compare(Student s1, Student s2)
	{
		return s1.name.compareTo(s2.name);
	}
}
class MarksComparator implements Comparator<Student>
{
	@Override
	public int compare(Student s1, Student s2)
	{
		return s1.marks - s2.marks;
	}
}
public class ComparatorDemo
{
	public static void main(String[] args)
	{
		Student student1 = new Student(1, "Anubhav",86);
		Student student2 = new Student(2,"Anand", 89);
	
		TreeSet<Student> students = new TreeSet<>(new MarksComparator());
		students.add(student1);
		students.add(student2);
		System.out.println(students);

		students = new TreeSet<>(new NameComparator());
		students.add(student1);
		students.add(student2);
		System.out.println(students);
	}
}