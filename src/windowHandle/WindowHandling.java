package windowHandle;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {
	
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.google.com/intl/en-GB/gmail/about/#");
	String parent=driver.getWindowHandle();
	System.out.println("Parent window handle"+parent);
	driver.findElement(By.xpath("(//a[contains(text(),'Create an account')])[1]")).click();
	Thread.sleep(4000);
	Set<String> list=driver.getWindowHandles();
	System.out.println("List are :"+list);
	for (String child : list) {
		if(!parent.equals(child))
		{
			driver.switchTo().window(child);
			driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("ZebaFromTester");
			driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("drdrdrl");

		}
		
	}
	
	/*String handle=driver.getWindowHandle();
	System.out.println("Handle is :"+handle);
	
	Set<String> handles=driver.getWindowHandles();
	System.out.println("Handles are :"+handles);
	
	driver.switchTo().window("");*/
	}

}
