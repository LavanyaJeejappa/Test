package generic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class LaunchBrowser implements AutoConst{

		@Test
		public void BroswerLaunch() throws InterruptedException
		{
			
		System.setProperty(GECKO_KEY, GECKO_VALUE);
		WebDriver driver=new FirefoxDriver();
		
		/*driver.get("http://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("lavanyajlav");
		
		System.setProperty(CHROME_KEY,CHROME_VALUE);
		WebDriver driver=new ChromeDriver();*/
		
		driver.get("https://www.google.co.in/");
		Thread.sleep(30);
		driver.findElement(By.id("lst-ib")).sendKeys("selenium");
		driver.findElement(By.name("btnK")).submit();
		
		
		}
		


}
