package internationalization;

import java.util.Locale;

public class HelloMessage {
    public String sayHello(Locale locale) {
        return null;
    }

    public Locale getLocale(String language, String country) {
        if (language == null || country == null) {
            return new Locale("en", "US");
        }
        return new Locale(language, country);
    }
}
