package Frames;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.toolsqa.com/iframe-practice-page/");
		
		WebElement frame=driver.findElement(By.id("IF2"));
		
		int list=driver.findElements(By.tagName("iframe")).size();
		System.out.println("List is :"+list);
		
		//by index
		driver.switchTo().frame(3);
		
		//by id or name
		driver.switchTo().frame("IF2");
		
		//by WebElement
		driver.switchTo().frame(frame);
		
		//back to main page
		driver.switchTo().defaultContent();
	}

}
