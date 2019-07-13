package windowHandle;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise2 {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
	
		driver.get("http://toolsqa.com/automation-practice-switch-windows/");
		//3
		String parent=driver.getWindowHandle();
		System.out.println("Parent handle is :"+parent);
	
		//4
		driver.findElement(By.xpath("//button[contains(text(),'Alert Box')]")).click();

		Thread.sleep(2000);
		

		Alert alert=driver.switchTo().alert();
		alert.accept();
		
	}

}
