package problems1;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class TestTasks5 {

    private Tasks5 tasks5;

    @Before
    public void setUp() throws Exception {
        tasks5 = new Tasks5();
    }

    @Test
    public void testIsSquareFree4() {
        assertFalse(tasks5.isSquareFree(4));
        assertTrue(tasks5.isSquareFree(6));
        assertTrue(tasks5.isSquareFree(7));
        assertTrue(tasks5.isSquareFree(8));
        assertFalse(tasks5.isSquareFree(9));
        assertTrue(tasks5.isSquareFree(10));
        assertFalse(tasks5.isSquareFree(16));
        assertFalse(tasks5.isSquareFree(25));
        assertTrue(tasks5.isSquareFree(30));
    }

}
