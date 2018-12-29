package pack1;

class Manager
{

public static void main(String args[])
{

	Employee emp = new Employee();
	
	emp.name = "ABC";
	emp.address = "Delhi";
	emp.id = 101;
	
	System.out.println(emp.getEmployeeDetails());

}

}