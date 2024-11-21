package MyJavaPractice;
class MyEmployee{
	private int id;
	private String Name="Shreya";

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
public class cwh_40_acessModifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyEmployee jyoti = new MyEmployee();
		//harry.id = 45;
		jyoti.setId(5);
		System.out.println(jyoti.getId());
		//jyoti.setName("Jyotirmoy");
		System.out.println(jyoti.getName1());}

}
