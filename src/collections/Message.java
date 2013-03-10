package collections;

public class Message {
    private String text;
    private String recipient;

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
        if (this.recipient == recipient) {
            return text;
        }
        return null;
    }
}
