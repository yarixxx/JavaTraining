package collections;

import java.util.HashSet;
import java.util.Set;

public class SetCollection {
    private final Set<String> words;
    private final Set<Integer> values;

    SetCollection() {
        words = new HashSet<String>();
        values = new HashSet<Integer>();
    }

    public void addWord(String word) {
        words.add(word);
    }

    public void addValue(Integer value) {
        values.add(value);
    }

    public Integer sumValues() {
        Integer result = 0;
        for (Integer val : values) {
            result += val;
        }
        return result;
    }

    public String mergeWords() {
        StringBuffer result = new StringBuffer();
        for (String word : words) {
            result.insert(0, word);
        }
        return result.toString();
    }
}
