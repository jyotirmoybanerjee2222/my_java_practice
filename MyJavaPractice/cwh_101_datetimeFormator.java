package MyJavaPractice;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class cwh_101_datetimeFormator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDateTime dt = LocalDateTime.now();
		//LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt);
		
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		String myDate = dt.format(df);
		System.out.println(myDate);
		
	}

}
