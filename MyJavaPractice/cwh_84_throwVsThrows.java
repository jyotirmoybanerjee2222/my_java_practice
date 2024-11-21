package MyJavaPractice;

class NegativeRadiusException extends Exception {
	public String toString() {
		return "Radius cannot be negative";
		
	}
	public String getMessage()
	{
		return "Radius cannot be negative\";";
	}
}

public class cwh_84_throwVsThrows {
	public static double area(int r) throws NegativeRadiusException
	{
		if(r<0)
		{
			throw new NegativeRadiusException();
		}
		return  Math.PI*r*r;
		//return res;
	}
	
	public static int divide(int a,int b) throws ArithmeticException
	{
		int res = a/b;
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		try {
//			int c = divide(65,0);
//			System.out.println(c);			
//		}catch(Exception e)
//		{
//			System.out.println(e);
//		}
////		int c = divide(65,0);
////		System.out.println(c);
    
		try {
			double ar = area(-1);
			System.out.println(ar);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
