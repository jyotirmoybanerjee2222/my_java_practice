package MyJavaPractice;
class Circle1{
	public int radius;
	Circle1(){
		//this.radius = a;
		System.out.println("I am circle  constructor");
	}
	Circle1(int a){
		this.radius = a;
		System.out.println("I am circle parametrized constructor");
	}
	public double area(){
		return Math.PI*this.radius*this.radius;
	}
}
class Cylinder1 extends Circle1 {
	public int height;
	Cylinder1(int r,int h){
		super(r);
		this.height = h;
	}
	//public int height;
	public double volume() {
		return  Math.PI*this.radius*this.radius*this.height;
	}
}
public class cwh_52_chapter10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   // problem1
		//Circle1 obj1 = new Circle1(5);
		Cylinder1 obj = new Cylinder1(5,10);
	}

}
