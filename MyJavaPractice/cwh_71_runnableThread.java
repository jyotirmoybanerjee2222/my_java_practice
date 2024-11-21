package MyJavaPractice;


class MyThreadRunnable implements Runnable{
	public void run() {
		int i = 0;
		while(i<10)
		{
			  i++;
			  System.out.println("I am a thread not a threat");
		}
		//System.out.println("I am a thread not a threat");
	}
}
class MyThreadRunnable1 implements Runnable{
	public void run() {
		int i = 0;
		while(i<10)
		{
			  i++;
			  System.out.println("I am a thread1 not a threat");
		}
		//System.out.println("I am a thread1 not a threat");
	}
}
public class cwh_71_runnableThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThreadRunnable t2 = new MyThreadRunnable();
		Thread gun2 = new Thread(t2);
		
		MyThreadRunnable1 t1 = new MyThreadRunnable1();
		Thread gun1 = new Thread(t1);
		gun1.start();
		gun2.start();

	}

}
