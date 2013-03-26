package internationalization;

import static org.junit.Assert.assertEquals;

import java.util.Calendar;
import java.util.GregorianCalendar;

import org.junit.Before;
import org.junit.Test;

public class TestDayBook {

    private DayBook dayBook;
    private Calendar startDay;

    @Before
    public void setUp() throws Exception {
        dayBook = new DayBook();
    }

    @Test
    public void testSetAndGetStartDay() {
        givenStartDay();
        whenSetStartDay();
        thenGetStartDayIsTheSame();
    }

    private void givenStartDay() {
        startDay = new GregorianCalendar();
        startDay.set(Calendar.YEAR, 2012);
        startDay.set(Calendar.MONTH, 2);
        startDay.set(Calendar.DAY_OF_MONTH, 24);
    }

    private void whenSetStartDay() {
        dayBook.setStartDay(startDay);
    }

    private void thenGetStartDayIsTheSame() {
        assertEquals(startDay, dayBook.getStartDay());
    }
}
