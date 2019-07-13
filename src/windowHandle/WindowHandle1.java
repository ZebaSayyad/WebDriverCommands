package windowHandle;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle1 {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.redbus.in/");
		String handle=driver.getWindowHandle();
		System.out.println("handle is :"+handle);
		
		driver.findElement(By.xpath("//a[contains(text(),'India')]")).click();
		
		Set<String> list=driver.getWindowHandles();
		System.out.println("handles are :"+list);
		
		for(String child:list)
		{
			if(!handle.equals(child))
			{
				driver.switchTo().window(child);
				driver.findElement(By.xpath("//input[@class='db'][@id='src']")).sendKeys("Beed");
				driver.findElement(By.xpath("//input[@id='dest']")).sendKeys("Pune");
				
			}
		}
	
		
		
	}

}
