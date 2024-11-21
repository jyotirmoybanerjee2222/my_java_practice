package MyJavaPractice;

public class Cwh_32_methodOverloading {
	static void foo() {
	  System.out.println("Good mo0rning");
	}
	static void foo(int a) {
		  System.out.println("Good mo0rning"+a);
		}
     static void change(int a) {
    	  a = 54; 
     }
     static void change(int [] arr) {
   	  arr[0]=98; 
    }
	 static void tellJokes() {
		System.out.println("Tell joke");
	}
	public static void main(String args[])
	{
		//tellJokes();
		int [] marks = {12,543,7,89,98,94};
		int x = 45;
		change(x);
		change(marks);
		System.out.println("The value of x after running change is "+x);
		System.out.println("The value of x after running change is "+marks[0]);
		foo();
		foo(3000);
	}

}
