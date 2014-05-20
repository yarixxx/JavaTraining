package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class MessageBox {
    private List<Message> messages = new ArrayList<Message>();

    public void newMessage(Message message) {
        messages.add(message);
    }

    public List<Message> receiveMessages(String recipient) {
        Iterator<Message> it = messages.iterator();
        List<Message> messagesForRecipient = new ArrayList<Message>();
        while(it.hasNext()) {
            Message message = it.next();
            if (message.isForRecipient(recipient)) {
                //messages.remove(message); // ConcurrentModificationException
                it.remove();
                messagesForRecipient.add(message);
            }
        }
        return messagesForRecipient;
    }
}
