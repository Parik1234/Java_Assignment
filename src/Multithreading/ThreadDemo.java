package Multithreading;

public class ThreadDemo implements Runnable{

	@Override
	public void run() {
for(int i=1; i<=5; i++)
{
	System.out.println("my thread");
}
	}
	public static void main(String[] args){
		ThreadDemo t1=new ThreadDemo();
		Thread t=new Thread(t1);
		t.start();
		for(int i=1; i<=5; i++)
		{
			System.out.println("main Thread");
		}
	}

}
