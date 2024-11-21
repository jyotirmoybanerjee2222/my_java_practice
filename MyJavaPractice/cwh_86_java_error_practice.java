package MyJavaPractice;
import java.util.Scanner;

public class cwh_86_java_error_practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a = 669/0;
			
		}catch(IllegalArgumentException e)
		{
			System.out.println("hehe");
		}catch(ArithmeticException e)
		{
			System.out.println("haha");
		}
		//problem 4
		boolean flag = true;
		int [] marks = new int[3];
		marks[0]= 5;
		marks[1]= 6;
		marks[2]=56;
		//marks[3] = 98;
		Scanner sc = new Scanner(System.in);
		//int index;
		int i = 0;
		while(flag && i<5)
		{
			try {
				//index = sc.nextInt();
				System.out.println("The value of mark[index]"+marks[i]);
				i++;				
			}catch(Exception e)
			{
				System.out.println(e);
				i++;
			}

		}
		
	}

}
