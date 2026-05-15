class Employee
{
	int empCode;
	String empName;
	double empSalary;

	Employee(int empCode, String empName, double empSalary)
	{
		this.empCode = empCode;
		this.empName = empName;
		this.empSalary = empSalary;
	}

	void display()
	{
		System.out.println("Employee Code: " +empCode);
		System.out.println("Employee Name: " + empName);
		System.out.println("Employee Salary: " + empSalary);
	}
}
class EmployeeMain
{
	public static void main(String[] args)
	{
		Employee emp1 = new Employee(101,"Ravi Kumar",18000);
		Employee emp2 = new Employee(102,"Ram Kumar", 19000);

		emp1.display();
		emp2.display();
	}
} 