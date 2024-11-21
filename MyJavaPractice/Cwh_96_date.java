package MyJavaPractice;
import java.util.Date;
public class Cwh_96_date {

	public static void main(String[] args) {
		 //TODO Auto-generated method stub
		System.out.println(System.currentTimeMillis()/1000/3600/24/365);
		System.out.println(Long.MAX_VALUE);
		System.out.println(System.currentTimeMillis());

		Date d = new Date();
		System.out.println(d);
		System.out.println(d.getTime());
	}

}
