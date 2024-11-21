package MyJavaPractice;
class a{
	public int jyoti() {
		//String s = "Shreya";
		return 4;
	}
	public void meth2(int a) {
	   System.out.println("I am method 2 of class a");
	}
}
class b extends a{
	public void meth3()
	{
		System.out.println("i am method 3 of class 3");
	}
	
	public void meth2(int x) {
		   System.out.println("I am method 2 of class B");
		}
}
public class cwh_48_MethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     a A = new a();
     //A.meth2();
     
     b B = new b();
     B.meth2(5);
	}

}
