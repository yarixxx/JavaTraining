package collections;

import java.util.*;

public class WordsStatistics {
    private Map<String, Integer> dictionary = new HashMap<String, Integer>();
    public void parseText(String text) {
        List<String> words = Arrays.asList(text.split(" "));
        Iterator<String> it = words.iterator();
        while(it.hasNext()) {
            String word = it.next();
            Integer value = dictionary.get(word);
            value = value == null ? 0 : value;
            dictionary.put(word, value + 1);
        }
    }

    public Integer getValue(String word) {
        return dictionary.get(word);
    }

    public Set<String> getKnownWords() {
        return dictionary.keySet();
    }
}
