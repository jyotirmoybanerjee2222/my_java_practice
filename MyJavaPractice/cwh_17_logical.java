package MyJavaPractice;

public class cwh_17_logical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Logical ANd");
		boolean a = true;
		boolean b = false;
		if (a && b)
		{
			System.out.println("Y");			
		}
		else {
			System.out.println("N");			
		}
		
		System.out.println("Logical Or");

		if (a || b)
		{
			System.out.println("Y");			
		}
		else {
			System.out.println("N");			
		}
		
		
		System.out.println("Logical Not");
        System.out.println("Not A is");
        System.out.println(!a);
        
        System.out.println("Not B is");
        System.out.println(!b);

	}

}
