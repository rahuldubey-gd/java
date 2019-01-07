package oop.javainterface;

class A implements I1
{

public void add()
{
	System.out.println("I am Add Method");
}

public void sub()
{
	System.out.println("I am Sub Method ");
}


public static void main(String  args[])
{
	A a= new A();
	a.add();
	a.sub();
	//name = "ABC";
	System.out.println(a.name);	
}
}