package MyJavaPractice;
class MyThread1 extends Thread{
	public void run() {
		int i = 0;
		while(i<10)
		{
			  i++;
			  System.out.println("my thread1 is running");
		}
	}
}
class MyThread2 extends Thread{
	public void run() {
		int i = 0;
		while(i<10)
		{
			  i++;
			  
		}
	}
}
public class cwh_70_javaThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread2 t2 = new MyThread2();
		MyThread1 t1 = new MyThread1();
		t1.start();
		t2.start();
	}

}
