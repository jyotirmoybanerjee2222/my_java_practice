package MyJavaPractice;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
public class cwh_102_AdvancedJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList ar = new ArrayList();
		ar.add("Student1");
		for(Object o:ar)
		{
			System.out.println(o);
		}
		
		HashSet<Integer> s = new HashSet();
		s.add(6);
		s.add(9);
		s.add(6);
		System.out.println(s);
		
		//q2
		Date d = new Date();
		System.out.println(d.getHours()+":"+d.getMinutes()+":"+d.getSeconds());
		//q3
		Calendar c = Calendar.getInstance();
		System.out.println(c.get(Calendar.HOUR)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND));
		System.out.println(c.get(Calendar.HOUR_OF_DAY)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND));

		//q4
		
	}

}
