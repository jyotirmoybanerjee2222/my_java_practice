package MyJavaPractice;

public class cwh_34_recursion {
	static int fact(int n)
	{
		if(n==1) {
			return 1;
		}
		return n*fact(n-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int x= fact(5);
       System.out.println("factorial is"+ x);  
	}

}
