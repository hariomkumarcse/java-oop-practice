class InvalidSalaryException extends Exception
{
	InvalidSalaryException(String message)
	{
		super(message);
	}
}
class Employee
{
	private String name;
	private double salary;

	Employee(String name, double salary)
	{
		this.name = name;
		this.salary = salary;
	}

	void validateSalary() throws InvalidSalaryException
	{
		if(salary < 1000)
		{
			throw new InvalidSalaryException("Salary must be at least 10000.");
		}

		System.out.println("Employee: " + name);
		System.out.println("Salary: " + salary);
	}
}
public class CustomExceptionDemo
{
	public static void main(String[] args)
	{
		Employee employee = new Employee("Hariom", 80000);

		try
		{
			employee.validateSalary();
		}

		catch(InvalidSalaryException e)
		{
			System.out.println(e.getMessage());
		}
	}
}