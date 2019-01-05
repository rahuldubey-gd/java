package oop.this_keyword;

public class Employee {

	String name;
	String address;
	int id;
	
	void setEmployeeDetails(String name, String address, int id)
	{
		this.name = name;
		this.address = address;
		this.id = id;
	}
	
	public static void main(String[] args) {
		
		Employee e = new Employee();
		Employee e1 = new Employee();
		
		e.setEmployeeDetails("Rahul", "Delhi", 101);
		e1.setEmployeeDetails("Hariom", "Delhi", 102);
		System.out.println("Name: "+e1.name+"   Address: "+e1.address+"   ID :-"+e1.id);


	}

}
