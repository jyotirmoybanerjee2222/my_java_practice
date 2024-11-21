package MyJavaPractice;

 class Employee{ // ebery java file has a java class
	int id;      //by default it is default
	String Name;
	int salary;
	
	public void printDetails() {
		System.out.println("My id is "+id);
		System.out.println("My name is "+Name);
	}
	
	public int getSalary() {
		return salary;
	}
}
public class cwh_38_javaClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Employee harry = new Employee();//initiating a new employee object
		harry.id = 12;//setting property / attribute
		harry.Name = "Jyotirmoy";
		harry.salary = 34;
		//printing Attributes
        System.out.println(harry.id);
        System.out.println(harry.Name);
        harry.printDetails();
        
        Employee john = new Employee();
        john.id = 12;
        john.Name = "Shreya";
        john.salary = 34;
        john.printDetails();
        
        int salary = john.getSalary();
        System.out.println(salary);
	}

}
