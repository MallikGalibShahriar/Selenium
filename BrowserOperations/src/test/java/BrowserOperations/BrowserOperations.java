package BrowserOperations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserOperations {

	public static void main(String[] args) throws InterruptedException {
		
		//Web Driver Setup
			WebDriverManager.chromedriver().setup();

			
		//Web Driver Object	
			WebDriver driver = new ChromeDriver();
			
		//Go to the URL	(both commands are almost doing the same)
			driver.get("http://www.bkash.com/");
			String originalWindow = driver.getWindowHandle();
			driver.navigate().to("http://nagad.com.bd/");
			
		//Wait 10 second (parameter is in millisecond)	
			Thread.sleep(1000);
			
		//Get current url
			System.out.println(driver.getCurrentUrl());

		//Get title
			System.out.println(driver.getTitle());
			
		//Forward , Back , Refresh
			driver.navigate().back();
			Thread.sleep(1000);
			driver.navigate().forward();
			Thread.sleep(4000);
			driver.navigate().refresh();
			
		//Open new window and switch to the window
			driver.switchTo().newWindow(WindowType.WINDOW);

		//Open new tab and switch to the tab
			driver.switchTo().newWindow(WindowType.TAB);

			
		//Switching windows
			//String originalWindow = driver.getWindowHandle(); --> LINE 22
			driver.switchTo().window(originalWindow);
	
			
		//Window Close	
			Thread.sleep(5000);
			driver.quit();
		

}
}