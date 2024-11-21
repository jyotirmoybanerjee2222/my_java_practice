package MyJavaPractice;
class GoodMorning extends Thread{
	public GoodMorning(String name)
	{
		super(name);
	}
	public void run() {
		int i = 0;
		while(i<1000)
		{
			i++;
			System.out.println("Good Morning");
		}
	}
}
class WelCome extends Thread{
	public WelCome(String name)
	{
		super(name);
	}
	public void run() {
		int i = 0;
		while(i<10)
		{
			i++;
			System.out.println("WelCome");
			try {
				Thread.sleep(200);
			}catch(InterruptedException e)
			{
				System.out.println(e);
			}
		}
	}
}
public class cwh_76_Thread_practiceSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        GoodMorning G = new GoodMorning("GoodMorning");
        GoodMorning G1 = new GoodMorning("goodMorning");
        WelCome W = new WelCome("WelCome");
        WelCome W1 = new WelCome("welCome");

        G.start();
        try {
        	G.join();
        }catch(Exception e){
        	System.out.println(e);
        }
        W.start();
        G1.setPriority(10);
        System.out.println(G1.getState());
        W1.setPriority(4);
        G1.start();
        W1.start();
        System.out.println(G1.getPriority());
        System.out.println(W1.getPriority());
	}

}
