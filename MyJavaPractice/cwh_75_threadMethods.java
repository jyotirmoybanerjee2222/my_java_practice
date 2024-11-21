package MyJavaPractice;
class MyThr1 extends Thread{
	public MyThr1(String name)
	{
		super(name);
	}
	public void run() {
		int i = 0;
		while(i<100)
		{
			  i++;
			  //System.out.println("I am a thread not a threat");
			  System.out.println(this.getName());
			  try {
				  Thread.sleep(455);
				  
			  }catch(InterruptedException e)
			  {
				  e.printStackTrace();
			  }
		}
	}
}

public class cwh_75_threadMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThr1 t1 = new MyThr1("Shreya");
		MyThr1 t2 = new MyThr1("Jyotirmoy");

		
		t1.start();
		try {
			t1.join();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		t2.start();
	}

}
