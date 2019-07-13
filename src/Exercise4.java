import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise4 {

	public static void main(String[] args) throws Exception {

		// 1
		System.setProperty("Webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// 2
		String url = "https://www.toolsqa.com/automation-practice-form/";
		driver.get(url);

		// 3
		driver.findElement(By.name("firstname")).sendKeys("Zeba");
		driver.findElement(By.name("lastname")).sendKeys("Sayyad");

		// 4
		driver.findElement(By.xpath("//button[@id='submit']")).click();

	}

}
