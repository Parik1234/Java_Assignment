package Multithreading;

public class ThreadB extends Thread {
	
	public void run() {
		for(int i=1; i<=5; i++)
		{
			//System.out.println(Thread.currentThread().getName());
			System.out.println("parikshit");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			};
		}
	}
	public static void main(String[] args) throws InterruptedException {
		ThreadB t1=new ThreadB();
		ThreadB t2=new ThreadB();
		System.out.println(t1.getPriority());
		t1.start();
		//t1.join();
		for(int i=1; i<=5; i++) {
			System.out.println(Thread.currentThread().getName());
			System.out.println("kumar");
			Thread.sleep(1000);
		}
	}

}
