package collections;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class TestCollections1 {

    private Collections1 collections1;
    private static final String RECIPIENT_ONE = "recipient1";
    private static final String FIRST_MSG_FOR_RECIPIENT_ONE = "first message for recipient1";
    private static final String RECIPIENT_TWO = "recipient2";
    private static final String SECOND_MSG_FOR_RECIPIENT_TWO = "second message for recipient2";
    private Message currentMessage;

    @Before
    public void setUp() throws Exception {
        collections1 = new Collections1();
    }

    @Test
    public void testDeliverMessageForRecipientOne() {
        givenFirstMessageForRecipientOne();
        whenSendMessage();
        thenMessageReceivedByRecipientOne();
    }

    @Test
    public void testDeliverMessagesForRecipientsOneAndTwo() {
        givenFirstMessageForRecipientOne();
        whenSendMessage();
        givenFirstMessageForRecipientTwo();
        whenSendMessage();
        thenMessageReceivedByRecipientOne();
        thenMessageReceivedByRecipientTwo();
    }

    private void givenFirstMessageForRecipientOne() {
        currentMessage = new Message();
        currentMessage.setRecipient(RECIPIENT_ONE);
        currentMessage.setText(FIRST_MSG_FOR_RECIPIENT_ONE);
    }

    private void givenFirstMessageForRecipientTwo() {
        currentMessage = new Message();
        currentMessage.setRecipient(RECIPIENT_TWO);
        currentMessage.setText(SECOND_MSG_FOR_RECIPIENT_TWO);
    }

    private void whenSendMessage() {
        collections1.sendMessage(currentMessage);
    }

    private void thenMessageReceivedByRecipientOne() {
        Message receivedMsg = collections1.nextMessage();
        assertTrue(receivedMsg.isForRecipient(RECIPIENT_ONE));
        assertEquals(FIRST_MSG_FOR_RECIPIENT_ONE,
                receivedMsg.getText(RECIPIENT_ONE));
    }

    private void thenMessageReceivedByRecipientTwo() {
        Message receivedMsg = collections1.nextMessage();
        assertTrue(receivedMsg.isForRecipient(RECIPIENT_TWO));
        assertEquals(SECOND_MSG_FOR_RECIPIENT_TWO,
                receivedMsg.getText(RECIPIENT_TWO));
    }
}