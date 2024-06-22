package aparna_seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class classnamelocators {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sap3\\Desktop\\lib\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://neilpatel.com/ubersuggest/");
		
		WebElement search=driver.findElement(By.className("field-keyword"));
		
		search.sendKeys("selenium webdriver");
		
		

	}

}
