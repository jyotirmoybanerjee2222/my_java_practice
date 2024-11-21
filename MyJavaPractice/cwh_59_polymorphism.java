package MyJavaPractice;
interface camera1{
	void takeSnap();	
	void recordVideo();
	private void greet() {
		System.out.println("Greet");
	}
	default void record4k()
	{   greet();
		System.out.println("recording in 4k");
	};
//	private void greet() {
//		System.out.println("Greet");
//	}
}

interface wifi1{
	String[] getNetworks();
	void connetToNetwork(String network);
}
class MyCellPhone1{
	void callNumber(int phoneNumber) {
		System.out.println("Calling "+ phoneNumber);
	}
	void pickCall() {
	  System.out.println("connecting..");
	}
//	void takeSnap()
//	{
//		System.out.println("take snap");
//	};
//	void recordVideo() {
//	System.out.println("record video");	
//	};
//	void recordVideo() {
//		
//	};
}

class  MysmartPhone1 extends MyCellPhone1 implements wifi1,camera1{
	public void takeSnap()
	{
		System.out.println("take snap");
	};
	public void recordVideo() {
		System.out.println("record video");	
	};
	public String[] getNetworks()
	{
		System.out.println("Getting list of network");
		String [] networkList = {"jyotirmoy","Shreya"};
		return networkList;
	};
    public void connetToNetwork(String network)
    {
    	System.out.println("Connecting to"+network);
    };
    public void record4kVideo()  // overriding
    {
    	System.out.println("taking snap and record in 4k");
    };
} 

public class cwh_59_polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          camera1 cam1 = new MysmartPhone1();
        	cam1.record4k();
        	//cam1.getNetworks(); -> not allowed
        	cam1.record4k();
        	//cam1.record4kVideo(); -> not allowed

        	MysmartPhone1 cam2 = new MysmartPhone1();
        	cam2.getNetworks(); 
        	cam2.record4k();
        	cam2.record4kVideo();
        	
	}

}
