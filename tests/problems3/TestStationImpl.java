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
    public void testSetGetTitleCase1() {
        station.setTitle(STATION1);
        assertEquals(STATION1, station.getTitle());
    }

    @Test
    public void testSetGetTitleCase2() {
        station.setTitle(STATION2);
        assertEquals(STATION2, station.getTitle());
    }

    @Test
    public void testGetUndefinedTitle() {
        assertEquals(null, station.getTitle());
    }
}
