package internationalization;

import static org.junit.Assert.assertEquals;

import java.util.Locale;

import org.junit.Before;
import org.junit.Test;

public class TestHelloMessage {

    private HelloMessage helloMessage;
    private String currentLanguage;
    private String currentCountry;
    private Locale actualLocale;

    @Before
    public void setUp() throws Exception {
        helloMessage = new HelloMessage();
    }

    @Test
    public void testGetGermanLocale() {
        givenGermanLocaleArguments();
        whenGetLocaleCalled();
        thenGermanLocaleReceived();
    }

    @Test
    public void testGetUnknownLocale() {
        givenUnknownLocaleArguments();
        whenGetLocaleCalled();
        thenDefaultLocaleReceived();
    }

    private void givenGermanLocaleArguments() {
        currentLanguage = "de";
        currentCountry = "DE";
    }

    private void givenUnknownLocaleArguments() {
        currentLanguage = null;
        currentCountry = null;
    }

    private void whenGetLocaleCalled() {
        actualLocale = helloMessage.getLocale(currentLanguage, currentCountry);
    }

    private void thenGermanLocaleReceived() {
        Locale expectedLocale = new Locale("de", "DE");
        assertEquals(expectedLocale, actualLocale);
    }

    private void thenDefaultLocaleReceived() {
        Locale defaultLocale = new Locale("en", "US");
        assertEquals(defaultLocale, actualLocale);
    }

}
