package oop.this_keyword;

public class ConstructorChaining {

	public ConstructorChaining() {
		//this(10,10.25f);
		this(10);
		System.out.println("I am Default Consttructor");
	}
	
	ConstructorChaining(int a, float f){
		this(10);
		System.out.println("I am Parameterized Constructor");
	}
	
	ConstructorChaining(int a)
	{
		System.out.println("One Parameter");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConstructorChaining c = new ConstructorChaining();
		//ConstructorChaining c1 = new ConstructorChaining(10,10.52f);
	}

}
