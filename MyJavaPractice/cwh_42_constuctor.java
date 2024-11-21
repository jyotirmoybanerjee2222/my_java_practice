package MyJavaPractice;
class myMainEmployee{
	private int id;
	private String Name="Shreya";

	public myMainEmployee() {
		id = 45;
		Name ="shreya";
	}
	public String getName1()
	{
        return Name;
	}
	public void setName(String n)
	{
		Name = n;
	}
	public int getId() {
		return id;
	}
	public void setId(int i)
	{
		id = i;
	}
}
public class cwh_42_constuctor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myMainEmployee jyoti = new myMainEmployee();
		System.out.println(jyoti.getId());
	}

}
