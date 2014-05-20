package collections;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class TestMessageBox {
    private MessageBox messageBox = new MessageBox();

    private Message message1ForPerson1 = new Message("Person1", "Some message text for Person1");
    private Message message2ForPerson1 = new Message("Person1", "Some other message text for Person1");
    private Message message1ForPerson2 = new Message("Person2", "Some message text for Person2");

    private Message[] messagesForPerson1 = {message1ForPerson1, message2ForPerson1};
    private Message[] messagesForPerson2 = {message1ForPerson2};
    private Message[] noMessages = {};

    @Test
    public void testMessageBox() {
        messageBox.newMessage(message1ForPerson1);
        messageBox.newMessage(message2ForPerson1);
        messageBox.newMessage(message1ForPerson2);

        assertEquals(Arrays.asList(messagesForPerson1), messageBox.receiveMessages("Person1"));
        assertEquals(Arrays.asList(messagesForPerson2), messageBox.receiveMessages("Person2"));
        assertEquals(Collections.EMPTY_LIST, messageBox.receiveMessages("Person1"));
        assertEquals(Collections.EMPTY_LIST, messageBox.receiveMessages("Person2"));
    }
}
