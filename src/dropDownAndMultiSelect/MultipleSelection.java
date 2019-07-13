package dropDownAndMultiSelect;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleSelection {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		
		WebElement element=driver.findElement(By.name("selenium_commands"));
		Select select=new Select(element);
		
		select.selectByIndex(0);
		select.deselectByIndex(0);
		
		select.selectByVisibleText("Navigation Commands");
		select.deselectByVisibleText("Navigation Commands");
		
		List<WebElement> elements=driver.findElements(By.id("selenium_commands"));
        int iSize=elements.size();
        for(int index=0;index<iSize;index++)
        {	
			  String sValue=elements.get(index).getText();
			  System.out.println("Values are:"+sValue);
			  }
        
        select.selectByVisibleText("Browser Commands");
        select.selectByVisibleText("Navigation Commands");
        select.selectByVisibleText("Switch Commands");
        select.selectByVisibleText("Wait Commands");
        select.selectByVisibleText("WebElement Commands");
		
	}

}
