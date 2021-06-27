package _1_problem_new_keyword;

public class UserController {
	private EmailService emailService = new EmailService();
	 
    public void send() {
        emailService.sendEmail("Hello Dependency injection pattern");
    }
}
