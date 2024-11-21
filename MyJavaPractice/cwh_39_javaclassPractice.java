package MyJavaPractice;


class employee1{
	     int salary;
	     String name;
	     public int getSalary() {
	    	 return salary;
	     }
	     public String getName() {
	    	 return name;
	    	 
	     }
	     
	     public  void setName(String n) {
	          name = n;
	     }
//	     public void print_details() {
//	    	 System.out.println("hi"); 
//	    	 
//	     }
	     
	   }

class cellPhone{
	public void ringing() {
		System.out.println("Ringing ");
	}
	public void vibrating() {
		System.out.println("vibrating");
	}
	public void callFriend() {
		System.out.println("Call Shreya");
	}
}

class square{
	int side;
	public int area(int side) {
		return side*side;
	}
	public int perimeter(int side) {
		return side*4;
	}
}

//problem 5
class Tommy{
	public void hit() {
		System.out.println("Hitting the enemy");
	}
	public void run() {
		System.out.println("runningthe enemy");
	}
	public void fire() {
		System.out.println("firing the enemy");
	}
}
public class cwh_39_javaclassPractice {
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//problem1
		employee1  jyoti = new employee1();
		//john.print_details();
		jyoti.setName("Shreya");
		jyoti.salary = 2024;
		
		System.out.println(jyoti.getName()+ " " + jyoti.getSalary());
		
		cellPhone jyoti1 = new cellPhone();
		jyoti1.ringing();
		jyoti1.vibrating();
		jyoti1.callFriend();
		
		square  sh  = new square();
		sh.side = 5;
		System.out.println("area of the square "+ sh.area(6));
		System.out.println("perimeter of the square "+ sh.perimeter(6));

		
		Tommy player1 = new Tommy();
		player1.hit();
		player1.run();
	    player1.fire();	
	}

}
