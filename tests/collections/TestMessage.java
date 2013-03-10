package collections;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class TestMessage {
    private Message message;
    private boolean isForRecipient;

    private static final String RECIPIENT_ONE = "recipient1";
    private static final String TEXT_FOR_RECIPIENT_ONE = "Hi! How are you?";
    private static final String RECIPIENT_TWO = "recipient2";
    private static final String TEXT_FOR_RECIPIENT_TWO = "Hi recipient2!";

    @Before
    public void setUp() throws Exception {
        message = new Message();
    }

    private void givenMessageForRecipientOne() {
        message.setRecipient(RECIPIENT_ONE);
        message.setText(TEXT_FOR_RECIPIENT_ONE);
    }

    private void givenMessageForRecipientTwo() {
        message.setRecipient(RECIPIENT_TWO);
        message.setText(TEXT_FOR_RECIPIENT_TWO);
    }

    private void whenCheckDestination(String recipient) {
        isForRecipient = message.isForRecipient(recipient);
    }

    private void thenItIsForRecipient() {
        assertTrue(isForRecipient);
    }

    private void thenItIsNotForRecipient() {
        assertFalse(isForRecipient);
    }

    private void thenMessageForRecipientOne() {
        assertEquals(TEXT_FOR_RECIPIENT_ONE, message.getText(RECIPIENT_ONE));
    }

    private void thenMessageForRecipientTwo() {
        assertEquals(TEXT_FOR_RECIPIENT_TWO, message.getText(RECIPIENT_TWO));
    }

    private void thenMessageForRecipientOneIsNull() {
        assertNull(message.getText(RECIPIENT_ONE));
    }

    @Test
    public void testMessageForRecipientOne() {
        givenMessageForRecipientOne();
        whenCheckDestination(RECIPIENT_ONE);
        thenItIsForRecipient();
        thenMessageForRecipientOne();
    }

    @Test
    public void testMessageForRecipientTwo() {
        givenMessageForRecipientTwo();
        whenCheckDestination(RECIPIENT_TWO);
        thenItIsForRecipient();
        thenMessageForRecipientTwo();
    }

    @Test
    public void testMessageForRecipientTwoCheckedByRecipientOne() {
        givenMessageForRecipientTwo();
        whenCheckDestination(RECIPIENT_ONE);
        thenItIsNotForRecipient();
        thenMessageForRecipientOneIsNull();
    }
}
