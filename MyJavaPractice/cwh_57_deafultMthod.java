package MyJavaPractice;
interface camera{
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

interface wifi{
	String[] getNetworks();
	void connetToNetwork(String network);
}
class MyCellPhone{
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

class  MysmartPhone extends MyCellPhone implements wifi,camera{
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
//    public void record4k()  // overriding
//    {
//    	System.out.println("taking snap and record in 4k");
//    };
} 
public class cwh_57_deafultMthod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MysmartPhone ms = new MysmartPhone();
		ms.record4k();
		String[] ar = ms.getNetworks();
		for( String item:ar) {
			System.out.println(item);
		}
		//ms.greet()//throws an error
	}

}
