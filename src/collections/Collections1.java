package collections;

import java.util.LinkedList;

public class Collections1 {
    private final LinkedList<Message> messages;

    Collections1() {
        messages = new LinkedList<Message>();
    }

    int queueLength() {
        return messages.size();
    }

    public boolean sendMessage(Message message) {
        return messages.offer(message);
    }

    public Message nextMessage() {
        if (!messages.isEmpty()) {
            return messages.remove();
        }
        return null;
    }
}
