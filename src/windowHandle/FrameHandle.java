package windowHandle;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandle {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.redbus.in/");
		String parent=driver.getWindowHandle();
		System.out.println("handle is :"+parent);
		
		
		/*
		 * driver.findElement(By.xpath("//a[contains(text(),'India')]")).click();
		 * driver.findElement(By.xpath("//a[contains(text(),'Singapore')]")).click();
		 * driver.findElement(By.xpath("//a[contains(text(),'Malaysia')]")).click();
		 * driver.findElement(By.xpath("//a[contains(text(),'Indonesia')]")).click();
		 * driver.findElement(By.xpath("//a[contains(text(),'Peru')]")).click();
		 * driver.findElement(By.xpath("//a[contains(text(),'Colombia')]")).click();
		 */	
		
		WebDriver driver1=new ChromeDriver() ;
		driver1.navigate().to("https://www.flipkart.com/");

		Set<String> list=driver.getWindowHandles();
		System.out.println("List is"+list);
		/*
		 * for (String child : list) { if(!parent.equals(child)) { driver.switchTo().
		 * 
		 * 
		 * }
		 * 
		 * }
		 */

	}

}
