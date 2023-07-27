package Session;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestSession {

	public static void main(String[] args) throws InterruptedException {

		// Web Driver Setup
		WebDriverManager.chromedriver().setup();

		// Web Driver Object
		WebDriver driver = new ChromeDriver();
		
		
		
		
		driver.get("https://demo.zeuz.ai/web/level/one/actions/save_text");
		
		WebElement randomTextElement = driver.findElement(By.xpath("//*[@id=\"randomText\"]"));
		
		String randomText = randomTextElement.getText();
		
		WebElement searchBox = driver.findElement(By.id("enter_text"));
		
		searchBox.sendKeys(randomText);
		
	    WebElement button = driver.findElement (By.id("verify_id"));
	    button.click();
			
		
		
	}

}
