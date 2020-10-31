package oop;

public class IntefaceTest implements I{
	
	public void add()
	{
		System.out.println("I am From ADD");
	}
	
	public void sub()
	{
		System.out.println("I am From SUB");
	}
	
	public void mul()
	{
		System.out.println("I am From MUL");
	}
	
	public void div()
	{
		System.out.println("I am From DIV");
	}

	public static void main(String[] args) {
		
		IntefaceTest i = new IntefaceTest();
		i.add();
		i.sub();
		i.mul();
		i.div();
		
		System.out.println(i.id+" "+i.id1+"  "+i.id2+" "+i.id3);
		System.out.println(i.name+" "+i.name1+"  "+i.name2+" "+i.name3);

	}

}
