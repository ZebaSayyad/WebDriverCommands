package dropDownAndMultiSelect;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Exercise1 {
	
	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.toolsqa.com/automation-practice-form/");
	
	WebElement element=driver.findElement(By.id("continents"));
	Select continents=new Select(element);
	
	continents.selectByIndex(1);
	
	continents.selectByVisibleText("Africa");
	
	List<WebElement> options=driver.findElements(By.id("continents"));
	int iSize=options.size();
	
	for(int i=0;i<iSize;i++)
	{
		String sValue=options.get(i).getText();
		System.out.println("options are:"+"\n"+sValue);
		
		continents.selectByVisibleText("Antartica");
	}
	}
}
