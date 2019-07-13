package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class RightClick {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://demoqa.com/tooltip-and-double-click/");

		Actions actions = new Actions(driver);

		WebElement element = driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
		actions.contextClick(element).perform();
	
		WebElement element1=driver.findElement(By.xpath("//div[contains(text(),'Copy Me')]"));
		element1.click();
		
		Select select=new Select(element1);
		select.selectByVisibleText("Copy Me");
		/*
		 * WebElement elementOpen = driver.findElement(By.xpath(
		 * "//div[@onclick=\"callOnItemClick('"
		 * )); elementOpen.click(); Thread.sleep(3000);
		 * System.out.println(driver.switchTo().alert().getText());
		 */	}

}
