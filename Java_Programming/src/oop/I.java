package oop;

interface I1
{
	int id1 = 18;
	String name1 = "Jitendra";
	
	void sub();
}

interface I2
{
	int id2 = 15;
	String name2 = "Jitendra Yadav";
	
	void mul();
}

interface I3
{
	int id3 = 12;
	String name3 = "Akash";
	
	void div();
	
}


public interface I extends I1,I2,I3{

	int id = 155;
	String name = "Rahul";
	
	void add();
}


