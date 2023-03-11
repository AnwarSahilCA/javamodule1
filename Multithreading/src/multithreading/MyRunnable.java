package multithreading;
import java.util.Scanner;

public class MyRunnable implements Runnable {

	@Override
	public void run() {
		for(int i=1;i<=5;i++)
		{
			System.out.println("Enter input:");
			int a= new Scanner(System.in).nextInt();
			System.out.println("Got the input. proceeding");
			System.out.println(Thread.currentThread().getName()+"="+i);
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		// TODO Auto-generated method stub

	}
}
