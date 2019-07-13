package actionClass;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://demoqa.com/tooltip-and-double-click/");

		Actions actions = new Actions(driver);
		
		WebElement element=driver.findElement(By.id("doubleClickBtn"));
		
		actions.doubleClick(element).perform();
		
		Alert alert=driver.switchTo().alert();
		alert.accept();
		
		driver.close();

	}

}
