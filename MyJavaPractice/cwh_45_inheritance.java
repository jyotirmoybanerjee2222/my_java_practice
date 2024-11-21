package MyJavaPractice;

class Base{
	int x;
    public void	setX(int X) { this.x = X;}
    public int getX() {
    	return x;
    }
	public void printMe() {
		System.out.println("I am constructor");
	}
}

class Derived extends Base{
	int y;
    public void	setY(int Y) { this.y = Y;}
    public int getY() {
    	return y;
    }

}
public class cwh_45_inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // Base b = new Base();
		Derived b = new Derived();
         b.setX(4);
         System.out.println(b.getX());
	}

}
