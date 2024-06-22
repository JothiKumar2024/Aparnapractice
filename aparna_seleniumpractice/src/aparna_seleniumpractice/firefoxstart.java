package aparna_seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firefoxstart {

	public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\sap3\\Desktop\\selenium Libr\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.airbnb.co.in/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@type='button']")).click();
		
		
		driver.close();

	}

}
