package oop.overloading;

public class OverTest_First {

	void add(int num1, int num2)
	{
		System.out.println("Integer - Integer");
	}
	
	
	void add(float num1, float num2)
	{
		System.out.println("Float - Float");
	}
	
	void add(int num)
	{
		System.out.println("Inetger");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OverTest_First o =new OverTest_First();
		
		o.add(10.10f,10.10f);

	}

}
