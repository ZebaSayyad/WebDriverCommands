package MultipleWindow;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindow {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.toolsqa.com/automation-practice-switch-windows/");
		
		WebElement element=driver.findElement(By.id("button1"));
		
		for(int i=0;i<3;i++)
		{
			element.click();
			Thread.sleep(2000);
		}
		
		Set<String> list=driver.getWindowHandles();
		
		for(String child:list)
		{
			System.out.println("Window handle"+child);
		}
		
		driver.close();
	}

}
