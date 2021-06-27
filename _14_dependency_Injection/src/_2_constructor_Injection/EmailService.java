package _2_constructor_Injection;

public class EmailService implements MessageService {
	@Override
	public void sendMessage(String message) {
		System.out.println("Email message: " + message);
	}
}
