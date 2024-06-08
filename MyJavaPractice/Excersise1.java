package MyJavaPractice;
import java.util.Scanner;

public class Excersise1 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Physics mark: ");
		int physics = sc.nextInt();
		System.out.println("Enter your English marks");
		int English = sc.nextInt();
		System.out.println("Enter your chemistry  marks");
		int Chemistry = sc.nextInt();
		System.out.println("Enter your Mathematics marks");
		int Mathmatics = sc.nextInt();
		System.out.println("Enter your Computer Science marks");
		int ComputerScience = sc.nextInt();
		
		float percentage = ((physics+English+Chemistry+Mathmatics+ComputerScience)/500.0f)*100;
		System.out.println("percentage : ");
		System.out.println(percentage);
	}
}
