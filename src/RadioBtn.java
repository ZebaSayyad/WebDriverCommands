import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioBtn {

	public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		List<WebElement> radioBtn=driver.findElements(By.name(""));
		
		boolean bValue=false;
		
		bValue=radioBtn.get(0).isSelected();
		
		if(bValue==true) {
			
			radioBtn.get(1).click();
		}
		else
		{
			radioBtn.get(0).click();
		}
		
		
		
	}

}
