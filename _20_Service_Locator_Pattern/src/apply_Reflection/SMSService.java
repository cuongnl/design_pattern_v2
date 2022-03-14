package apply_Reflection;

public class SMSService implements MessagingService{
	public String getMessageBody() {
        return "This is message body of SMS message";
    }
 
    public String getServiceName() {
        return "SMSService";
    }
}
