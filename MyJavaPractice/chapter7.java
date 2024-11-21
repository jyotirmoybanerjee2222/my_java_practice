package MyJavaPractice;

public class chapter7 {
	
	// prob1
	static void multiplication(int n)
	{
		for(int i = 0;i<=1000;i++)
		{
			System.out.format("%d X %d = %d\n",n,i,n*i);
		}
	}
	//prob2
	static void pattern(int n) {
	 for(int i =1;i<=n;i++)
	 {
		 for(int j=0;j<i;j++)
		 {
			 System.out.print("*");
		 }
		 System.out.println(" ");
	 }
	}
	
	//recursive sum
	static int recursivesum(int n)
	{ if(n == 0)
		{
			return n;
		}
		return n + recursivesum(n-1);
	}
	
	//prob24
	static void pattern2(int n)
	{
		for(int i = n;i>0;i--)
		{
			for(int j = i;j> 0;j--)
			{
				System.out.print("*");
			}
			System.out.println(" ");

		}
	}
	//prob5
	static int fibo(int n) {
		if(n == 1)
        {
			return 0;
        }
		else if(n == 2 || n == 3)
		{
			return 1;
		}
		else {
			return fibo(n-1) +fibo(n-2);
		}
	}
	//prob8
	static void pattern1rec(int n)
	{   
		if(n>0) {
			pattern1rec(n-1);
			for(int i =0;i<n;i++)
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}
	static void pattern2rec(int n)
	{   
		if(n>0) {
			
			for(int i =0;i<n;i++)
			{
				System.out.print("*");
			}
			System.out.println(" ");
			pattern1rec(n-1);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		multiplication(100526);
		pattern(5);
		int c =recursivesum(5);
		System.out.println(c);
		pattern2(5);
		int result = fibo(7);
		System.out.println(result);
		pattern1rec(5);
		pattern2rec(5);
		}

}


