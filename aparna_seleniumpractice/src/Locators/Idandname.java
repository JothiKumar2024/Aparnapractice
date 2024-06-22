package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Idandname {
	static WebElement email,pass,btn; 
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sap3\\Desktop\\selenium Libr\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://accounts.lambdatest.com/login");
		
		driver.manage().window().maximize();
		
		Thread.sleep(4000);
		
		email=driver.findElement(By.id("email"));
		email.sendKeys("jothikumar2021@gmail.com");
		
		pass=driver.findElement(By.name("password"));
		pass.sendKeys("demo1234");
		
		btn=driver.findElement(By.id("login-button"));
		btn.click();
		
		Thread.sleep(4000);
		String name=driver.getTitle();
		
		String url=driver.getCurrentUrl();
		
		System.out.println("Title is "+name);
		
		System.out.println("URL  is "+url);
		
		
	

	}

}
