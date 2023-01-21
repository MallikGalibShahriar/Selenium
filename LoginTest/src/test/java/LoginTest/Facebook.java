package LoginTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
	//Web Driver Setup
		WebDriverManager.chromedriver().setup();

		
	//Web Driver Object	
		WebDriver driver = new ChromeDriver();
		
	//Go to the URL	(both are same)
		driver.get("http://www.facebook.com/");
		
		Thread.sleep(1000);
		
		//Email field
		//finding field in inspect
		WebElement element = driver.findElement(By.id("email"));
		//write on it
		element.sendKeys("galib");
		
		Thread.sleep(1000);
		
		//PasswordField
		//finding field in inspect
		driver.findElement(By.id("pass")).sendKeys("1234567");
		
		Thread.sleep(1000);

		
		//Click Login Button
			//finding login in inspect
				element = driver.findElement(By.className("_6ltg"));
			//click on it
				element.click();
		
	}

}
