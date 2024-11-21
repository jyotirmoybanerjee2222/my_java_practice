package MyJavaPractice;
class Base1{
	 Base1(){
		 System.out.println("I am a constructor");
	 }
	 Base1(int x){
		 System.out.println("I am a overloaded constructor"+x);
	 }
	 int x;
	    public void	setX(int X) { this.x = X;}
	    public int getX() {
	    	return x;
	    }
		public void printMe() {
			System.out.println("I am constructor");
		}
}
class Derived1 extends Base1{
	    Derived1(){
	    	//super(1);
	    	System.out.println("I am a deived class constructor");
	    }
	    Derived1(int x,int y){
	    	super(x);
	    	System.out.println("I am a  overloade deived class constructor"+x+y);
	    }
	    
		int y;
	    public void	setY(int Y) { this.y = Y;}
	    public int getY() {
	    	return y;
	    }

	}

class Child  extends Derived1{
	Child(){
		System.out.println("I am a child of derived");
	}
	Child(int x,int y,int z){
		super(x,y);
		System.out.println(x*y*z);
		System.out.println("I am a child constuctor");
	}
}
public class Cwh_46_constuctorInhertance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Base1 B = new Base1();	
		//Derived1 D = new Derived1(4,9);
		  Child c  = new Child(4,5,6);
	}
}
