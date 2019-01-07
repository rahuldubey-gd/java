package oop.abstractclass;

abstract class Car
{

String name = "Webtek";

Car()
{
	System.out.println("I am Car's Constructor");
}


{
	System.out.println("I am Instance Block....");
}


abstract void engine();
abstract void lights();

void breaks()
{
	System.out.println("Calling Breaks: Stop!!!");
}

}