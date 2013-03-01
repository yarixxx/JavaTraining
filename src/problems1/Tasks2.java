package problems1;

public class Tasks2 {

    public String sayHello(String name) {
        return "Hello ".concat(name).concat("!");
    }

    public String extraEnd(String str) {
        if (str.length() < 2) {
            return str.concat(str).concat(str);
        }
        final String end = str.substring(str.length() - 2, str.length());
        return end.concat(end).concat(end);
    }

    public String firstTwo(String str) {
        if (str.length() < 2) {
            return str;
        }
        return str.substring(0, 2);
    }

    public String wrapToTag(String tagName, String value) {
        return String.format("<%s>%s</%s>", tagName, value, tagName);
    }

    public String stringTimes(String string, int i) {
        if (i > 0) {
            return stringTimes(string, --i).concat(string);
        }
        return "";
    }

    public String[] splitByWords(String text) {
        return text.split(" ");
    }

    public String removeSpaces(String word) {
        return word.trim();
    }

    public boolean isThereASecret(String text) {
        return text.contains("secret");
    }

    public String computeInitials(String name) {
        String[] parts = name.split(" ");
        StringBuilder initials = new StringBuilder();
        for (String part : parts) {
            final Character firstChar = part.charAt(0);
            if (Character.isUpperCase(firstChar)) {
                initials.append(firstChar).append(".");
            }
        }
        return initials.toString();
    }
}
