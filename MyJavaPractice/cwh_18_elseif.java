package MyJavaPractice;
import java.util.Scanner;
public class cwh_18_elseif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int age = 56;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Age");
        age = sc.nextInt();
        
        switch (age) {
        case 18:
        	System.out.println("You are 18");
        	break;
        case 21:
        	System.out.println("You are 21");
        	break;
        case 60:
        	System.out.println("You are 60");
        default:
        	System.out.println("Enjoy your life");
        	
  //enhanced switch
        	
        }
        
//        if(age>56) {
//        	System.out.println("Experienced");
//        }
//        else if(age>46)
//        {
//        	System.out.println("You are semi exprienced");
//        }
//        else
//        {
//        	System.out.println("You are not exprienced");
//        }
        
        
	}

}
