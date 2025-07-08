package ADVANCEJAVA;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class CalenderIn_Java {
    public static void main(String[] args){
        // calendar class is a abstract class
//        Calendar c = Calendar.getInstance(TimeZone.getTimeZone("Asia/Singapore"));
        Calendar c=Calendar.getInstance();
//        System.out.println(c.getCalendarType());
//        System.out.println(c.getTimeZone().getID());
        System.out.println(c.get(Calendar.DATE));
        System.out.println(c.get(Calendar.HOUR));
        System.out.println(c.get(Calendar.HOUR_OF_DAY)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND));
        // Gregorian calendar class is a concarete class
        GregorianCalendar g1=new GregorianCalendar();
        System.out.println(g1.isLeapYear(2028));
        System.out.println(g1.getTimeZone());
    }

}
