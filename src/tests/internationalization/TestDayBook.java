package internationalization;

import static org.junit.Assert.assertEquals;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

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

    @Test
    public void testSetAndGetAnotherStartDay() {
        givenAnotherStartDay();
        whenSetStartDay();
        thenGetStartDayIsTheSame();
    }

    @Test
    public void testSetAndGetStartDayLocalized() {
        givenStartDay();
        whenSetStartDay();
        thenGetStartDayLocalized();
    }

    @Test
    public void testSetAndGetAnotherStartDayLocalized() {
        givenAnotherStartDay();
        whenSetStartDay();
        thenGetStartDayLocalizedInFrench();
    }

    private void givenStartDay() {
        startDay = new GregorianCalendar();
        startDay.set(Calendar.YEAR, 2012);
        startDay.set(Calendar.MONTH, 2);
        startDay.set(Calendar.DAY_OF_MONTH, 24);
    }

    private void givenAnotherStartDay() {
        startDay = new GregorianCalendar();
        startDay.set(Calendar.YEAR, 2011);
        startDay.set(Calendar.MONTH, 3);
        startDay.set(Calendar.DAY_OF_MONTH, 21);
    }

    private void whenSetStartDay() {
        dayBook.setStartDay(startDay);
    }

    private void thenGetStartDayIsTheSame() {
        assertEquals(startDay, dayBook.getStartDay());
    }

    private void thenGetStartDayLocalized() {
        Locale locale = new Locale("en", "US");
        assertEquals("24 Mar 12", dayBook.getStartDay(locale));
    }

    private void thenGetStartDayLocalizedInFrench() {
        Locale locale = new Locale("fr", "FR");
        assertEquals("21 avr. 11", dayBook.getStartDay(locale));
    }
}
