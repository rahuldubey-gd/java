package oop.abstractclass;

class Honda_City extends Car
{

	public void engine()
	{
		System.out.println("Engine is called : Start..@@@@");
	}
	
	public void lights()
	{
		System.out.println("Calling Lights: Turn on Lights...");
	}

	public void gear()
	{
		System.out.println("Gear Change.....");
	}

	public static void main(String args[])
	{
		Honda_City h = new Honda_City(); 
		System.out.println("Car Name:-"+h.name);
		h.engine();
		h.lights();
		h.gear();
		h.breaks();
	//	Car c =new Car();
	
	} 

}