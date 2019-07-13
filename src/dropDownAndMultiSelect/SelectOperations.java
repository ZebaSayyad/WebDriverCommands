package dropDownAndMultiSelect;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectOperations {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		WebElement element=driver.findElement(By.id("day"));
		Select day=new Select(element);
        day.selectByIndex(13);		
		
        WebElement element1=driver.findElement(By.id("month"));
        Select month=new Select(element1);
		month.selectByVisibleText("Mar");
		
		WebElement element2=driver.findElement(By.name("birthday_year"));
		Select year=new Select(element2);
		year.selectByValue("2000");
		

		/*
		 * List<WebElement> elementCount=month.getOptions();
		 * System.out.println("Options are :"+elementCount);
		 * System.out.println("Total month count is :"+elementCount.size());
		 */		
		
		WebElement element3=driver.findElement(By.xpath("//select[@name='birthday_month']"));
		
		List <WebElement> options=element3.findElements(By.tagName("option"));
		//System.out.println("options are :"+options);
		//System.out.println("options are :"+options.forEach(r(x -> x.));
		
		options.forEach(x -> System.out.println(" suggested by mitthu "+x.getText()));
		
		int iSize=options.size();
		/*
		 * for(int i=0;i<iSize;i++) { String sValue=options.get(i).getText();
		 * System.out.println(sValue); }
		 */
		
	}

}
