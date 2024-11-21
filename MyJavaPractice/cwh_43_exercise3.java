package MyJavaPractice;
class cylinder{
	private int height;
	private int radius;
	public cylinder(int radius,int height) {
		this.radius = radius;
		this.height = height;
	}
	public int getH()
	{
        return height;
	}
	public void setH(int h)
	{
		height = h;
	}
	public int getR() {
		return radius;    
	}
	public void setR(int r)
	{
		radius = r;
	}
	public double surfaceArea() {
		return 2* 3.142 * radius* radius + 2*3.142 * radius*height;
	}
	public double volume() {
		return Math.PI * radius* radius * height;
	}
}


class   rectangle{
	private int length;
	private int breadth;
	public rectangle() {
		this.length = 4;
		this.breadth = 5;
	}
	  public rectangle(int length, int breadth) {
	        this.length = length;
	        this.breadth = breadth;
	  }
	  public int getL(){
		  return length;
		  
	  }
	  public int getB(){
		  return breadth;
		  
	  }
}
public class cwh_43_exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       cylinder  myCylinder = new cylinder(12,9);
//       myCylinder.setH(12);
//       int h = myCylinder.getH();
//
//       myCylinder.setR(9);
//       int r = myCylinder.getR();

//       System.out.println(h);
//       System.out.println(r);
       System.out.println(myCylinder.surfaceArea());
       System.out.println(myCylinder.volume());

       
       rectangle myRectangle = new rectangle();
       System.out.println(myRectangle.getL());
       System.out.println(myRectangle.getB());
	}

}
