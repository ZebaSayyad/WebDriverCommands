import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		//1 
		
		driver.navigate().to("https://www.olx.in/");
		driver.findElement(By.xpath("//span[contains(text(),'Login')]")).click();
		//2
		driver.navigate().forward();
		
		//3
		driver.navigate().back();
		
		//4
		driver.navigate().refresh();
	}

}
