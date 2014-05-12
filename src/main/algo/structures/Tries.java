package algo.structures;

public class Tries {
    Letter root;

    public Tries() {
        root = new Letter(' ');
    }

    public void save(String key, Object value) {
        Letter letter = root;
        for (int i = 0; i < key.length(); i++) {
            for (int j = 0; j < letter.subListCursor; j++) {
                if (letter.subList[j].key == key.charAt(i)) {
                    letter = letter.subList[j];
                    break;
                }
            }
            letter.subList[letter.subListCursor] = new Letter(key.charAt(i));
            letter.subListCursor++;
            letter = letter.subList[letter.subListCursor - 1];
        }
        letter.value = value;
    }

    public Object get(String key) {
        Letter letter = root;
        for (int i = 0; i < key.length(); i++) {
            for (int j = 0; j < letter.subListCursor; j++) {
                if (letter.subList[j].key == key.charAt(i)) {
                    letter = letter.subList[j];
                    break;
                }
            }
        }
        return letter.value;
    }

    private class Letter {
        public Letter(char key) {
            this.key = key;
            subListCursor = 0;
        }

        private int subListCursor;
        private final char key;
        private Object value;
        private final Letter[] subList = new Letter[256];
    }
}
