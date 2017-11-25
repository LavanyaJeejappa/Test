package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class LaunchBrowser implements AutoConst{

		@Test
		public void BroswerLaunch()
		{
		System.setProperty(GECKO_KEY, GECKO_VALUE);
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://www.facebook.com");
		
		}


}
