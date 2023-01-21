package LoginTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Saucedemo {

	public static void main(String[] args) throws InterruptedException {
	//Web Driver Setup
		WebDriverManager.chromedriver().setup();

		
	//Web Driver Object	
		WebDriver driver = new ChromeDriver();
		
	//Go to the URL
		driver.get("http://www.saucedemo.com/");
		
		
	//Find the "username" field
		WebElement username_element = driver.findElement(By.id("user-name"));
		
	//write on it
		username_element.sendKeys("standard_user");	
		
	//Find the "password" field
		WebElement pass_element = driver.findElement(By.id("password"));	
		pass_element.sendKeys("secret_sauce");
		
		
	//Find the "login" button	
		WebElement button_login = driver.findElement(By.id("login-button"));
		button_login.click();
		
	//After Login Check (is it really logged in?)
		WebElement addtocart_element = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
		String addtocarttext=addtocart_element.getText();
		System.out.println(addtocarttext);
		
		if(addtocarttext.equals("ADD TO CART")) {
			System.out.println("Login Succesfull");
		} else 
			System.out.println("Login Failed");
		
	//Work Done! close the window
		Thread.sleep(3000);
		driver.close();
	}

}
