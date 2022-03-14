package apply_basic;

public class EmailService implements MessagingService {

	@Override
	public String getMessageBody() {
		return "This is message body of Email message";
	}

	@Override
	public String getServiceName() {
		return "EmailService";
	}

}
