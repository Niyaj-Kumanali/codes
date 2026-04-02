package HackerRank;

import java.util.Calendar;
import java.util.Date;

public class DateAndTime {
    public static void main(String[] args) {
        findDay(7, 31,2023);
    }

    public static String findDay(int month, int day, int year) {
        Calendar cal = Calendar.getInstance();
        cal.clear();
        cal.set(year, month-1, day);

        switch (cal.get(Calendar.DAY_OF_WEEK)){
            case 1: return "SUNDAY";
            case 2: return "MONDAY";
            case 3: return "TUESDAY";
            case 4: return "WEDNESDAY";
            case 5: return "THURSDAY";
            case 6: return "FRIDAY";
            case 7: return "SATURDAY";
        }
        return "";
    }
}
