package MyJavaPractice;

import java.util.Scanner;

public class Cwh_82_NestedtryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("Welcome To vido 82");
			int [] marks = new int[3];
			marks[0]= 5;
			marks[1]= 6;
			marks[2]=56;
			Scanner sc = new Scanner(System.in);
			boolean flag = true;

			int ind = sc.nextInt();
			
			try {
				System.out.println(marks[ind]);
			}catch(ArrayIndexOutOfBoundsException e){
				System.out.println("This Index does not exit");
				
			}
		}catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("Thanks for usin gthis program");
	}

}
