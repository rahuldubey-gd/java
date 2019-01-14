package multithreading.synchronization;

public class Wish {
	/*
	public  static synchronized void wishGoodMorning(String name) throws InterruptedException
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Good Morning :Mr."+name);
			Thread.sleep(2500);
			//wait(5000);
			//notifyAll();
			
		}
	}
	*/
	
	public synchronized void wishGoodMorning(String name) throws InterruptedException
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Good Morning :Mr."+name);
			Thread.sleep(2500);
			//wait(5000);
			//notifyAll();
			
		}
	}
}
