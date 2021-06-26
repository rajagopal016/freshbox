package Calendar;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Calendar;

public class Cal1 {

	public static void main(String[] args) {
		// //package Calendar;
	
				Date date = new Date();
				SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm");
				String strDate = formatter.format(date);
				System.out.println(strDate);
				System.out.println(date);
				
				
				Calendar calendar = new GregorianCalendar();
				int year = calendar.get(Calendar.YEAR);
				int month = calendar.get(Calendar.MONTH);
				int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
				int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
				int weekOfYear = calendar.get(Calendar.WEEK_OF_YEAR);
				int weekOfMonth = calendar.get(Calendar.WEEK_OF_MONTH);

				System.out.println("Year : " + year);
				System.out.println("Month : " + month);
				System.out.println("dayOfMonth : " + dayOfMonth);
				System.out.println("dayOfWeek : " + dayOfWeek);
				System.out.println("weekOfYeark : " + weekOfYear);
				System.out.println("weekOfMonth : " + weekOfMonth);
			}

		}


