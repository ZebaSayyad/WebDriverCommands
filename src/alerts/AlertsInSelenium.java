package alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsInSelenium {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///D:/Selenium/Alert/SimpleAlert.html");
		
		driver.findElement(By.xpath("//button[contains(text(),'Click Me')]")).click();
		
		Alert alert=driver.switchTo().alert();
		
		String text=alert.getText();
		System.out.println("Text is :"+text);
		
		Thread.sleep(3000);
		
		alert.accept();
		

	}

}
