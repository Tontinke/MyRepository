import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MyClass{
	
	/***
	 * This is the main function.
	 * @param args
	 */
	public static void main(String[] args){
		System.out.println("Hello world!");		
		System.out.println("Udv mindenki!");
		
		System.out.println("The current time is: "+ getCurrentTime());
		System.out.println("A jelenlegi id�: "+ getCurrentTime());
	}

	public static String getCurrentTime() {
		Calendar cal = Calendar.getInstance();
		cal.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		return sdf.format(cal.getTime());		
	}
}
