package MyJavaPractice;

public class cwh_33_varArgs {
//	static int sum(int a,int b)
//	{
//		return a+b;
//	}
//	static int sum(int a,int b,int c)
//	{
//		return a+b+c;
//	}
	static int sum(int ...arr)
	{
		//available as int []arr
		int res=0;
		for(int a:arr)
		{
			res += a;
		}
		return res;
	}
   public static void main(String[] args) {
	System.out.println("welcome to variable tutorial");
	System.out.println("the sum of 4 and 5 is " + sum(4,5)); 
	System.out.println("the sum of 4 and 5,&5 is " + sum(4,5,5)); 

   }
   
}
