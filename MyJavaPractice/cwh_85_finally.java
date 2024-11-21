package MyJavaPractice;

public class cwh_85_finally {

	public static int greet(){
		try {
			   int a  = 5;
			   int b = 0;
			   //System.out.println(a/b);
			   return a/b;
			}catch(Exception e)
			{
				System.out.println(e);
				return -1;
			}finally {
			   System.out.println("This the end of the program");
			}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c = greet();
		System.out.println(c);
		int a = 5;
		int b = 9;
		while(true)
		{
			try {
				System.out.println(a/b);
			}catch(Exception e)
			{
				System.out.println(e);
			
				break;
			}
			finally{
				System.out.println("finally");
			}
			b--;
		}
	}

}
