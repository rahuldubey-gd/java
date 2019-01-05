package oop.overriding;

class A
{
	String name = "ABC";
	String address = "Delhi";
	
	void sum(){System.out.println("I am Sum Method.... : A");}
	void add(){System.out.println("I am Add Method.... : B");}
	void div(){}
}

class B extends A
{
	String username = "abc@gmail.com";
	String password = "@1234";
	
	void sub(){System.out.println("I am Substraction.... : B");}
	void mul(){System.out.println("I am Multiplication....: B");}
	void div(){System.out.println("I am B's Div Method.... : B");}
	
}


public class Oveerriding {

	public static void main(String[] args) {

		A a = new A();
		
		a.name;
		a.address;
		a.add();
		a.sum();
		a.div();
		
		B b =new B();
		
		b.username;
		b.password;
		
		b.sub();
		b.mul();
		b.div();
		
		
		A a1 = new B();
		
		a.name;
		a.address;
		a.add();
		a.sum();
		a.div(); // Child Class Div will be called
		
	}

}
