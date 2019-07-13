package alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationAlert {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///D:/Selenium/Alert/ConfirmationAlert.html");
		
		driver.findElement(By.xpath("//button[contains(text(),'Click Me')]")).click();
		
		Thread.sleep(2000);
		
		Alert confirmationAlert=driver.switchTo().alert();
		String text=confirmationAlert.getText();
		System.out.println("Confirmation Alert :"+confirmationAlert);
		confirmationAlert.dismiss();
		
	}

}
