package actionClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovement {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
	    
		driver.get("https://www.amazon.in/");
		
		WebElement element=driver.findElement(By.xpath("//span[contains(text(),'Hello, Sign in')]"));
		element.click();
		
		driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("zebatanveer.2013@gmail.com");
		
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		
		driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("zeba9823");
		
		driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
		
		Actions action=new Actions(driver);
		
		WebElement element1=driver.findElement(By.xpath("//span[contains(text(),'Hello, Sign in')]"));
		element1.click();
		
		
		
		action.moveToElement(element).build().perform();
					
	   driver.findElement(By.xpath("//span[contains(text(),'Sign Out')]")).click();
		


		/*
		 * driver.findElement(By.xpath("//span[contains(text(),'Hello, Sign in')]")).
		 * click();
		 * 
		 * driver.findElement(By.xpath("//span[contains(text(),'Sign Out')]")).click();
		 */	}

}
