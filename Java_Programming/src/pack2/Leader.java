package pack2;

import pack1.Employee;

class Leader extends Employee
{

public static void main(String args[])
{

	Leader emp = new Leader();
		
	emp.name = "ABC";
	emp.address = "Mumbai";
	emp.id = 10;

	System.out.println(emp.getEmployeeDetails());	

}

}