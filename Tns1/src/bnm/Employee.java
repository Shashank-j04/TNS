package bnm;

public class Employee {
	int empId;
	String empName;
	float empSalary;
	
	void input(int id, String name,float salary)
	{
		empId=id;
		empName=name;
		empSalary=salary;
	}
	
	void display()
	{
		System.out.println("Employee ID = "+ empId);
		System.out.println("Employee Name = "+ empName);
		System.out.println("Employee Salary= "+ empSalary);
	}
	
	public static void main(String args[])
	{
		Employee empObj1 =new Employee();
		empObj1.input(21,"Sachnez",1231);
		empObj1.display();
	}
}
