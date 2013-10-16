package internationalization;

import java.util.Locale;
import java.util.ResourceBundle;

public class HelloMessage {
	
	private static final String DEFAULT_LANGUAGE = "en";
	private static final String DEFAULT_COUNTRY = "US";
	
	ResourceBundle messages;

    public String sayHello(Locale locale) {
        messages = ResourceBundle.getBundle("HelloBundle", locale);
        return messages.getString("hello");
    }

    public Locale getLocale(String language, String country) {
        if (language == null || country == null) {
            return new Locale(DEFAULT_LANGUAGE, DEFAULT_COUNTRY);
        }
        return new Locale(language, country);
    }
}
