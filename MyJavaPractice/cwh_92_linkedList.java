package MyJavaPractice;

import java.util.*;

public class cwh_92_linkedList {
	public static void main(String[] args)
	{
	LinkedList <Integer> l1 = new 	LinkedList<>();
	LinkedList <Integer> l2 = new 	LinkedList<>();

	l1.add(16);
	l1.add(115);
	l1.add(0,15);
	
	l2.add(5);
	l2.add(6);
	l2.add(6);
	l2.add(0,7);
	l1.addAll(l2);
	l1.addLast(60);
	
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
