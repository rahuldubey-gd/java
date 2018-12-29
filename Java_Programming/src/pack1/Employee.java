package pack1;

public class Employee
{
/*

private String name;
private String address;
private int id;

*/
/*
String name;
String address;
int id;
*/


protected String name;
protected String address;
protected int id;

public String getEmployeeDetails()
{

	return (" Employee Name:-"+name+"\n Employee Address:-"+address+"\n Employee Id:-"+id);
}

public static void main(String args[])
{

	Employee emp1 = new Employee();
	
	emp1.name = "Rahul";
	emp1.address = "Delhi";
	emp1.id = 1011;

	String details = emp1.getEmployeeDetails();

	System.out.println(details);

	//System.out.println(emp1.getEmployeeDetails());

}

}