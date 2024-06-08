package MyJavaPractice;

public class operator {

	public static void main(String args[])
	{
		System.out.println(2&3);
		int a = 6*5-34/2;
		System.out.println(a);
		// Precedence & Associativity

        int a1 = 6*5-34/2;
        /*
        Highest precedence goes to * and /. They are then evaluated on the basis
        of left to right associativity
            =30-34/2
            =30-17
            =13
         */
        int b1 = 60/5-34*2;
        /*
            = 12-34*2
            =12-68
            =-56
         */

        System.out.println(a1);
        System.out.println(b1);
        int x = 6;
        int y = 1;
        int k = x*y/2;
        System.out.println(k);
        int b=1;
        int c =4;
        int a2 = 5;
        int k1 = b*b - 4*a2*c/2*a2;//3
        int k2 = b*b - 4*(a2*c)/(2*a2);//-7
        System.out.println(k1);
        System.out.println(k2);
	}
}
