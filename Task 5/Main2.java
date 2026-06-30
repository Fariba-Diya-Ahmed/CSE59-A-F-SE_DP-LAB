interface messageSender{
    void sendMessage(String msg);
}

class EmailSender implements messageSender{
    public void sendMessage(String msg){
        System.out.println("Sending Email: " + msg);
    }
}

class SMSSender implements messageSender{
    public void sendMessage(String msg){
        System.out.println("Sending SMS: "+ msg);
    }
}

class NotificationService{
    private messageSender s;

    public NotificationService(messageSender s){
        this.s = s;
    }

    public void alterUser(String msg){
        s.sendMessage(msg);
    }
}

public class Main2{
    public static void main(String[] args) {
        messageSender email = new EmailSender();

        NotificationService notif1 = new NotificationService(email);
        notif1.alterUser("Notification via Email");

        messageSender sms = new SMSSender();

        NotificationService notif2 = new NotificationService(sms);
        notif2.alterUser("Notification via SMS");
    }
}
