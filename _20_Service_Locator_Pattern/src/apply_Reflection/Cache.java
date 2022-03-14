package apply_Reflection;

import java.util.ArrayList;
import java.util.List;

public class Cache {
	private static final List<MessagingService> SERVICES = new ArrayList<>();

	public MessagingService getService(String serviceName) {
		for (MessagingService messagingService : SERVICES) {
			if (messagingService.getClass().getCanonicalName().equals(serviceName)) {
				return messagingService;
			}
		}
		return null;
	}

	public void addService(MessagingService newService) {
		SERVICES.add(newService);
	}
}
