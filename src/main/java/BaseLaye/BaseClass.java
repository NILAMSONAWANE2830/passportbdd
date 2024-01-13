package BaseLaye;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	
	public static WebDriver driver;
	public static void intilization() {
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\AllDrivers\\chromedriver.exe");
		
		//upcasting
		
		driver =new ChromeDriver();
		
		//maximizeing windw
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		
		driver.manage().deleteAllCookies();
		driver.get("https://portal2.passportindia.gov.in/AppOnlineProject/user/RegistrationBaseAction?request_locale=en");
		
		
		
		
	}

}
