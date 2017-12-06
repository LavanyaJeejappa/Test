package generic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LaunchBrowser2 implements AutoConst {

		@Test
		public void BroswerLaunch() throws InterruptedException
		{
		//System.setProperty(GECKO_KEY, GECKO_VALUE);
		//WebDriver driver=new FirefoxDriver();
			
		System.setProperty(CHROME_KEY,CHROME_VALUE);
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		/*String url=System.getProperty("url");
		System.out.println("---------URL IS "+url);
		Thread.sleep(30);
		String username=System.getProperty("username");
		System.out.println("---------USERNAME IS "+username);*/
		
		driver.findElement(By.id("pass")).sendKeys("lav888");
		driver.findElement(By.id("u_0_5")).click();
		
		
		
		}


}
