package MyJavaPractice;
import java.util.*;
public class Cwh_93_ArrayDeque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDeque<Integer> ad1 = new ArrayDeque();
		ad1.add(6);
		ad1.add(8);
		ad1.add(9);
		ad1.addFirst(100);
		System.out.println(ad1.getFirst());
		System.out.println(ad1.getLast());
	}

}
