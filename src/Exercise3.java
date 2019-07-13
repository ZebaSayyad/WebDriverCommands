import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise3 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		//1
		String url="https://www.facebook.com/";
		driver.navigate().to(url);
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		
		
		//2
		driver.navigate().back();
		
		//3
		driver.navigate().forward();
		
		//4
		driver.get(url);
		
		//5
		driver.navigate().refresh();
		
		//6
		driver.close();
	}

}
