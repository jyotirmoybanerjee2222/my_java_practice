package MyJavaPractice;
import java.util.Scanner;

public class Cwh_31_method {

	
	 int logic1(int a,int b)
	{
		int c;
		if(a>b)
		{
			c=a+b;
		}
		else
		{
			c = (a+b)*5;
		}
		return c;
	}
	static int logic(int a,int b)
	{
		int c;
		if(a>b)
		{
			c=a+b;
		}
		else
		{
			c = (a+b)*5;
		}
		return c;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the valeuw of a");
		a = sc.nextInt();
		System.out.println("Enter the valeuw of b");
		b = sc.nextInt();
		
        int x = logic(a,b);		
        System.out.println("The value of x"+x);
        
        Cwh_31_method  obj = new Cwh_31_method();
        x =  obj.logic(a,b);
        System.out.println("The value of x"+x);

        sc.close();
	}

}
