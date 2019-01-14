package multithreading.byextending;

public class MyThread_Second extends Thread{

	@Override
	public void run() {
		for(int i=1;i<=10;i++)
		{
			System.out.println("Hello I am  "+Thread.currentThread().getName());
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyThread_Second t1 = new MyThread_Second();
		MyThread_Second t2 = new MyThread_Second();
		MyThread_Second t3 = new MyThread_Second();
		
		t1.start();
		t2.start();
		t3.start();
		
		t1.setName(" First Thread ");
		t2.setName(" Second Thread ");
		t3.setName(" Third Thread ");

	}

}
