package algo.structures;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestTries {
    private final Tries tries = new Tries();
    private static final String KEY1 = "key";
    private static final String KEY2 = "complex";
    private static final String VALUE1 = "value1";
    private static final String VALUE2 = "value2";

    @Test
    public void testSaveAndRetrieve() {
        tries.save(KEY1, VALUE1);
        assertEquals(VALUE1, tries.get(KEY1));
    }

    @Test
    public void testComplexSaveAndRetrieve() {
        tries.save(KEY1, VALUE1);
        tries.save(KEY2, VALUE2);
        assertEquals(VALUE1, tries.get(KEY1));
        assertEquals(VALUE2, tries.get(KEY2));
    }
}
