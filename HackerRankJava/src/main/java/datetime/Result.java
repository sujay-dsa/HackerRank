package datetime;

import java.util.Calendar;
import java.util.Locale;

public class Result {
    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {
    	Calendar cal = Calendar.getInstance();
    	cal.set(year, month -1, day);
    	String name = cal.getDisplayName(Calendar.DAY_OF_WEEK,Calendar.LONG_FORMAT,Locale.ENGLISH).toUpperCase();
    	return name;
    }
}
