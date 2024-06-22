package Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tagnamelocators {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sap3\\Desktop\\lib\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.ae/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(4000);
		List<WebElement> links=driver.findElements(By.tagName("a"));
		int count=links.size();
		System.out.println("Number of links "+count);
		for(int i=0;i<count;i++)
		{
			String name=links.get(i).getText();
			System.out.println(name);
		}
	}

}
