package multithreading.synchronization;

public class MyThread extends Thread{
	String name;
	Wish wish;
	
	MyThread(String name, Wish wish)
	{
		this.name = name;
		this.wish = wish;
	}
	
	@Override
	public void run() {
	
		try {
			wish.wishGoodMorning(name);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
