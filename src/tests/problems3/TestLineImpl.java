package problems3;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class TestLineImpl {

    private static final String STATION1_TITLE = "Лесная";

    private Line line;

    private Station station;

    private boolean resultFlag;

    private final static String LINE1_TITLE = "Линия 1";

    @Before
    public void setUp() throws Exception {
        line = new LineImpl();
    }

    @Test
    public void testSetLineTitle() throws Exception {
        givenInitializedLine();
        assertEquals(LINE1_TITLE, line.getTitle());
    }

    @Test
    public void testGetLineTitle() throws Exception {
        assertNull(line.getTitle());
    }

    @Test(expected = Exception.class)
    public void testSetWrongLineTitle() throws Exception {
        line.setTitle(null);
    }

    @Test
    @Ignore
    public void testAddStationToLine() throws Exception {
        givenInitializedLine();
        givenValidStation();
        whenAddStation();
        thenFlagIsTrue();
        thenLineHasOneStation();
    }

    @Test
    public void testAddStationToUninitializedLine() throws Exception {
        givenValidStation();
        whenAddStation();
        thenFlagIsFalse();
        thenLineHasNoStations();
    }

    private void givenInitializedLine() throws Exception {
        line.setTitle(LINE1_TITLE);
    }

    private void givenValidStation() throws Exception {
        station = new StationImpl();
        station.setTitle(STATION1_TITLE);
    }

    private void whenAddStation() {
        resultFlag = line.addStation(station);
    }

    private void thenFlagIsTrue() {
        assertTrue(resultFlag);
    }

    private void thenLineHasOneStation() {
        assertEquals(1, line.size());
    }

    private void thenLineHasNoStations() {
        assertEquals(0, line.size());
    }

    private void thenFlagIsFalse() {
        assertFalse(resultFlag);
    }

}
