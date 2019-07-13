import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		List<WebElement> chkBox=driver.findElements(By.name("toolsqa"));
		
		int iSize=chkBox.size();
		
		for(int i=0;i<iSize;i++) {
			
			String sValue=chkBox.get(i).getAttribute("value");
			
			if(sValue.equalsIgnoreCase("toolsqa"))
			{
				chkBox.get(i).click();
				
				break;
			}
		}
		

	}

}
