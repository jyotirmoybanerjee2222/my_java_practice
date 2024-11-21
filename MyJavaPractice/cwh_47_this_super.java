package MyJavaPractice;
class EkClass{
	int a;
	EkClass(int x)
	{
		//a = x;
		this.a = x;
		System.out.println("ek class constructor");
	}
	public int returnone() {
		  return 1;
	}
	int getter() {
	 return a;
	}
}
class DoClasses extends EkClass{
	DoClasses(int x)
	{
		super(x);
		System.out.println("do class constuctor");
	}

  
}

public class cwh_47_this_super {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EkClass e = new EkClass(5);
		System.out.println(e.getter());
		DoClasses d= new DoClasses(5);
	}

}
