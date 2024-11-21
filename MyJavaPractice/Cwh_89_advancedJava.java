package MyJavaPractice;
import java.util.ArrayList;
import java.util.Collection;

public class Cwh_89_advancedJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Integer> l1 = new ArrayList<>();
		ArrayList <Integer> l2 = new ArrayList<>();

		l1.add(0,16);
		l1.add(115);
		l1.add(0,15);
		
		l2.add(5);
		l2.add(6);
		l2.add(6);
		l2.add(0,7);
		l1.addAll(l2);
		
		
		//l1.clear();
		l1.set(1,5660);
		for(int i = 0;i<l1.size();i++)
		{
			System.out.print(l1.get(i));
			System.out.print(" ");
		}
		System.out.println(l1.contains(127));
		System.out.println(l1.indexOf(7));

	}

}
