package oop.abstractclass;


abstract class MyTest
{
	String name = "abc";
	
	abstract void add();
	abstract void sub();
	
	void display()
	{System.out.println("Display from Parent");}
}

public class Test extends MyTest{

	public static void main(String[] args) {
		
		MyTest m = new Test();
		m.add();
		m.sub();
		System.out.println(m.name);
		m.display();

	}

	@Override
	void add() {
		System.out.println("I am Add");
		
	}

	@Override
	void sub() {
		// TODO Auto-generated method stub
		System.out.println("I am Sub");
	}
	
	void display()
	{System.out.println("Display From Child");}

}
