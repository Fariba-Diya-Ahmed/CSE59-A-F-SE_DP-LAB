interface MessageSender {
    void sendMessage(String message);
}

class EmailSender implements MessageSender {

    public void sendMessage(String message) {
        System.out.println("Sending email: " + message);
    }
}

class SMSSender implements MessageSender {

    public void sendMessage(String message) {
        System.out.println("Sending SMS: " + message);
    }
}

class NotificationService {

    private MessageSender sender;

    public NotificationService(MessageSender sender) {
        this.sender = sender;
    }

    public void alertUser(String msg) {
        sender.sendMessage(msg);
    }
}

public class Main {
    public static void main(String[] args) {

        MessageSender email = new EmailSender();
        NotificationService ns1 = new NotificationService(email);
        ns1.alertUser("Hello via Email");

        MessageSender sms = new SMSSender();
        NotificationService ns2 = new NotificationService(sms);
        ns2.alertUser("Hello via SMS");
    }
}
