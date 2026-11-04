public class NotificationRequest {

    private String receipient;
    private String subject;
    private String message;
    private NOTIFICATIONTYPE type;

    // Getter for receipient
    public String getReceipient() {
        return receipient;
    }

    // Setter for receipient
    public void setReceipient(String receipient) {
        this.receipient = receipient;
    }

    // Getter for subject
    public String getSubject() {
        return subject;
    }

    // Setter for subject
    public void setSubject(String subject) {
        this.subject = subject;
    }

    // Getter for message
    public String getMessage() {
        return message;
    }

    // Setter for message
    public void setMessage(String message) {
        this.message = message;
    }

    // Getter for type
    public NOTIFICATIONTYPE getType() {
        return type;
    }

    // Setter for type
    public void setType(NOTIFICATIONTYPE type) {
        this.type = type;
    }

}
