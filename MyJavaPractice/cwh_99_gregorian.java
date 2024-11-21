package MyJavaPractice;
import java.util.Calendar;
import java.util.GregorianCalendar;
public class cwh_99_gregorian {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar c = Calendar.getInstance();
		System.out.println(c.getTime());
		System.out.println(c.get(Calendar.DATE));
		System.out.println(c.get(Calendar.SECOND));
		System.out.println(c.get(Calendar.HOUR));
		System.out.println(c.get(Calendar.HOUR_OF_DAY));

		GregorianCalendar cal = new GregorianCalendar();
		System.out.println(cal.isLeapYear(2024));
		System.out.println(cal.isLeapYear(1000));

	}

}
