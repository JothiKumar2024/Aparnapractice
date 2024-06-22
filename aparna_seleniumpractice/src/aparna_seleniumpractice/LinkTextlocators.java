package aparna_seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTextlocators {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sap3\\Desktop\\selenium Libr\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
//	WebElement create=driver.findElement(By.linkText("Create new account"));
//	create.click();
		WebElement create=driver.findElement(By.partialLinkText("Create "));
		create.click();
		
		//driver.close();

	}

}
