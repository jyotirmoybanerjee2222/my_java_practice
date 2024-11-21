package MyJavaPractice;
class MyThr extends Thread{
	public MyThr(String name)
	{
		super(name);
	}
	public void run() {
		int i = 0;
		while(i<10)
		{
			  i++;
			  //System.out.println("I am a thread not a threat");
			  System.out.println(this.getName());
		}
	}
}
public class cwh_73_threadConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThr t = new MyThr("Jyoti");
		MyThr t1 = new MyThr("Jyotir");
		MyThr t2 = new MyThr("Jyotim");
		MyThr t3 = new MyThr("Jyotimoy");
		MyThr t4 = new MyThr("Jyotirmoy");
		t4.setPriority(Thread.MAX_PRIORITY);
		t.start();
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		System.out.println("The id of the thread t " +t.getId());
		System.out.println("The name of the thread t " +t.getName());

		
		t1.start();
		//t1.join();
		
	}

}
