package windowHandle;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise1 {

	public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
	
		driver.get("http://toolsqa.com/automation-practice-switch-windows/");
		//3
		String parent=driver.getWindowHandle();
		System.out.println("Parent handle is :"+parent);
		
		//4
		driver.findElement(By.xpath("//button[contains(text(),'New Message Window')]")).click();
	
		Set<String> list=driver.getWindowHandles();
		System.out.println("List is :"+list);
		
		for(String child:list)
		{
			if(!parent.equals(child));
			driver.switchTo().window(child).close();
		}
	}
	

}
