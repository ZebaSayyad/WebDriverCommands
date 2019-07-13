package WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.redbus.in/");
		
		driver.findElement(By.id("onward_cal"));
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//div[@id='rb-calendar_return_cal']//tbody/tr[4]/td[4]")).click();
		
		
	}//*[@id='rb-calendar_onward_cal']/table/tbody/tr[4]/td[4]

}
