package multithreading.threadmethods;

public class ThreadJoining extends Thread{

	@Override
	public void run() {
		for(int i=1;i<=5;i++)
		{
			System.out.println(i +" I am "+Thread.currentThread().getName());
			/*
			try {
				Thread.sleep(0);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			*/
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		ThreadJoining t1 = new ThreadJoining();
		ThreadJoining t2 = new ThreadJoining();
		ThreadJoining t3 = new ThreadJoining();
		
		t1.join();
		t2.join();
		/*
		t1.setName("First Thread");
		t2.setName("Second Thread");
		t3.setName("Third Thread ");
		*/
		
	
		t1.setDaemon(true);
		t1.start();
		t2.start();
		t3.start();
		//Daemon : System Dependent Thread It will never die 
		
	}

}
