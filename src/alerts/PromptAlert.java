package alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlert {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
		driver.findElement(By.xpath("(//button[@class='btn btn-default btn-lg'])[2]")).click();
	//	Thread.sleep(3000);
		
		driver.switchTo().alert().sendKeys("zeba");
		//promptAlert.sendKeys("Zeba");
		//promptAlert.sendKeys("11");
		
		
//		String text = promptAlert.getText();
//		System.out.println("Text is:" + text);
//		promptAlert.sendKeys("Hello");
//		promptAlert.sendKeys("25");
	//	promptAlert.accept();
	}
}
