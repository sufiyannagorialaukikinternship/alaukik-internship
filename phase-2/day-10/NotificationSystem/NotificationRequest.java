public class NotificationRequest {

    private String receipient;
    private String subject;
    private String message;
    private NOTIFICATIONTYPE type;


    public String getReceipient() {
        return receipient;
    }


    public void setReceipient(String receipient) {
        this.receipient = receipient;
    }


    public String getSubject() {
        return subject;
    }


    public void setSubject(String subject) {
        this.subject = subject;
    }


    public String getMessage() {
        return message;
    }


    public void setMessage(String message) {
        this.message = message;
    }


    public NOTIFICATIONTYPE getType() {
        return type;
    }


    public void setType(NOTIFICATIONTYPE type) {
        this.type = type;
    }

}
