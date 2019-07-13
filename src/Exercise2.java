import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise2 {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		//1
		String url="https://www.myntra.com/";
		driver.get(url);
		
		//2
		driver.findElement(By.xpath("//a[contains(text(),'Women')]")).click();
		
		Thread.sleep(3000);
		
		//3
		driver.close();
	}

}
