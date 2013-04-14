package problems3;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TestStationImpl {

    private Station station;
    private static final String STATION1 = "Девяткино";
    private static final String STATION2 = "Невский проспект";

    @Before
    public void setUp() throws Exception {
        station = new StationImpl();
    }

    @Test
    public void testSetGetTitleCase1() throws Exception {
        station.setTitle(STATION1);
        assertEquals(STATION1, station.getTitle());
    }

    @Test
    public void testSetGetTitleCase2() throws Exception {
        station.setTitle(STATION2);
        assertEquals(STATION2, station.getTitle());
    }

    @Test
    public void testGetUndefinedTitle() {
        assertEquals(null, station.getTitle());
    }

    @Test(expected = Exception.class)
    public void testSetNullTitleShouldThrowException() throws Exception {
        station.setTitle(null);
    }
}
