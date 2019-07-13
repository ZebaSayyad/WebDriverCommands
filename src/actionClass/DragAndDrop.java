package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
	    
		driver.get("https://jqueryui.com/droppable/");
		
		WebElement src=driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement tar=driver.findElement(By.xpath("//div[@id='droppable']"));
		
		Actions actions=new Actions(driver);
		
		Action action=actions.clickAndHold(src).moveToElement(tar).release(tar).build();
		action.perform();
		
		
		driver.close();
	}

}
