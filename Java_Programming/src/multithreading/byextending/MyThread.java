package multithreading.byextending;

public class MyThread extends Thread{

	@Override
	public void run() {
		System.out.print("Thread is executing :- ");
		System.out.println(Thread.currentThread().getName());
	}
	
	public static void main(String[] args) {
		
		MyThread m = new MyThread();
		MyThread m1= new MyThread();
		m.start();
		m1.start();
		m.setName("First Thread");
		m1.setName("Second Thread");
		
		System.out.println(Thread.currentThread().getName());
		

	}

}
