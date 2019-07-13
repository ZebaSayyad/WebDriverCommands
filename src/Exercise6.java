import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise6 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		String url="https://www.toolsqa.com/automation-practice-form/";
		
		driver.navigate().to(url);
		
		//1
		List<WebElement> a=driver.findElements(By.name("sex"));
		
		if(a.get(0).isSelected()==false)
		{
			a.get(1).click();
		}
		else
		{
			a.get(0).click();
		}
		
		//2
		List<WebElement> exp=driver.findElements(By.name("exp"));
		
		if(exp.get(2).isSelected()==false)
		{
			exp.get(2).click();
		}
		
		//3
		List<WebElement> prof=driver.findElements(By.name("profession"));
		int iSize=prof.size();
		
		for(int i=0;i<iSize;i++) {
			
			String sValue=prof.get(i).getAttribute("value");
			
			if(sValue.equalsIgnoreCase("Automation Tester"))
			{
				prof.get(i).click();
				break;
			}
		}
		
		//4
		WebElement sele=driver.findElement(By.cssSelector(("#tool-1")));
		sele.click();

	}

}
