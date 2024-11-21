package MyJavaPractice;

class Phone{
	public void name() {
	 System.out.println("My name is shreya");
	}
}

class SmartPhone extends Phone{
	public void name(){
		System.out.println("ia am java of class2");
	}
	public void call(){
		System.out.println("calling from smartPhone");
	}
}
public class cwh_49_dynamicMethodDispatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		One obj = new One();
//		obj.name();
		
		Phone obj = new SmartPhone();
		obj.name(); //ia am java of class2
		//obj.call();  not allowed
	}

}
