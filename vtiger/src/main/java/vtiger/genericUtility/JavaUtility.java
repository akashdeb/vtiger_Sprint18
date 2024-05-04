package vtiger.genericUtility;

import java.util.Date;
import java.util.Random;

public class JavaUtility {
	
	public String generateSystemDateTime() {
		Date date = new Date();
		return date.toString().replace(" ", "_").replace(":", "_");
	}
	
	public int generateRandomNo(int limit) {
		Random random = new Random();
		return random.nextInt(limit);
	}
}
