package collections;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;

import static junit.framework.Assert.assertEquals;

public class TestWordsStatistics {

    private WordsStatistics wordsStatistics = new WordsStatistics();
    private String text = "Lorem ipsum dolor sit amet, hendrerit consectetuer nunc ut";
    private String text2 = "Luctus in imperdiet in taciti numquam sem";
    private String[] words = {"Lorem", "ipsum", "dolor", "sit", "amet,", "hendrerit", "consectetuer", "nunc", "ut"};
    private String[] words2 = {"Luctus", "in", "imperdiet", "taciti", "numquam", "sem"};

    @Test
    public void testWordsStatistics() {
        wordsStatistics.parseText(text);
        assertEquals(new HashSet<String>(Arrays.asList(words)), wordsStatistics.getKnownWords());
    }

    @Test
    public void test2WordsStatistics() {
        wordsStatistics.parseText(text2);
        assertEquals(new HashSet<String>(Arrays.asList(words2)), wordsStatistics.getKnownWords());
    }

    @Test
    public void testInWordStatistics() {
        wordsStatistics.parseText(text2);
        Integer expectedValue = 2;
        assertEquals(expectedValue, wordsStatistics.getValue("in"));
    }

}
