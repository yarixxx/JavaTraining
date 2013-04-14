package problems3;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TestLineImpl {

    private Line line;

    private final static String LINE1_TITLE = "Линия 1";

    @Before
    public void setUp() throws Exception {
        line = new LineImpl();
    }

    @Test
    public void testSetLineTitle() throws Exception {
        line.setTitle(LINE1_TITLE);
        assertEquals(LINE1_TITLE, line.getTitle());
    }

    @Test(expected = Exception.class)
    public void testSetWrongLineTitle() throws Exception {
        line.setTitle(null);
    }
}
