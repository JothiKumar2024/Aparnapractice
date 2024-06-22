package aparna_seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssselectorlocators {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sap3\\Desktop\\lib\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		/*
		//tag and id
		WebElement email=driver.findElement(By.cssSelector("input#email"));
		email.sendKeys("jothi1563");
		
		WebElement pwd=driver.findElement(By.cssSelector("input#pass"));
		pwd.sendKeys("1582365");
		*/
		
		//tag and class
		WebElement email=driver.findElement(By.cssSelector("input.inputtext"));
		email.sendKeys("jothi1563");
		//tag and attribute 
		WebElement pwd=driver.findElement(By.cssSelector("input[data-testid='royal_pass']"));
		pwd.sendKeys("1582365");
		
	}

}
