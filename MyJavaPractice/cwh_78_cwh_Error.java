package MyJavaPractice;

import java.util.Scanner;

public class cwh_78_cwh_Error {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k;
		Scanner sc = new Scanner(System.in);
		k = sc.nextInt();
		try {
			System.out.println("Inter 1000 divided by k"+ 1000/k);
		}catch(Exception e){
			System.out.println(e);
		}
		
		int [] marks = new int[3];
		marks[0]= 5;
		marks[1]= 6;
		marks[2]=56;
		System.out.println("Enter th earray index");
		int ind = sc.nextInt();
		int number = sc.nextInt();
		try {
			System.out.println(marks[ind]);
			System.out.println(marks[ind]/number);
		}catch(ArithmeticException e){
			System.out.println("Arithmetic Exception");
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("ArrayIndexOutOfBoundsException");
		}catch(Exception e){
			System.out.println(e);
		}
	}

}
