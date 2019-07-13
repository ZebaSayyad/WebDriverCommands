import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise5 {

	public static void main(String[] args) {

		// 1
		System.setProperty("Webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//2
		String url = "https://www.toolsqa.com/automation-practice-form/";
		driver.get(url);

		//3
		driver.findElement(By.partialLinkText("Partial")).click();
		
		//4
		WebElement tagName=driver.findElement(By.tagName("button"));
		System.out.println("Tag Name is :"+tagName);
		
		//5
		driver.findElement(By.linkText("Link Test")).click();
		

	}

}
