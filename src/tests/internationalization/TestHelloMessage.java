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
    private Object helloString;

    private final static String FR_HELLO = "Bonjour";
    private final static String EN_HELLO = "Hello";
    private final static String DE_HELLO = "Hallo";

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
    public void testGetFrenchLocale() {
        givenFrenchLocaleArguments();
        whenGetLocaleCalled();
        thenFrenchLocaleReceived();
    }

    @Test
    public void testGetUnknownLocale() {
        givenUnknownLocaleArguments();
        whenGetLocaleCalled();
        thenDefaultLocaleReceived();
    }
    
    @Test
    public void testSayHelloInFrench() {
        givenFrenchLocaleArguments();
        whenSayHelloCalled();
        thenHelloInLocaleReceived(FR_HELLO);
    }
    
    @Test
    public void testSayHelloInDefault() {
        givenUnknownLocaleArguments();
        whenSayHelloCalled();
        thenHelloInLocaleReceived(EN_HELLO);
    }
    
    @Test
    public void testSayHelloInGerman() {
        givenGermanLocaleArguments();
        whenSayHelloCalled();
        thenHelloInLocaleReceived(DE_HELLO);
    }

    private void thenHelloInLocaleReceived(String expected) {
        assertEquals(expected, helloString);
    }

	private void givenGermanLocaleArguments() {
        currentLanguage = "de";
        currentCountry = "DE";
    }

    private void givenFrenchLocaleArguments() {
        currentLanguage = "fr";
        currentCountry = "CA";
    }

    private void givenUnknownLocaleArguments() {
        currentLanguage = null;
        currentCountry = null;
    }

    private void whenSayHelloCalled() {
        Locale locale = helloMessage.getLocale(currentLanguage, currentCountry);
        helloString = helloMessage.sayHello(locale);
    }

    private void whenGetLocaleCalled() {
        actualLocale = helloMessage.getLocale(currentLanguage, currentCountry);
    }

    private void thenGermanLocaleReceived() {
        Locale expectedLocale = new Locale("de", "DE");
        assertEquals(expectedLocale, actualLocale);
    }
    
    private void thenFrenchLocaleReceived() {
        Locale expectedLocale = new Locale("fr", "CA");
        assertEquals(expectedLocale, actualLocale);
    }

    private void thenDefaultLocaleReceived() {
        Locale defaultLocale = new Locale("en", "US");
        assertEquals(defaultLocale, actualLocale);
    }

}
