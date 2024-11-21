package MyJavaPractice;
interface Bicycle{
	int a = 45;
	void applyBrake(int decrement);
	void speedup(int increment);

}
interface HornBicycle{
	//int a = 45;
	void blowHornkh();
	void blowhorn();
//	void applyBrake(int decrement);
//	void speedup(int increment);

}

class AyonCycle implements Bicycle,HornBicycle{
	public void blowhorn() { System.out.println("Horn");}
	public void speedup(int increment) {
		System.out.println("increment speed");
	};
	public void applyBrake(int decrement) {
		System.out.println("decrement");
	};
	public void blowHornkh()
	{
		System.out.println("blowHorn");
	};
	
}
public class cwh_54_Intference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      AyonCycle jyoti = new AyonCycle();
      jyoti.applyBrake(0);
      
      System.out.println(jyoti.a);
      //you can not modify properties in interfaces
      jyoti.blowHornkh();
	}

}
