package collections;

public class Message {
    private String text;
    private String recipient;

    public Message(String recipient, String text) {
        this.recipient = recipient;
        this.text = text;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public boolean isForRecipient(String recipient) {
        return this.recipient == recipient;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getText(String recipient) {
        if (isForRecipient(recipient)) {
            return text;
        }
        return null;
    }
}
