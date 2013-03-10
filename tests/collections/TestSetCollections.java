package collections;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TestSetCollections {

    SetCollection itemsSet;
    String sentence;
    private Integer sumValues;
    private static final String[] WORDS = { "dog", "cat", "mouse" };
    private static final String EXPECTED_SENTENCE = "dogcatmouse";

    @Before
    public void setUp() throws Exception {
        itemsSet = new SetCollection();
    }

    @Test
    public void testMergeWordSet() {
        givenWordSet();
        whenMergeWordsCalled();
        thenSentenceIsValid();
    }

    @Test
    public void testShouldCountSum() {
        givenValues();
        whenSumValuesCalled();
        thenSumIsValid();
    }

    private void thenSumIsValid() {
        Integer expected = 23;
        assertEquals(expected, sumValues);
    }

    private void whenSumValuesCalled() {
        sumValues = itemsSet.sumValues();
    }

    private void givenValues() {
        itemsSet.addValue(5);
        itemsSet.addValue(15);
        itemsSet.addValue(3);
    }

    private void givenWordSet() {
        itemsSet.addWord(WORDS[0]);
        itemsSet.addWord(WORDS[1]);
        itemsSet.addWord(WORDS[2]);
    }

    private void whenMergeWordsCalled() {
        sentence = itemsSet.mergeWords();
    }

    private void thenSentenceIsValid() {
        assertEquals(EXPECTED_SENTENCE, sentence);
    }
}
