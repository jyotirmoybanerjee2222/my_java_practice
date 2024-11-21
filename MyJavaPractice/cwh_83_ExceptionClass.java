package MyJavaPractice;

import java.util.Scanner;

class MyException extends Exception {
	public String toString() {
		return super.toString()+"I am to STring";
		
	}
	public String getMessage()
	{
		return super.getMessage()+"I am getMessage()";
	}
}
class MaxAgeException extends Exception {
	public String toString() {
		return "age can not b egratere";
		
	}
	public String getMessage()
	{
		return "Enter write age";
	}
}
public class cwh_83_ExceptionClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a ;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		if (a<90)
		{
			try {
				throw new MyException();
				//throw new ArithmeticException("this is a exceptiom");
			}catch(Exception e){
				System.out.println(e.getMessage());
				System.out.println(e.toString());
				e.printStackTrace();
			}
			System.out.println("yes finished");
		}
	}

}
