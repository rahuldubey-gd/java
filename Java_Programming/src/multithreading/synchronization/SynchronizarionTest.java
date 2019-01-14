package multithreading.synchronization;

public class SynchronizarionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Wish wish = new Wish();
		Wish wish1 = new Wish();
		MyThread t1= new MyThread("Sachin", wish);
		MyThread t2 = new MyThread("Virat", wish1);
		MyThread t3 = new MyThread("Jasprit", wish);
		MyThread t4 = new MyThread("Jadeja", wish1);
		t1.start();
		t2.start();
		t3.start();
		t4.start();

	}

}
