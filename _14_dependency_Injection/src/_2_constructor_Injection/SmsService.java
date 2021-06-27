package _2_constructor_Injection;

public class SmsService implements MessageService {
	@Override
	public void sendMessage(String message) {
		System.out.println("Sms message: " + message);
	}
}
