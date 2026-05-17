class Employee
{
	int empCode;
	String empName;
	double empSalary;

	Employee(int empCode, String empName, double empSalary)
	{
		super();
		this.empCode = empCode;
		this.empName = empName;
		this.empSalary = empSalary;
	}
	public String toString()
	{
		return "Employee [empCode="+ empCode+ ", empName= " + empName + ", empSalary= " + empSalary + "]";

	}
}
public class EmployeeMainString
{
	public static void main(String[] args)
	{
		Employee emp1 = new Employee(101,"Ramesh Kumar", 20222.5);
		Employee emp2 = new Employee(102,"Mahesh Kumar", 35000);

		System.out.println(emp1);
		System.out.println(emp2);
	}

}