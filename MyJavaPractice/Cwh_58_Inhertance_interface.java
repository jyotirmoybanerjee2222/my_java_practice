package MyJavaPractice;
interface sampleInterface{
  void meth1();
  void meth2();
}
interface   childSampleInterface extends  sampleInterface{
	void meth3();
	void meth4();
}

class MySAmpleClass implements childSampleInterface{
	public void meth3() {
		System.out.println("meth3");
	};
	public void meth4() {
		System.out.println("meth4");
	};
	public void meth1()
	{
		System.out.println("meth1");
	};
	public void meth2()
	{
		System.out.println("meth2");
	};
};

public class Cwh_58_Inhertance_interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MySAmpleClass obj = new MySAmpleClass();
		obj.meth3();
		obj.meth1();
		obj.meth2();
		obj.meth4();
	}

}
