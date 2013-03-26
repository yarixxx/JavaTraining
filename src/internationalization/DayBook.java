package internationalization;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class DayBook {

    private Calendar startDay;

    public void setStartDay(Calendar startDay) {
        this.startDay = startDay;
    }

    public Calendar getStartDay() {
        return startDay;
    }

    public String getStartDay(Locale locale) {
        SimpleDateFormat formatter = new SimpleDateFormat("dd MMM yy", locale);
        return formatter.format(startDay.getTime());
    }

}
