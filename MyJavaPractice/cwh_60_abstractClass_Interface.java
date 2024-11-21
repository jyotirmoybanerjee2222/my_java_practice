package MyJavaPractice;

abstract class pen{
	abstract void write();
	abstract void refil();
}

class FountainPen extends pen{
	void write() {
		System.out.println("Write");
	}
	void refil() {
		System.out.println("refil");
	}
	void changeNib() {
		System.out.println("Changing Nib");
	}
}

class Monkey {
	void jump() {
		System.out.println("Jumping..");
	}
	void bite() {
		System.out.println("Biting..");
	}
}
interface BasicAnimal{
	void eat();
	void sleep();
}
class Human extends Monkey  implements BasicAnimal{
	void speak(){
		System.out.println("Hello sir..");
	}
	public void eat() {System.out.println("Eating");}
	public void sleep() {System.out.println("Sleeping");}
}
public class cwh_60_abstractClass_Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//q1&q2
		FountainPen pen = new FountainPen();
		pen.changeNib();
		pen.refil();
		pen.write();
		
		//q3
		Human jyoti = new Human();
		jyoti.sleep();
		jyoti.bite();
		jyoti.jump();
		
		//q5
		Monkey m1 = new Human();
		m1.bite();
		m1.jump();
		//m1.speak(); -> The method speak() is undefined 

		BasicAnimal a = new Human();
		a.eat();
		a.sleep();
		//a.speak();-> The method speak() is undefined 
		//a.bite();-> The method speak() is undefined
		//a.jump();-> The method speak() is undefined
	}

}
