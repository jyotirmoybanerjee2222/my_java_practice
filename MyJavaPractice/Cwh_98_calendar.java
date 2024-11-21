package MyJavaPractice;
import java.util.Calendar;
import java.util.TimeZone;
public class Cwh_98_calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Calendar  c = Calendar.getInstance();
		Calendar  c = Calendar.getInstance(TimeZone.getTimeZone("Asia/Singapore"));

		System.out.println(c.getCalendarType());
		System.out.println(c.getTimeZone());
		System.out.println(c.getTimeZone().getID());
	}

}
