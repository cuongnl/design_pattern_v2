package apply_basic;

public class ServiceLocatorPatternExample {
	public static void main(String[] args) {
		MessagingService service = ServiceLocator.getService("EmailService");
		System.out.println(service.getMessageBody());

		MessagingService smsService = ServiceLocator.getService("SMSService");
		System.out.println(smsService.getMessageBody());

		MessagingService emailService = ServiceLocator.getService("EmailService");
		System.out.println(emailService.getMessageBody());
	}
}
